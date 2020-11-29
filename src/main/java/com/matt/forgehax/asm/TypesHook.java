package com.matt.forgehax.asm;

import com.matt.forgehax.asm.utils.asmtype.ASMClass;
import com.matt.forgehax.asm.utils.asmtype.ASMField;
import com.matt.forgehax.asm.utils.asmtype.ASMMethod;
import com.matt.forgehax.asm.utils.asmtype.builders.ASMBuilders;
import net.minecraftforge.fml.common.eventhandler.Event;

import java.util.List;

/**
 * Created on 5/27/2017 by fr1kin
 */
public interface TypesHook {

  interface Classes {

    ASMClass ForgeHaxHooks =
      ASMBuilders.newClassBuilder().setClassName("com/matt/forgehax/asm/ForgeHaxHooks").build();
  }

  interface Fields {

	  ASMField ForgeHaxHooks_makeIsHittingBlockAlwaysFalse =
			  Classes.ForgeHaxHooks.childField()
			  .setName("makeIsHittingBlockAlwaysFalse")
			  .setType(boolean.class)
			  .build();
	  
    ASMField ForgeHaxHooks_isSafeWalkActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isSafeWalkActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isNoSlowDownActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isNoSlowDownActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isNoBoatGravityActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isNoBoatGravityActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isNoClampingActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isNoClampingActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isBoatSetYawActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isBoatSetYawActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isNotRowingBoatActivated =
      Classes.ForgeHaxHooks.childField()
        .setName("isNotRowingBoatActivated")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_doIncreaseTabListSize =
      Classes.ForgeHaxHooks.childField()
        .setName("doIncreaseTabListSize")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_isLiquidInteractEnabled =
      Classes.ForgeHaxHooks.childField()
        .setName("isLiquidInteractEnabled")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_preventArmorRendering =
      Classes.ForgeHaxHooks.childField()
        .setName("preventArmorRendering")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_doPreventGhostBlocksPlace =
      Classes.ForgeHaxHooks.childField()
        .setName("doPreventGhostBlocksPlace")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_doPreventGhostBlocksBreak =
      Classes.ForgeHaxHooks.childField()
        .setName("doPreventGhostBlocksBreak")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_doPreventMaxChatSize =
      Classes.ForgeHaxHooks.childField()
        .setName("doPreventChatSizeLimit")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_doHideChatBackground =
      Classes.ForgeHaxHooks.childField()
        .setName("doHideChatBackground")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_allowPlaceThroughEntities =
      Classes.ForgeHaxHooks.childField()
        .setName("allowPlaceThroughEntities")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_makeHandAlwaysInactive =
      Classes.ForgeHaxHooks.childField()
        .setName("makeHandAlwaysInactive")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_preventElytraSoundUpdate =
      Classes.ForgeHaxHooks.childField()
        .setName("preventElytraSoundUpdate")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_allowDifferentUserForFreecam =
      Classes.ForgeHaxHooks.childField()
        .setName("allowDifferentUserForFreecam")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_allowMovementInFreecam =
      Classes.ForgeHaxHooks.childField()
        .setName("allowMovementInFreecam")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_drawBlockHighlightInWater =
      Classes.ForgeHaxHooks.childField()
        .setName("drawBlockHighlightInWater")
        .setType(boolean.class)
        .build();

    ASMField ForgeHaxHooks_allowCameraClip =
      Classes.ForgeHaxHooks.childField()
        .setName("allowCameraClip")
        .setType(boolean.class)
        .build();

 	  ASMField ForgeHaxHooks_forceControlEntity =
	    Classes.ForgeHaxHooks.childField()
		    .setName("forceControlEntity")
		    .setType(boolean.class)
        .build();
        
 	  ASMField ForgeHaxHooks_forcedReach =
	    Classes.ForgeHaxHooks.childField()
		    .setName("forcedReach")
		    .setType(float.class)
		    .build();
  }

  interface Methods {
	  
	  ASMMethod ForgeHaxHooks_onUpdateFramebufferSize =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onUpdateFramebufferSize")
			  .setReturnType(boolean.class)
			  .emptyParameters()
			  .build();

	  ASMMethod ForgeHaxHooks_onHandleComponentClick =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onHandleComponentClick")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.GuiScreen)
			  .add(TypesMc.Classes.ITextComponent)
			  .add(TypesMc.Classes.ClickEvent)
			  .finish()
			  .build();
	  
	  ASMMethod ForgeHaxHooks_onRenderEntityItem3d =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderEntityItem3d")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.RenderItem)
			  .add(TypesMc.Classes.ItemStack)
			  .add(TypesMc.Classes.IBakedModel)
			  .finish()
			  .build();
	  
	  ASMMethod ForgeHaxHooks_onRenderEntityItem2d =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderEntityItem2d")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.RenderItem)
			  .add(TypesMc.Classes.ItemStack)
			  .add(TypesMc.Classes.IBakedModel)
			  .finish()
			  .build();
	  
