package net.sammmmy1628.blastfromthepast;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sammmmy1628.blastfromthepast.client.model.BabySnowdoModel;
import net.sammmmy1628.blastfromthepast.client.model.SnowdoModel;
import net.sammmmy1628.blastfromthepast.client.renderer.SnowdoRenderer;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.init.BFTPCreativeModeTabs;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;
import net.sammmmy1628.blastfromthepast.init.entity.BFTPEntities;
import org.slf4j.Logger;

@Mod(BlastFromThePast.MOD_ID)
public class BlastFromThePast
{
    public static final String MOD_ID = "blastfromthepast";
    private static final Logger LOGGER = LogUtils.getLogger();


    public BlastFromThePast(FMLJavaModLoadingContext context) {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BFTPCreativeModeTabs.register(modEventBus);

        modEventBus.addListener(this::onEntityAttributeCreation);

        BFTPBlocks.register(modEventBus);
        BFTPItems.register(modEventBus);
        BFTPEntities.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    private void onEntityAttributeCreation(final EntityAttributeCreationEvent event) {
        event.put(BFTPEntities.SNOWDO.get(), SnowdoEntity.createAttributes().build());
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(SnowdoModel.LAYER_LOCATION, SnowdoModel::createBodyLayer);
            event.registerLayerDefinition(BabySnowdoModel.LAYER_LOCATION, BabySnowdoModel::createBodyLayer);
        }

        // Registrar Renderer
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(BFTPEntities.SNOWDO.get(), SnowdoRenderer::new);
            event.registerEntityRenderer(BFTPEntities.THROWN_SNOWDO_EGG.get(), ThrownItemRenderer::new);
        }
    }
}
