package net.sammmmy1628.blastfromthepast.event;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.entity.model.BabyFrostomperModel;
import net.sammmmy1628.blastfromthepast.entity.model.BabySnowdoModel;
import net.sammmmy1628.blastfromthepast.entity.model.FrostomperModel;
import net.sammmmy1628.blastfromthepast.entity.model.SnowdoModel;
import net.sammmmy1628.blastfromthepast.entity.renderer.FrostomperRenderer;
import net.sammmmy1628.blastfromthepast.entity.renderer.NoneRenderer;
import net.sammmmy1628.blastfromthepast.entity.renderer.SnowdoRenderer;

@Mod.EventBusSubscriber(modid = BlastFromThePast.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler 
{
    @SuppressWarnings("removal")
	@SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event)
    {
    	event.enqueueWork(() -> 
    	{
            ItemBlockRenderTypes.setRenderLayer(BFTPBlocks.GELIMELON_STEM.get(), RenderType.cutout());
    	});
    }
    
    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(SnowdoModel.LAYER_LOCATION, SnowdoModel::createBodyLayer);
        event.registerLayerDefinition(BabySnowdoModel.LAYER_LOCATION, BabySnowdoModel::createBodyLayer);
        event.registerLayerDefinition(FrostomperModel.LAYER_LOCATION, FrostomperModel::createBodyLayer);
        event.registerLayerDefinition(BabyFrostomperModel.LAYER_LOCATION, BabyFrostomperModel::createBodyLayer);
    }
    
    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
    	event.registerEntityRenderer(BFTPEntities.CAMERA_SHAKE.get(), NoneRenderer::new);
        event.registerEntityRenderer(BFTPEntities.SNOWDO.get(), SnowdoRenderer::new);
        event.registerEntityRenderer(BFTPEntities.THROWN_SNOWDO_EGG.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(BFTPEntities.FROSTOMPER.get(), FrostomperRenderer::new);
    }
}
