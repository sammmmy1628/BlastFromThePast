package net.sammmmy1628.blastfromthepast.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.level.feature.GlacierFeature;

public class BFTPFeatures
{
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, BlastFromThePast.MOD_ID);
    
    public static final RegistryObject<GlacierFeature> GLACIER = FEATURES.register("glacier", () -> new GlacierFeature(NoneFeatureConfiguration.CODEC));
    
    public static void register(IEventBus eventBus) {
    	FEATURES.register(eventBus);
    }
}
