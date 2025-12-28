package net.sammmmy1628.blastfromthepast.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class BFTPCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlastFromThePast.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLAST_FROM_THE_PAST = CREATIVE_MODE_TABS.register("blast_from_the_past_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BFTPBlocks.CEDAR_LOG.get()))
                    .title(Component.translatable("creativetab.blast_from_the_past_items"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(BFTPBlocks.CEDAR_LOG.get());
                        pOutput.accept(BFTPBlocks.CEDAR_STRIPPED_LOG.get());
                        pOutput.accept(BFTPBlocks.CEDAR_PLANKS.get());

                        pOutput.accept(BFTPBlocks.CEDAR_STAIRS.get());
                        pOutput.accept(BFTPBlocks.CEDAR_SLAB.get());
                        pOutput.accept(BFTPBlocks.CEDAR_BUTTON.get());
                        pOutput.accept(BFTPBlocks.CEDAR_PRESSURE_PLATE.get());
                        pOutput.accept(BFTPBlocks.CEDAR_FENCE.get());
                        pOutput.accept(BFTPBlocks.CEDAR_FENCE_GATE.get());
                        pOutput.accept(BFTPBlocks.CEDAR_DOOR.get());
                        pOutput.accept(BFTPBlocks.CEDAR_TRAPDOOR.get());

                        pOutput.accept(BFTPBlocks.CEDAR_SIGN.get());
                        pOutput.accept(BFTPBlocks.CEDAR_WALL_SIGN.get());
                        pOutput.accept(BFTPBlocks.CEDAR_HANGING_SIGN.get());
                        pOutput.accept(BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get());

                        pOutput.accept(BFTPItems.CEDAR_SIGN.get());
                        pOutput.accept(BFTPItems.CEDAR_HANGING_SIGN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
