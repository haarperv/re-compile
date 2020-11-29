package com.matt.forgehax.asm;

import com.google.common.util.concurrent.ListenableFuture;
import com.matt.forgehax.asm.utils.asmtype.ASMClass;
import com.matt.forgehax.asm.utils.asmtype.ASMField;
import com.matt.forgehax.asm.utils.asmtype.ASMMethod;
import com.matt.forgehax.asm.utils.asmtype.builders.ASMBuilders;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.GenericFutureListener;

import java.util.List;
import java.util.UUID;

/**
 * Created on 5/27/2017 by fr1kin
 */
public interface TypesMc {
  
  interface Classes {
	  
	  ASMClass GameProfile =
			  ASMBuilders.newClassBuilder()
			  .setClassName("com/mojang/authlib/GameProfile")
			  .autoAssign()
			  .build();
	  
	  ASMClass ResourceLocation =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/util/ResourceLocation")
			  .autoAssign()
			  .build();
    
	  ASMClass AbstractClientPlayer =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/client/entity/AbstractClientPlayer")
			  .autoAssign()
			  .build();
	  
	  ASMClass SPacketPlayerListItem =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/network/play/server/SPacketPlayerListItem")
			  .autoAssign()
			  .build();
	  
	  ASMClass NetHandlerPlayClient =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/client/network/NetHandlerPlayClient")
			  .autoAssign()
			  .build();
	  
	  ASMClass EntityItem =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/entity/item/EntityItem")
			  .autoAssign()
			  .build();
	  
	  ASMClass RenderEntityItem =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/client/renderer/entity/RenderEntityItem")
			  .autoAssign()
			  .build();
	  
	  ASMClass ModelBase =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/client/model/ModelBase")
			  .autoAssign()
			  .build();
	  
	  ASMClass RenderLivingBase =
	    		ASMBuilders.newClassBuilder()
	    		.setClassName("net/minecraft/client/renderer/entity/RenderLivingBase")
	    		.autoAssign()
	    		.build();
	  
	  ASMClass RenderEnderCrystal =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/client/renderer/entity/RenderEnderCrystal")
			  .autoAssign()
			  .build();
	  
	  ASMClass EntityEnderCrystal =
			  ASMBuilders.newClassBuilder()
			  .setClassName("net/minecraft/entity/item/EntityEnderCrystal")
			  .autoAssign()
			  .build();
	  
	  ASMClass RenderItem =
	    		ASMBuilders.newClassBuilder()
	    		.setClassName("net/minecraft/client/renderer/RenderItem")
	    		.autoAssign()
	    		.build();
	  
    ASMClass Packet =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/network/Packet")
        .autoAssign()
        .build();
    
    ASMClass AxisAlignedBB =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/math/AxisAlignedBB")
        .autoAssign()
        .build();
    
    ASMClass Liquid =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/block/BlockLiquid")
        .autoAssign()
        .build();

    ASMClass LayerArmorBase =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/entity/layers/LayerArmorBase")
        .autoAssign()
        .build();
    
    ASMClass Material =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/block/material/Material")
        .autoAssign()
        .build();

    ASMClass SoundType =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/block/SoundType")
        .autoAssign()
        .build();
    
    ASMClass Entity =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/Entity")
        .autoAssign()
        .build();
    
    ASMClass EntityLivingBase =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/EntityLivingBase")
        .autoAssign()
        .build();
    
    ASMClass Vec3d =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/math/Vec3d")
        .autoAssign()
        .build();
    
    ASMClass BlockRenderLayer =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/BlockRenderLayer")
        .autoAssign()
        .build();
    
    ASMClass IBlockState =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/block/state/IBlockState")
        .autoAssign()
        .build();
    
    ASMClass BlockPos =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/math/BlockPos")
        .autoAssign()
        .build();
    
    ASMClass Block =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/block/Block")
        .autoAssign()
        .build();

    ASMClass ElytraSound =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/audio/ElytraSound")
        .autoAssign()
        .build();
    
    ASMClass ICamera =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/culling/ICamera")
        .autoAssign()
        .build();
    
    ASMClass VisGraph =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/VisGraph")
        .autoAssign()
        .build();
    
    ASMClass SetVisibility =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/SetVisibility")
        .autoAssign()
        .build();
    
