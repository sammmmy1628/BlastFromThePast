package net.sammmmy1628.blastfromthepast.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.init.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.item.custom.SnowdoEggItem;

public class BFTPItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlastFromThePast.MOD_ID);

    public static final RegistryObject<Item> CEDAR_SIGN = ITEMS.register("cedar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), BFTPBlocks.CEDAR_SIGN.get(), BFTPBlocks.CEDAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> CEDAR_HANGING_SIGN = ITEMS.register("cedar_hanging_sign",
            () -> new HangingSignItem(BFTPBlocks.CEDAR_HANGING_SIGN.get(), BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SNOWDO_SPAWN_EGG = ITEMS.register("snowdo_spawn_egg",
            () -> new ForgeSpawnEggItem(BFTPEntities.SNOWDO, 0x48446e, 0x67a4da, new Item.Properties()));

    public static final RegistryObject<Item> SNOWDO_EGG = ITEMS.register("snowdo_egg",
            () -> new SnowdoEggItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GELIMELON_SLICE = ITEMS.register("gelimelon_slice",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2) // Similar al melón
                    .saturationMod(0.3F)
                    .build())));

    public static final RegistryObject<Item> GELIMELON_SEEDS = ITEMS.register("gelimelon_seeds",
            () -> new ItemNameBlockItem(BFTPBlocks.GELIMELON_STEM.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> SNOWDO_EGG_COOKED = ITEMS.register("snowdo_egg_cooked",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationMod(0.6F)
                    .build())) {
                @Override
                public int getUseDuration(ItemStack pStack) {
                    return 16;
                }
            });

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