	  ASMMethod ForgeHaxHooks_onRenderModel =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderModel")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.ModelBase)
			  .add(TypesMc.Classes.Entity)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .finish()
        .build();

	  ASMMethod ForgeHaxHooks_onRenderModelHead =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderModelHead")
			  .setReturnType(float.class)
			  .beginParameters()
			  .add(TypesMc.Classes.EntityLivingBase)
			  .add(float.class)
			  .finish()
			  .build();
        
	  ASMMethod ForgeHaxHooks_onApplyRotations =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onApplyRotations")
			  .setReturnType(float.class)
			  .beginParameters()
			  .add(TypesMc.Classes.EntityLivingBase)
			  .add(float.class)
			  .finish()
			  .build();
	  
	  ASMMethod ForgeHaxHooks_onRenderEnderCrystal =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderEnderCrystal")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.ModelBase)
			  .add(TypesMc.Classes.EntityEnderCrystal)
			  .add(float.class)
			  .add(float.class)
			  .finish()
			  .build();

	  ASMMethod ForgeHaxHooks_onRenderItemAndEffectIntoGui =
			  Classes.ForgeHaxHooks.childMethod()
			  .setName("onRenderItemAndEffectIntoGui")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(TypesMc.Classes.ItemStack)
			  .add(int.class)
			  .add(int.class)
			  .finish()
			  .build();

    ASMMethod ForgeHaxHooks_onHurtcamEffect =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onHurtcamEffect")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(float.class)
        .finish()
        .build();

      ASMMethod ForgeHaxHooks_onLoadShader =
              Classes.ForgeHaxHooks.childMethod()
                      .setName("onLoadShader")
                      .setReturnType(boolean.class)
                      .emptyParameters()
                      .build();

