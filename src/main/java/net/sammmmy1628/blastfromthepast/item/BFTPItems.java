package net.sammmmy1628.blastfromthepast.item;

import java.util.function.Supplier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.sound.BFTPSounds;

public class BFTPItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlastFromThePast.MODID);
	
    public static final RegistryObject<Item> CEDAR_SIGN = ITEMS.register("cedar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), BFTPBlocks.CEDAR_SIGN.get(), BFTPBlocks.CEDAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> CEDAR_HANGING_SIGN = ITEMS.register("cedar_hanging_sign",
            () -> new HangingSignItem(BFTPBlocks.CEDAR_HANGING_SIGN.get(), BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SNOWDO_SPAWN_EGG = registerSpawnEgg("snowdo_spawn_egg", () -> BFTPEntities.SNOWDO.get(), 0x48446e, 0x67a4da);

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

    public static final RegistryObject<Item> GELIMELON_ICE_CREAM = ITEMS.register("gelimelon_ice_cream",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.6f)
                            .build())));

    public static final RegistryObject<Item> MUSIC_DISC_BFTP = ITEMS.register("music_disc_bftp",
            () -> new RecordItem(15, BFTPSounds.MUSIC_DISC_BFTP, new Item.Properties().stacksTo(1), 3120));

    
	public static RegistryObject<Item> registerBlockItem(String name, Supplier<Block> block, Item.Properties properties)
	{
		return ITEMS.register(name, () -> new BlockItem(block.get(), properties));
	}
	
	public static <T extends Mob> RegistryObject<Item> registerSpawnEgg(String name, Supplier<EntityType<T>> entity, int color1, int color2) 
	{
		return ITEMS.register(name, () -> new ForgeSpawnEggItem(entity, color1, color2, new Item.Properties()));
	}
}
