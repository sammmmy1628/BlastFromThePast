package net.sammmmy1628.blastfromthepast.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.entity.projectile.ThrownSnowdoEgg;

public class BFTPEntities
{
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BlastFromThePast.MODID);

	public static final RegistryObject<EntityType<CameraShakeEntity>> CAMERA_SHAKE = registerEntity("camera_shake", EntityType.Builder.<CameraShakeEntity>of(CameraShakeEntity::new, MobCategory.MISC).sized(0.0F, 0.0F));

    public static final RegistryObject<EntityType<ThrownSnowdoEgg>> THROWN_SNOWDO_EGG = ENTITY_TYPES.register("thrown_snowdo_egg",
            () -> EntityType.Builder.<ThrownSnowdoEgg>of(ThrownSnowdoEgg::new, MobCategory.MISC)
                    .sized(0.25F, 0.25F)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "thrown_snowdo_egg").toString()));

    public static final RegistryObject<EntityType<SnowdoEntity>> SNOWDO =
            ENTITY_TYPES.register("snowdo", () -> EntityType.Builder.of(SnowdoEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "snowdo").toString()));
    
    public static final RegistryObject<EntityType<FrostomperEntity>> FROSTOMPER = registerEntity("frostomper", createBuilder(FrostomperEntity::new, MobCategory.CREATURE).sized(3.0F, 4.375F));

	public static <T extends Entity> EntityType.Builder<T> createBuilder(EntityType.EntityFactory<T> factory, MobCategory category)
	{
		return EntityType.Builder.<T>of(factory, category);
	}
	
	public static <T extends Entity> RegistryObject<EntityType<T>> registerEntity(String name, EntityType.Builder<T> builder) 
	{
		return ENTITY_TYPES.register(name, () -> builder.build(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, name).toString()));
	}
}