    ASMClass Minecraft =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/Minecraft")
        .autoAssign()
        .build();
    
    ASMClass NetworkManager$4 =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/network/NetworkManager$4")
        .autoAssign()
        .build();
    
    ASMClass IBlockAccess =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/world/IBlockAccess")
        .autoAssign()
        .build();
    
    ASMClass BufferBuilder =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/BufferBuilder")
        .autoAssign()
        .build();
    
    ASMClass MoverType =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/MoverType")
        .autoAssign()
        .build();
    
    ASMClass WorldProvider =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/world/WorldProvider")
        .autoAssign()
        .build();
    
    ASMClass World =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/world/World")
        .autoAssign()
        .build();
    
    ASMClass IBakedModel =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/block/model/IBakedModel")
        .autoAssign()
        .build();
    
    ASMClass CompiledChunk =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/CompiledChunk")
        .autoAssign()
        .build();
    
    ASMClass RenderChunk =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/RenderChunk")
        .autoAssign()
        .build();
    
    ASMClass ChunkCompileTaskGenerator =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator")
        .autoAssign()
        .build();
    
    ASMClass ChunkCache =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/world/ChunkCache")
        .autoAssign()
        .build();
    
    ASMClass ViewFrustum =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/ViewFrustum")
        .autoAssign()
        .build();
    
    ASMClass ChunkRenderDispatcher =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/ChunkRenderDispatcher")
        .autoAssign()
        .build();
    
    ASMClass RenderGlobal =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/RenderGlobal")
        .autoAssign()
        .build();
    
    ASMClass ChunkRenderContainer =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/ChunkRenderContainer")
        .autoAssign()
        .build();
    
    ASMClass ChunkRenderWorker =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/chunk/ChunkRenderWorker")
        .autoAssign()
        .build();
    
    ASMClass EntityPlayer =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/player/EntityPlayer")
        .autoAssign()
        .build();
    
    ASMClass EntityPlayerSP =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/entity/EntityPlayerSP")
        .autoAssign()
        .build();
    
    ASMClass EntityBoat =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/item/EntityBoat")
        .autoAssign()
        .build();
    
    ASMClass EntityRenderer =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/EntityRenderer")
        .autoAssign()
        .build();
    
    ASMClass RenderBoat =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/renderer/entity/RenderBoat")
        .autoAssign()
        .build();
    
    ASMClass NetworkManager =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/network/NetworkManager")
        .autoAssign()
        .build();

    ASMClass NetworkPlayerInfo =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/network/NetworkPlayerInfo")
        .autoAssign()
        .build();
    
    ASMClass GuiScreen =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/gui/GuiScreen")
        .autoAssign()
        .build();
    
    ASMClass GuiMainMenu =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/gui/GuiMainMenu")
        .autoAssign()
        .build();

    ASMClass GuiNewChat =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/gui/GuiNewChat")
        .autoAssign()
        .build();
    
    ASMClass GuiPlayerTabOverlay =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/gui/GuiPlayerTabOverlay")
        .autoAssign()
        .build();
    
    ASMClass Scoreboard =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/scoreboard/Scoreboard")
        .autoAssign()
        .build();
    
    ASMClass ScoreObjective =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/scoreboard/ScoreObjective")
        .autoAssign()
        .build();
    
    ASMClass KeyBinding =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/settings/KeyBinding")
        .autoAssign()
        .build();
    
    ASMClass WorldClient =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/multiplayer/WorldClient")
        .autoAssign()
        .build();
    
    ASMClass ItemStack =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/item/ItemStack")
        .autoAssign()
        .build();

    ASMClass ItemBlock =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/item/ItemBlock")
        .autoAssign()
        .build();
    
    ASMClass EnumFacing =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/EnumFacing")
        .autoAssign()
        .build();
    
    ASMClass EnumHand =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/EnumHand")
        .autoAssign()
        .build();
    
    ASMClass EnumSkyBlock =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/world/EnumSkyBlock")
        .autoAssign()
        .build();
    
    ASMClass PlayerControllerMP =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/client/multiplayer/PlayerControllerMP")
        .autoAssign()
        .build();

    ASMClass ITextComponent = 
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/text/ITextComponent")
        .autoAssign()
        .build();
    
