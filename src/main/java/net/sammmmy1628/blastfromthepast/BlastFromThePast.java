package net.sammmmy1628.blastfromthepast;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.config.BFTPConfig;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.item.BFTPItems;
import net.sammmmy1628.blastfromthepast.misc.BFTPCreativeTabs;
import net.sammmmy1628.blastfromthepast.misc.BFTPEntityDataSerializers;
import net.sammmmy1628.blastfromthepast.network.BFTPNetwork;
import net.sammmmy1628.blastfromthepast.sound.BFTPSounds;
import net.sammmmy1628.blastfromthepast.world.BFTPFeatures;

@Mod(BlastFromThePast.MODID)
public class BlastFromThePast
{
	public static final String MODID = "blastfromthepast";
	
	public BlastFromThePast(FMLJavaModLoadingContext ctx) 
	{
		IEventBus bus = ctx.getModEventBus();

		BFTPCreativeTabs.CREATIVE_MODE_TAB.register(bus);
		BFTPItems.ITEMS.register(bus);
		BFTPEntities.ENTITY_TYPES.register(bus);
		BFTPEntityDataSerializers.SERIALIZERS.register(bus);
		BFTPBlocks.BLOCKS.register(bus);
		BFTPBlocks.BLOCK_ENTITIES.register(bus);
		BFTPSounds.SOUNDS.register(bus);
    	BFTPFeatures.FEATURES.register(bus);
		
		BFTPNetwork.registerMessages();
		ctx.registerConfig(Type.COMMON, BFTPConfig.CONFIG_SPEC, "blastfromthepast.toml");
	}
}
