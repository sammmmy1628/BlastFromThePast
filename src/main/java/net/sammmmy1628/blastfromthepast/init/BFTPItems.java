package net.sammmmy1628.blastfromthepast.init;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class BFTPItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlastFromThePast.MOD_ID);

    public static final RegistryObject<Item> CEDAR_SIGN = ITEMS.register("cedar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), BFTPBlocks.CEDAR_SIGN.get(), BFTPBlocks.CEDAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> CEDAR_HANGING_SIGN = ITEMS.register("cedar_hanging_sign",
            () -> new HangingSignItem(BFTPBlocks.CEDAR_HANGING_SIGN.get(), BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