    ASMClass ClickEvent =
    		ASMBuilders.newClassBuilder()
    		.setClassName("net/minecraft/util/text/event/ClickEvent")
    		.autoAssign()
    		.build();

    ASMClass EnumActionResult = 
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/EnumActionResult")
        .autoAssign()
        .build();

    ASMClass MovementInputFromOptions =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/MovementInputFromOptions")
        .autoAssign()
        .build();

    ASMClass MouseHelper =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/util/MouseHelper")
        .autoAssign()
        .build();

    ASMClass AbstractHorse =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/passive/AbstractHorse")
        .autoAssign()
        .build();

    ASMClass EntityLlama =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/passive/EntityLlama")
        .autoAssign()
        .build();

    ASMClass EntityPig =
      ASMBuilders.newClassBuilder()
        .setClassName("net/minecraft/entity/passive/EntityPig")
        .autoAssign()
        .build();
  }
  
  interface Fields {
	  
	  ASMField EntityPlayer_gameProfile =
			  Classes.EntityPlayer.childField()
			  .setName("gameProfile")
			  .setType(Classes.GameProfile)
			  .autoAssign()
			  .build();
	  
	  ASMField RenderEntityItem_itemRenderer =
			  Classes.RenderEntityItem.childField()
			  .setName("itemRenderer")
			  .setType(Classes.RenderItem)
			  .autoAssign()
			  .build();
    
	  ASMField RenderEnderCrystal_modelEnderCrystal =
			  Classes.RenderEnderCrystal.childField()
			  .setName("modelEnderCrystal")
			  .setType(Classes.ModelBase)
			  .autoAssign()
			  .build();
	  
	  ASMField RenderEnderCrystal_modelEnderCrystalNoBase =
			  Classes.RenderEnderCrystal.childField()
			  .setName("modelEnderCrystalNoBase")
			  .setType(Classes.ModelBase)
			  .autoAssign()
			  .build();
	  
	  ASMField RenderLivingBase_mainModel =
	    		Classes.RenderLivingBase.childField()
	    			.setName("mainModel")
	    			.setType(Classes.ModelBase)
	    			.autoAssign()
	    			.build();
	  
    ASMField NetworkManager$4_val$inPacket =
      Classes.NetworkManager$4.childField()
        .setName("val$inPacket")
        .setType(Classes.Packet)
        .build();
    
    ASMField RenderGlobal_viewFrustum =
      Classes.RenderGlobal.childField()
        .setName("viewFrustum")
        .setType(Classes.ViewFrustum)
        .autoAssign()
        .build();
    ASMField RenderGlobal_renderDispatcher =
      Classes.RenderGlobal.childField()
        .setName("renderDispatcher")
        .setType(Classes.ChunkRenderDispatcher)
        .autoAssign()
        .build();

    ASMField Entity_stepHeight =
      Classes.Entity.childField()
        .setName("stepHeight")
        .setType(float.class)
        .autoAssign()
        .build();

    ASMField Vec3d_x =
      Classes.Vec3d.childField()
        .setName("x")
        .setType(double.class)
        .autoAssign()
        .build();

    ASMField Vec3d_y =
      Classes.Vec3d.childField()
        .setName("y")
        .setType(double.class)
        .autoAssign()
        .build();

    ASMField Vec3d_z =
      Classes.Vec3d.childField()
        .setName("z")
        .setType(double.class)
        .autoAssign()
        .build();
  }
  
  interface Methods {
    
	  ASMMethod Minecraft_updateFramebufferSize =
			  Classes.Minecraft.childMethod()
			  .setName("updateFramebufferSize")
			  .setReturnType(void.class)
			  .emptyParameters()
			  .autoAssign()
			  .build();
	  
	  ASMMethod GuiScreen_handleComponentClick =
			  Classes.GuiScreen.childMethod()
			  .setName("handleComponentClick")
			  .setReturnType(boolean.class)
			  .beginParameters()
			  .add(Classes.ITextComponent)
			  .finish()
			  .autoAssign()
			  .build();
	  
	  ASMMethod GameProfile_getId =
			  Classes.GameProfile.childMethod()
			  .setName("getId")
			  .setReturnType(UUID.class)
			  .emptyParameters()
			  .autoAssign()
			  .build();
	  
