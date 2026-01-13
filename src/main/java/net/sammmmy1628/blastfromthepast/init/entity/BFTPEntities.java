package net.sammmmy1628.blastfromthepast.init.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.entity.custom.ThrownSnowdoEgg;

public class BFTPEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BlastFromThePast.MOD_ID);

    public static final RegistryObject<EntityType<ThrownSnowdoEgg>> THROWN_SNOWDO_EGG = ENTITY_TYPES.register("thrown_snowdo_egg",
            () -> EntityType.Builder.<ThrownSnowdoEgg>of(ThrownSnowdoEgg::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("thrown_snowdo_egg"));

    public static final RegistryObject<EntityType<SnowdoEntity>> SNOWDO =
            ENTITY_TYPES.register("snowdo", () -> EntityType.Builder.of(SnowdoEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(BlastFromThePast.MOD_ID, "snowdo").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}