package com.matt.forgehax.mods;

import com.matt.forgehax.asm.events.PacketEvent;
import com.matt.forgehax.util.command.Setting;
import com.matt.forgehax.util.mod.Category;
import com.matt.forgehax.util.mod.ToggleMod;
import com.matt.forgehax.util.mod.loader.RegisterMod;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.play.server.SPacketSpawnPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@RegisterMod
// TODO: rename this
public class ThisModIsDedicatedToUfoCrossing extends ToggleMod {

  private final Setting<String> message =
      getCommandStub()
          .builders()
          .<String>newSettingBuilder()
          .name("message")
          .description("Message to send")
          .defaultTo("hello uwu")
          .build();

  private final Setting<Integer> cooldown =
      getCommandStub()
          .builders()
          .<Integer>newSettingBuilder()
          .name("cooldown")
          .description("Minimum cooldown to be notified again of a player (in milliseconds)")
          .defaultTo(0)
          .build();

  public ThisModIsDedicatedToUfoCrossing() {
    super(Category.CHAT, "MessageNearby", false, "Automatically send a message to whoever comes into render distance");
  }

  private HashMap<UUID, Long> lastSeen = new HashMap<>();

  private boolean seenRecently(UUID player) {
    return lastSeen.containsKey(player) && ZonedDateTime.now().toInstant().toEpochMilli() - lastSeen.get(player) > cooldown.get();
  }

  @SubscribeEvent
  public void onPacketReceived(PacketEvent.Incoming.Pre event) {
    if (event.getPacket() instanceof SPacketSpawnPlayer) {
      final SPacketSpawnPlayer packet = event.getPacket();
      final UUID id = packet.getUniqueId();
      Optional.ofNullable(MC.getConnection().getPlayerInfo(id))
        .map(NetworkPlayerInfo::getGameProfile)
        .map(GameProfile::getName)
        .ifPresent(name -> {
          if(seenRecently(id)) {
            MC.player.sendChatMessage("/w " + name + " " + message.get());
            lastSeen.put(id, ZonedDateTime.now().toInstant().toEpochMilli());
          }
        });
    }
  }

}