	  ASMMethod Entity_getUniqueID =
			  Classes.Entity.childMethod() 
			  .setName("getUniqueID")
			  .setReturnType(UUID.class)
			  .emptyParameters()
			  .autoAssign()
			  .build();
	  
	  ASMMethod AbstractClientPlayer_getLocationCape =
			  Classes.AbstractClientPlayer.childMethod()
			  .setName("getLocationCape")
			  .setReturnType(Classes.ResourceLocation)
			  .emptyParameters()
			  .autoAssign()
			  .build();
	  
	  ASMMethod NetHandlerPlayClient_handlePlayerListItem =
			  Classes.NetHandlerPlayClient.childMethod()
			  .setName("handlePlayerListItem")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.SPacketPlayerListItem)
			  .finish()
			  .autoAssign()
			  .build();
	  
	  ASMMethod Minecraft_rightClickMouse =
	    		Classes.Minecraft.childMethod()
	    		.setName("rightClickMouse")
	    		.setReturnType(void.class)
	    		.emptyParameters()
	    		.autoAssign()
	    		.build();
	  
	  ASMMethod RenderEntityItem_doRender =
			  Classes.RenderEntityItem.childMethod()
			  .setName("doRender")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityItem)
			  .add(double.class)
			  .add(double.class)
			  .add(double.class)
			  .add(float.class)
			  .add(float.class)
			  .finish()
			  .autoAssign()
			  .build();
	  
	  ASMMethod RenderEnderCrystal_doRender =
			  Classes.RenderEnderCrystal.childMethod()
			  .setName("doRender")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityEnderCrystal)
			  .add(double.class)
			  .add(double.class)
			  .add(double.class)
			  .add(float.class)
			  .add(float.class)
			  .finish()
			  .autoAssign()
			  .build();
	  
	  ASMMethod EntityEnderCrystal_shouldShowBottom =
			  Classes.EntityEnderCrystal.childMethod()
			  .setName("shouldShowBottom")
			  .setReturnType(boolean.class)
			  .emptyParameters()
			  .autoAssign()
			  .build();

	  ASMMethod RenderLivingBase_renderModel =
			  Classes.RenderLivingBase.childMethod()
			  .setName("renderModel")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityLivingBase)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .finish()
			  .autoAssign()
        .build();

	  ASMMethod RenderLivingBase_renderLayers =
			  Classes.RenderLivingBase.childMethod()
			  .setName("renderLayers")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityLivingBase)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
        .add(float.class)
        .add(float.class)
			  .finish()
			  .autoAssign()
        .build();
        
	  ASMMethod RenderLivingBase_applyRotations =
			  Classes.RenderLivingBase.childMethod()
			  .setName("applyRotations")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityLivingBase)
			  .add(float.class)
			  .add(float.class)
			  .add(float.class)
			  .finish()
			  .autoAssign()
			  .build();
	  
	  ASMMethod RenderItem_renderItemAndEffectIntoGUI =
			  Classes.RenderItem.childMethod()
			  .setName("renderItemAndEffectIntoGUI")
			  .setReturnType(void.class)
			  .beginParameters()
			  .add(Classes.EntityLivingBase)
			  .add(Classes.ItemStack)
			  .add(int.class)
			  .add(int.class)
			  .finish()
			  .autoAssign()
			  .build();
	  
    ASMMethod Block_canRenderInLayer =
      Classes.Block.childMethod()
        .setName("canRenderInLayer")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.IBlockState)
        .add(Classes.BlockRenderLayer)
        .finish()
        .autoAssign()
        .build();
    ASMMethod Block_addCollisionBoxToList =
      Classes.Block.childMethod()
        .setName("addCollisionBoxToList")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.IBlockState)
        .add(Classes.World)
        .add(Classes.BlockPos)
        .add(Classes.AxisAlignedBB)
        .add(List.class)
        .add(Classes.Entity)
        .add(boolean.class)
        .finish()
        .autoAssign()
        .build();
    ASMMethod Liquid_canCollideCheck =
      Classes.Liquid.childMethod()
        .setName("canCollideCheck")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.IBlockState)
        .add(boolean.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod ChunkRenderContainer_addRenderChunk =
      Classes.ChunkRenderContainer.childMethod()
        .setName("addRenderChunk")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.RenderChunk)
        .add(Classes.BlockRenderLayer)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod ChunkRenderDispatcher_uploadChunk =
      Classes.ChunkRenderDispatcher.childMethod()
        .setName("uploadChunk")
        .setReturnType(ListenableFuture.class)
        .beginParameters()
        .add(Classes.BlockRenderLayer)
        .add(Classes.BufferBuilder)
        .add(Classes.RenderChunk)
        .add(Classes.CompiledChunk)
        .add(double.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod ChunkRenderWorker_freeRenderBuilder =
      Classes.ChunkRenderWorker.childMethod()
        .setName("freeRenderBuilder")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.ChunkCompileTaskGenerator)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod Entity_applyEntityCollision =
      Classes.Entity.childMethod()
        .setName("applyEntityCollision")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.Entity)
        .finish()
        .autoAssign()
        .build();
    ASMMethod Entity_move =
      Classes.Entity.childMethod()
        .setName("move")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.MoverType)
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .finish()
        .autoAssign()
        .build();
    ASMMethod Entity_doBlockCollisions =
      Classes.Entity.childMethod()
        .setName("doBlockCollisions")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod EntityPlayerSP_onLivingUpdate =
      Classes.EntityPlayerSP.childMethod()
        .setName("onLivingUpdate")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod EntityPlayerSP_onUpdate =
      Classes.EntityPlayerSP.childMethod()
        .setName("onUpdate")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod EntityPlayerSP_onUpdateWalkingPlayer =
      Classes.EntityPlayerSP.childMethod()
        .setName("onUpdateWalkingPlayer")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod EntityPlayerSP_pushOutOfBlocks =
      Classes.EntityPlayerSP.childMethod()
        .setName("pushOutOfBlocks")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod EntityPlayerSP_isRowingBoat =
      Classes.EntityPlayerSP.childMethod()
        .setName("isRowingBoat")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod EntityPlayerSP_isCurrentViewEntity =
      Classes.EntityPlayerSP.childMethod()
        .setName("isCurrentViewEntity")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod EntityPlayerSP_isUser =
      Classes.EntityPlayerSP.childMethod()
        .setName("isUser")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod EntityLivingBase_travel =
      Classes.EntityLivingBase.childMethod()
        .setName("travel")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod EntityRenderer_hurtCameraEffect =
      Classes.EntityRenderer.childMethod()
        .setName("hurtCameraEffect")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .finish()
        .autoAssign()
        .build();

      ASMMethod EntityRenderer_loadEntityShader =
        Classes.EntityRenderer.childMethod()
          .setName("loadEntityShader")
          .setReturnType(void.class)
          .beginParameters()
          .add(Classes.Entity)
          .finish()
          .autoAssign()
          .build();

      ASMMethod EntityRenderer_orientCamera =
        Classes.EntityRenderer.childMethod()
          .setName("orientCamera")
          .setReturnType(void.class)
          .beginParameters()
          .add(float.class)
          .finish()
          .autoAssign()
          .build();

    ASMMethod EntityRenderer_getMouseOver =
      Classes.EntityRenderer.childMethod()
        .setName("getMouseOver")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .finish()
        .autoAssign()
        .build();

    ASMMethod EntityRenderer_renderWorldPass =
      Classes.EntityRenderer.childMethod()
        .setName("renderWorldPass")
        .setReturnType(void.class)
        .beginParameters()
        .add(int.class)
        .add(float.class)
        .add(long.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod LayerArmorBase_doRenderLayer =
      Classes.LayerArmorBase.childMethod()
        .setName("doRenderLayer")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.EntityLivingBase)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod Minecraft_setIngameFocus =
      Classes.Minecraft.childMethod()
        .setName("setIngameFocus")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod Minecraft_runTick =
      Classes.Minecraft.childMethod()
        .setName("runTick")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod Minecraft_sendClickBlockToController =
      Classes.Minecraft.childMethod()
        .setName("sendClickBlockToController")
        .setReturnType(void.class)
        .beginParameters()
        .add(boolean.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod NetworkManager$4_run =
      Classes.NetworkManager$4.childMethod()
        .setName("run")
        .setReturnType(void.class)
        .emptyParameters()
        .build(); // does not have an obfuscated or an srg name
    
    ASMMethod NetworkManager_dispatchPacket =
      Classes.NetworkManager.childMethod()
        .setName("dispatchPacket")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.Packet)
        .add(GenericFutureListener[].class)
        .finish()
        .autoAssign()
        .build();
    ASMMethod NetworkManager_channelRead0 =
      Classes.NetworkManager.childMethod()
        .setName("channelRead0")
        .setObfuscatedName("a") // manually set because this isn't a vanilla method
        .setReturnType(void.class)
        .beginParameters()
        .add(ChannelHandlerContext.class)
        .add(Classes.Packet)
        .finish()
        // .autoAssign()
        .build();
    
    ASMMethod RenderChunk_rebuildChunk =
      Classes.RenderChunk.childMethod()
        .setName("rebuildChunk")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(Classes.ChunkCompileTaskGenerator)
        .finish()
        .autoAssign()
        .build();
    ASMMethod RenderChunk_deleteGlResources =
      Classes.RenderChunk.childMethod()
        .setName("deleteGlResources")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod RenderGlobal_loadRenderers =
      Classes.RenderGlobal.childMethod()
        .setName("loadRenderers")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod RenderGlobal_renderBlockLayer =
      Classes.RenderGlobal.childMethod()
        .setName("renderBlockLayer")
        .setReturnType(int.class)
        .beginParameters()
        .add(Classes.BlockRenderLayer)
        .add(double.class)
        .add(int.class)
        .add(Classes.Entity)
        .finish()
        .autoAssign()
        .build();
    ASMMethod RenderGlobal_setupTerrain =
      Classes.RenderGlobal.childMethod()
        .setName("setupTerrain")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.Entity)
        .add(double.class)
        .add(Classes.ICamera)
        .add(int.class)
        .add(boolean.class)
        .finish()
        .autoAssign()
        .build();
    ASMMethod RenderGlobal_drawBoundingBox =
      Classes.RenderGlobal.childMethod()
        .setName("drawBoundingBox")
        .setReturnType(void.class)
        .beginParameters()
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod BufferBuilder_putColorMultiplier =
      Classes.BufferBuilder.childMethod()
        .setName("putColorMultiplier")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .add(int.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod VisGraph_setOpaqueCube =
      Classes.VisGraph.childMethod()
        .setName("setOpaqueCube")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.BlockPos)
        .finish()
        .autoAssign()
        .build();
    ASMMethod VisGraph_computeVisibility =
      Classes.VisGraph.childMethod()
        .setName("computeVisibility")
        .setReturnType(Classes.SetVisibility)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod World_handleMaterialAcceleration =
      Classes.World.childMethod()
        .setName("handleMaterialAcceleration")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.AxisAlignedBB)
        .add(Classes.Material)
        .add(Classes.Entity)
        .finish()
        .autoAssign()
        .build();
    ASMMethod World_checkLightFor =
      Classes.World.childMethod()
        .setName("checkLightFor")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.EnumSkyBlock)
        .add(Classes.BlockPos)
        .finish()
        .autoAssign()
        .build();
    ASMMethod World_setBlockState =
      Classes.World.childMethod()
        .setName("setBlockState")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.BlockPos)
        .add(Classes.IBlockState)
        .add(int.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod EntityBoat_updateMotion =
      Classes.EntityBoat.childMethod()
        .setName("updateMotion")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod EntityBoat_controlBoat =
      Classes.EntityBoat.childMethod()
        .setName("controlBoat")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod EntityBoat_applyYawToEntity =
      Classes.EntityBoat.childMethod()
        .setName("applyYawToEntity")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.Entity)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod RenderBoat_doRender =
      Classes.RenderBoat.childMethod()
        .setName("doRender")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.EntityBoat)
        .add(double.class)
        .add(double.class)
        .add(double.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod PlayerTabOverlay_renderPlayerList =
      Classes.GuiPlayerTabOverlay.childMethod()
        .setName("renderPlayerlist")
        .setReturnType(void.class)
        .beginParameters()
        .add(int.class)
        .add(Classes.Scoreboard)
        .add(Classes.ScoreObjective)
        .finish()
        .autoAssign()
        .build();

    ASMMethod PlayerTabOverlay_drawPing =
      Classes.GuiPlayerTabOverlay.childMethod()
        .setName("drawPing")
        .setReturnType(void.class)
        .beginParameters()
        .add(int.class)
        .add(int.class)
        .add(int.class)
        .add(Classes.NetworkPlayerInfo)
        .finish()
        .autoAssign()
        .build();

    ASMMethod GuiNewChat_printChatMessage =
      Classes.GuiNewChat.childMethod()
        .setName("printChatMessage")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.ITextComponent)
        .finish()
        .autoAssign()
        .build();

    ASMMethod GuiNewChat_setChatLine =
      Classes.GuiNewChat.childMethod()
        .setName("setChatLine")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.ITextComponent)
        .add(int.class)
        .add(int.class)
        .add(boolean.class)
        .finish()
        .autoAssign()
        .build();

    ASMMethod GuiNewChat_drawChat =
      Classes.GuiNewChat.childMethod()
        .setName("drawChat")
        .setReturnType(void.class)
        .beginParameters()
        .add(int.class)
        .finish()
        .autoAssign()
        .build();
    
    ASMMethod KeyBinding_isKeyDown =
      Classes.KeyBinding.childMethod()
        .setName("isKeyDown")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();
    
    ASMMethod PlayerControllerMC_syncCurrentPlayItem =
      Classes.PlayerControllerMP.childMethod()
        .setName("syncCurrentPlayItem")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod PlayerControllerMC_attackEntity =
      Classes.PlayerControllerMP.childMethod()
        .setName("attackEntity")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.EntityPlayer)
        .add(Classes.Entity)
        .finish()
        .autoAssign()
        .build();
    ASMMethod PlayerControllerMC_onPlayerDamageBlock =
      Classes.PlayerControllerMP.childMethod()
        .setName("onPlayerDamageBlock")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.BlockPos)
        .add(Classes.EnumFacing)
        .finish()
        .autoAssign()
        .build();
    ASMMethod PlayerControllerMC_onStoppedUsingItem =
      Classes.PlayerControllerMP.childMethod()
        .setName("onStoppedUsingItem")
        .setReturnType(void.class)
        .beginParameters()
        .add(Classes.EntityPlayer)
        .finish()
        .autoAssign()
        .build();
    ASMMethod PlayerControllerMC_onPlayerDestroyBlock =
      Classes.PlayerControllerMP.childMethod()
        .setName("onPlayerDestroyBlock")
        .setReturnType(boolean.class)
        .beginParameters()
        .add(Classes.BlockPos)
        .finish()
        .autoAssign()
        .build();
    ASMMethod PlayerControllerMC_getBlockReachDistance =
      Classes.PlayerControllerMP.childMethod()
        .setName("getBlockReachDistance")
        .setReturnType(float.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod ItemBlock_onItemUse =
      Classes.ItemBlock.childMethod()
        .setName("onItemUse")
        .setReturnType(Classes.EnumActionResult)
        .beginParameters()
        .add(Classes.EntityPlayer)
        .add(Classes.World)
        .add(Classes.BlockPos)
        .add(Classes.EnumHand)
        .add(Classes.EnumFacing)
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();

    ASMMethod ElytraSound_update =
      Classes.ElytraSound.childMethod()
        .setName("update")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod MovementInputFromOptions_updatePlayerMoveState =
      Classes.MovementInputFromOptions.childMethod()
        .setName("updatePlayerMoveState")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod MouseHelper_mouseXYChange =
      Classes.MouseHelper.childMethod()
        .setName("mouseXYChange")
        .setReturnType(void.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod AbstractHorse_canBeSteered =
      Classes.AbstractHorse.childMethod()
        .setName("canBeSteered")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod AbstractHorse_isHorseSaddled =
      Classes.AbstractHorse.childMethod()
        .setName("isHorseSaddled")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod EntityLlama_canBeSteered =
      Classes.EntityLlama.childMethod()
        .setName("canBeSteered")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();

    ASMMethod EntityPig_canBeSteered =
      Classes.EntityPig.childMethod()
        .setName("canBeSteered")
        .setReturnType(boolean.class)
        .emptyParameters()
        .autoAssign()
        .build();
    ASMMethod EntityPig_travel =
      Classes.EntityPig.childMethod()
        .setName("travel")
        .setReturnType(void.class)
        .beginParameters()
        .add(float.class)
        .add(float.class)
        .add(float.class)
        .finish()
        .autoAssign()
        .build();
  }
}
