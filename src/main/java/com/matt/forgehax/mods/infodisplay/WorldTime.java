package com.matt.forgehax.mods.infodisplay;

import static com.matt.forgehax.Helper.getWorld;

import com.matt.forgehax.util.command.Setting;
import com.matt.forgehax.util.mod.Category;
import com.matt.forgehax.util.mod.ToggleMod;
import com.matt.forgehax.util.mod.loader.RegisterMod;
import com.matt.forgehax.asm.events.PacketEvent;
import com.matt.forgehax.events.LocalPlayerUpdateEvent;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.util.text.TextFormatting;

@RegisterMod
public class WorldTime extends ToggleMod {

  public final Setting<Boolean> server_sync =
    getCommandStub()
      .builders()
      .<Boolean>newSettingBuilder()
      .name("server-sync")
      .description("Force synchronization with server time")
      .defaultTo(false)
      .build();

  public final Setting<Boolean> slim =
    getCommandStub()
      .builders()
      .<Boolean>newSettingBuilder()
      .name("slim")
      .description("Show the time with a slimmer, real-like format")
      .defaultTo(false)
      .build();

  public final Setting<Boolean> force =
    getCommandStub()
      .builders()
      .<Boolean>newSettingBuilder()
      .name("force")
      .description("Force the game time to a specific one")
      .defaultTo(false)
      .build();

  public final Setting<Integer> target_time =
    getCommandStub()
      .builders()
      .<Integer>newSettingBuilder()
      .name("time")
      .description("Time to force the game at")
      .min(0)
      .max(24000)
      .defaultTo(18000)
      .changed(
        cb -> {
          if (force.get() && getWorld() != null)
            getWorld().setWorldTime(cb.getTo());
        })
      .build();

  public WorldTime() {
    super(Category.GUI, "WorldTime", false, "Shows the time in Minecraft world");
  }

  @Override
  public boolean isInfoDisplayElement() {
    return true;
  }

  private final int TPS = 20;
  private int time = 0;
  private long day = 0;

  @SubscribeEvent
  public void onPacketPreceived(PacketEvent.Incoming.Pre event) {
    if (server_sync.get() && event.getPacket() instanceof SPacketTimeUpdate) {
      time = (int) (((SPacketTimeUpdate) event.getPacket()).getWorldTime() % 24000L);
      day = ((SPacketTimeUpdate) event.getPacket()).getWorldTime() / 24000L;
      if (force.get()) event.setCanceled(true);
    }
  }

  @SubscribeEvent
  public void onUpdate(LocalPlayerUpdateEvent event) {
    if (force.get() && getWorld() != null)
      getWorld().setWorldTime(target_time.get());
  }

  public String getInfoDisplayText() {
    if (!server_sync.get()) {
      time = (int) (getWorld().getWorldTime() % 24000L);
      day = getWorld().getWorldTime() / 24000L;
    }
    if (slim.get()) {
      return String.format("Day %d, %s", day, translate(time));
    } else {
      return String.format(
        "Age: %d " + TextFormatting.GRAY + "\u23d0 " + TextFormatting.WHITE +"Time: %d/%d " + TextFormatting.GRAY +
        "[%s]" + TextFormatting.WHITE, day, time/TPS, getNextStep(time)/TPS, getTimePhase(time));
    }
  }

  private String getTimePhase(int time) {
    if (time > 23000) return "Dawn";
    if (time > 18500) return "Night";
    if (time > 17500) return "Midnight";
    if (time > 13000) return "Evening";
    if (time > 12000) return "Dusk";
    if (time > 6500) return "Afternoon";
    if (time > 5500) return "Noon";
    return "Morning";
  }

  private int getNextStep(int time) {
    if (time > 23000) return 24000;
    if (time > 13000) return 23000;
    if (time > 12000) return 13000;
    return 12000;
  }

  private String translate(int time) {
    int translated_time = (int) (((long) time * 1728000L) / 24000L); // "ticks" in a real day / ticks in minecraft
    return String.format("%02d:%02d", (int) translated_time/(3600*TPS), (int) (translated_time%(3600*TPS)/(60*TPS)));
  }
}