    ASMMethod ForgeHaxHooks_onSendingPacket =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSendingPacket")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Packet)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onSentPacket =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSentPacket")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.Packet)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPreReceived =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPreReceived")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Packet)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPostReceived =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPostReceived")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.Packet)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onWaterMovement =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onWaterMovement")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Entity)
        .add(TypesMc.Classes.Vec3d)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onApplyCollisionMotion =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onApplyCollisionMotion")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Entity)
        .add(TypesMc.Classes.Entity)
        .add(double.class)
        .add(double.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPutColorMultiplier =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPutColorMultiplier")
        .setReturnType(int.class)
        .beginParameters()
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(int.class)
        .add(boolean[].class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPreRenderBlockLayer =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPreRenderBlockLayer")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.BlockRenderLayer)
        .add(double.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPostRenderBlockLayer =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPostRenderBlockLayer")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.BlockRenderLayer)
        .add(double.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onRenderBlockInLayer =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onRenderBlockInLayer")
        .setReturnType(TypesMc.Classes.BlockRenderLayer)
        .beginParameters()
        .add(TypesMc.Classes.Block)
        .add(TypesMc.Classes.IBlockState)
        .add(TypesMc.Classes.BlockRenderLayer)
        .add(TypesMc.Classes.BlockRenderLayer)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onSetupTerrain =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSetupTerrain")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Entity)
        .add(boolean.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_isBlockFiltered =
      Classes.ForgeHaxHooks.childMethod()
        .setName("isBlockFiltered")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Entity)
        .add(TypesMc.Classes.IBlockState)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onSneakEvent =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSneakEvent")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(boolean.class)
        .add(boolean.class)
        .add(TypesMc.Classes.Entity)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onAddCollisionBoxToList =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onAddCollisionBoxToList")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Block)
        .add(TypesMc.Classes.IBlockState)
        .add(TypesMc.Classes.World)
        .add(TypesMc.Classes.BlockPos)
        .add(TypesMc.Classes.AxisAlignedBB)
        .add(List.class)
        .add(TypesMc.Classes.Entity)
        .add(boolean.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onBlockRenderInLoop =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onBlockRenderInLoop")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .add(TypesMc.Classes.Block)
        .add(TypesMc.Classes.IBlockState)
        .add(TypesMc.Classes.BlockPos)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPreBuildChunk =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPreBuildChunk")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPostBuildChunk =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPostBuildChunk")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onDeleteGlResources =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onDeleteGlResources")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onChunkUploaded =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onChunkUploaded")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .add(TypesMc.Classes.BufferBuilder)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onAddRenderChunk =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onAddRenderChunk")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.RenderChunk)
        .add(TypesMc.Classes.BlockRenderLayer)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onLoadRenderers =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onLoadRenderers")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.ViewFrustum)
        .add(TypesMc.Classes.ChunkRenderDispatcher)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onWorldRendererDeallocated =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onWorldRendererDeallocated")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.ChunkCompileTaskGenerator)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_shouldDisableCaveCulling =
      Classes.ForgeHaxHooks.childMethod()
        .setName("shouldDisableCaveCulling")
        .setReturnType(boolean.class)
        .emptyParameters()
        .build();

    ASMMethod ForgeHaxHooks_onJournyMapSetStratumColor =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onJournyMapSetStratumColor")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Object.class)
        .add(Object.class)
        .add(int.class)
        .add(Integer.class)
        .add(boolean.class)
        .add(boolean.class)
        .add(boolean.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onUpdateWalkingPlayerPre =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onUpdateWalkingPlayerPre")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.EntityPlayerSP)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onUpdateWalkingPlayerPost =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onUpdateWalkingPlayerPost")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.EntityPlayerSP)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPushOutOfBlocks =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPushOutOfBlocks")
        .setReturnType(boolean.class)
        .emptyParameters()
        .build();

    ASMMethod ForgeHaxHooks_onRenderBoat =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onRenderBoat")
        .setReturnType(float.class)
        .beginParameters()
        .add(TypesMc.Classes.EntityBoat)
        .add(float.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onSchematicaPlaceBlock =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSchematicaPlaceBlock")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.ItemStack)
        .add(TypesMc.Classes.BlockPos)
        .add(TypesMc.Classes.Vec3d)
        .add(TypesMc.Classes.EnumFacing)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onWorldCheckLightFor =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onWorldCheckLightFor")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.EnumSkyBlock)
        .add(TypesMc.Classes.BlockPos)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onLeftClickCounterSet =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onLeftClickCounterSet")
        .setReturnType(int.class)
        .beginParameters()
        .add(int.class)
        .add(TypesMc.Classes.Minecraft)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onSendClickBlockToController =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onSendClickBlockToController")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Minecraft)
        .add(boolean.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPlayerItemSync =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPlayerItemSync")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.PlayerControllerMP)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPlayerBreakingBlock =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPlayerBreakingBlock")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.PlayerControllerMP)
        .add(TypesMc.Classes.BlockPos)
        .add(TypesMc.Classes.EnumFacing)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPlayerAttackEntity =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPlayerAttackEntity")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.PlayerControllerMP)
        .add(TypesMc.Classes.EntityPlayer)
        .add(TypesMc.Classes.Entity)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPlayerStopUse =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPlayerStopUse")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.PlayerControllerMP)
        .add(TypesMc.Classes.EntityPlayer)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onEntityBlockSlipApply =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onEntityBlockSlipApply")
        .setReturnType(float.class)
        .beginParameters()
        .add(float.class)
        .add(TypesMc.Classes.EntityLivingBase)
        .add(TypesMc.Classes.IBlockState)
        .add(int.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onEntityGroundCheck =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onEntityGroundCheck")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.EntityLivingBase)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_fireEvent_v =
      Classes.ForgeHaxHooks.childMethod()
        .setName("fireEvent_v")
        .setReturnType(void.class) // return nothing
        .beginParameters()
        .add(Event.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_fireEvent_b =
      Classes.ForgeHaxHooks.childMethod()
        .setName("fireEvent_b")
        .setReturnType(boolean.class) // return true if canceled
        .beginParameters()
        .add(Event.class)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onDrawBoundingBox_Post =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onDrawBoundingBoxPost")
        .setReturnType(void.class)
        .emptyParameters()
        .build();

    ASMMethod ForgeHaxHooks_onDrawPing =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onDrawPing")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(int.class)
        .add(int.class)
        .add(int.class)
        .add(TypesMc.Classes.NetworkPlayerInfo)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onGetBlockSound =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onGetBlockSound")
        .setReturnType(TypesMc.Classes.SoundType)
        .beginParameters()
        .add(TypesMc.Classes.SoundType)
        .finish()
        .build();



    ASMMethod ForgeHaxHooks_onElytraFlying =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onElytraFlying")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(TypesMc.Classes.Entity)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPrintChatLine =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onPrintChatLine")
        .setReturnType(TypesMc.Classes.ITextComponent)
        .beginParameters()
        .add(TypesMc.Classes.ITextComponent)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onUpdatePlayerMoveState =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onUpdatePlayerMoveState")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.MovementInputFromOptions)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onUpdateMouseState =
      Classes.ForgeHaxHooks.childMethod()
        .setName("onUpdateMouseState")
        .setReturnType(void.class)
        .beginParameters()
        .add(TypesMc.Classes.MouseHelper)
        .finish()
        .build();

    ASMMethod ForgeHaxHooks_onPigTravel =
    		Classes.ForgeHaxHooks.childMethod()
    		.setName("onPigTravel")
    		.setReturnType(TypesMc.Classes.Vec3d)
        .beginParameters()
        .add(TypesMc.Classes.EntityLivingBase)
        .finish()
    		.build();
    
    ASMMethod ForgeHaxHooks_testingMethod =
    		Classes.ForgeHaxHooks.childMethod()
        .setName("testingMethod")
        .setReturnType(void.class)
    		.emptyParameters()
    		.build();

  }
}
