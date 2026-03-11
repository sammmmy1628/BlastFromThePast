package net.sammmmy1628.blastfromthepast.misc;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.item.BFTPItems;

public class BFTPCreativeTabs 
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlastFromThePast.MODID);

    public static final RegistryObject<CreativeModeTab> BLAST_FROM_THE_PAST = CREATIVE_MODE_TAB.register(BlastFromThePast.MODID, () -> CreativeModeTab.builder()
    		.title(Component.translatable("itemGroup.blastfromthepast"))
    		.icon(() -> new ItemStack(BFTPBlocks.CEDAR_LOG.get()))
    		.displayItems((enabledFeatures, output) -> 
    		{
                output.accept(BFTPBlocks.CEDAR_LOG.get());
                output.accept(BFTPBlocks.CEDAR_STRIPPED_LOG.get());
                output.accept(BFTPBlocks.CEDAR_PLANKS.get());

                output.accept(BFTPBlocks.CEDAR_STAIRS.get());
                output.accept(BFTPBlocks.CEDAR_SLAB.get());
                output.accept(BFTPBlocks.CEDAR_BUTTON.get());
                output.accept(BFTPBlocks.CEDAR_PRESSURE_PLATE.get());
                output.accept(BFTPBlocks.CEDAR_FENCE.get());
                output.accept(BFTPBlocks.CEDAR_FENCE_GATE.get());
                output.accept(BFTPBlocks.CEDAR_DOOR.get());
                output.accept(BFTPBlocks.CEDAR_TRAPDOOR.get());

                output.accept(BFTPBlocks.CEDAR_SIGN.get());
                output.accept(BFTPBlocks.CEDAR_WALL_SIGN.get());
                output.accept(BFTPBlocks.CEDAR_HANGING_SIGN.get());
                output.accept(BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get());

                output.accept(BFTPBlocks.CEDAR_CONE.get());

                output.accept(BFTPItems.CEDAR_SIGN.get());
                output.accept(BFTPItems.CEDAR_HANGING_SIGN.get());

                output.accept(BFTPItems.SNOWDO_SPAWN_EGG.get());
                output.accept(BFTPItems.SNOWDO_EGG.get());
                output.accept(BFTPItems.SNOWDO_EGG_COOKED.get());

                output.accept(BFTPBlocks.GELIMELON_BLOCK.get());
                output.accept(BFTPItems.GELIMELON_SLICE.get());
                output.accept(BFTPItems.GELIMELON_SEEDS.get());
                output.accept(BFTPItems.GELIMELON_ICE_CREAM.get());

                output.accept(BFTPItems.MUSIC_DISC_BFTP.get());

                output.accept(BFTPItems.FROSTOMPER_SPAWN_EGG.get());
    		}).build());
}
