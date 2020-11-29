package com.matt.forgehax.util.mod;

import com.matt.forgehax.util.command.Setting;
import com.matt.forgehax.util.math.AlignHelper;
import com.matt.forgehax.util.math.AlignHelper.Align;
import com.matt.forgehax.asm.events.ResizeGameEvent;
import com.matt.forgehax.gui.PromptGui;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public abstract class HudMod extends ToggleMod {

  protected static ScaledResolution scaledRes = new ScaledResolution(MC);

  protected final Setting<Align> alignment;
  protected final Setting<Integer> offsetX;
  protected final Setting<Integer> offsetY;
  protected final Setting<Double> scale;

  protected abstract Align getDefaultAlignment();

  protected abstract int getDefaultOffsetX();

  protected abstract int getDefaultOffsetY();

  protected abstract double getDefaultScale();

  public HudMod(Category category, String modName, boolean defaultEnabled, String description) {
    super(category, modName, defaultEnabled, description);

    this.alignment =
        getCommandStub()
            .builders()
            .<Align>newSettingEnumBuilder()
            .name("alignment")
            .description("Align to corner")
            .defaultTo(getDefaultAlignment())
            .build();

    this.offsetX =
        getCommandStub()
            .builders()
            .<Integer>newSettingBuilder()
            .name("x-offset")
            .description("Shift on X-axis")
            .defaultTo(getDefaultOffsetX())
            .min(-10000)
            .max(10000)
            .build();

    this.offsetY =
        getCommandStub()
            .builders()
            .<Integer>newSettingBuilder()
            .name("y-offset")
            .description("Shift on Y-axis")
            .defaultTo(getDefaultOffsetY())
            .min(-10000)
            .max(10000)
            .build();

    this.scale =
        getCommandStub()
            .builders()
            .<Double>newSettingBuilder()
            .name("scale")
            .description("Size scaling")
            .defaultTo(getDefaultScale())
            .min(0D)
            .max(5D)
            .build();
  }

  // no need to recalc each frame but okay (on GuiScale and Settings change only)
  public final int getPosX(int extraOffset) {
    final int align = alignment.get().ordinal();
    final int dirSignX = AlignHelper.getFlowDirX2(align);
    return (extraOffset + offsetX.get()) * dirSignX + AlignHelper.alignH(scaledRes.getScaledWidth(), align);
  }

  public final int getPosY(int extraOffset) {
    final int align = alignment.get().ordinal();
    final int dirSignY = AlignHelper.getFlowDirY2(align);
    int chatOffset = 0;

    // Shift up when chat is open && alignment is at bottom
    if ((alignment.get() == Align.BOTTOMLEFT
        || alignment.get() == Align.BOTTOMRIGHT
        || alignment.get() == Align.BOTTOM)
        && (MC.currentScreen instanceof GuiChat ||
            MC.currentScreen instanceof PromptGui)) {
      chatOffset = Math.max(15 - offsetY.get(), 0);
    }

    return (extraOffset + offsetY.get()) * dirSignY + AlignHelper.alignV(scaledRes.getScaledHeight(), align) - chatOffset;
  }

  @SubscribeEvent
  public void onScreenUpdated(ResizeGameEvent ev) {
    scaledRes = new ScaledResolution(MC);
  }
}
