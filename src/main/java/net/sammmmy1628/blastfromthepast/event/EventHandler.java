package net.sammmmy1628.blastfromthepast.event;

import com.google.common.collect.ImmutableSet;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

@Mod.EventBusSubscriber(modid = BlastFromThePast.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler 
{
	@SubscribeEvent
	public static void onFMLCommonSetup(FMLCommonSetupEvent event)
	{
		event.enqueueWork(() -> 
		{
            ImmutableSet.Builder<Block> validSignBlocks = new ImmutableSet.Builder<>();
            validSignBlocks.addAll(BlockEntityType.SIGN.validBlocks);
            validSignBlocks.add(BFTPBlocks.CEDAR_SIGN.get());
            validSignBlocks.add(BFTPBlocks.CEDAR_WALL_SIGN.get());
            BlockEntityType.SIGN.validBlocks = validSignBlocks.build();
            
            ImmutableSet.Builder<Block> validHangingSignBlocks = new ImmutableSet.Builder<>();
            validHangingSignBlocks.addAll(BlockEntityType.HANGING_SIGN.validBlocks);
            validSignBlocks.add(BFTPBlocks.CEDAR_HANGING_SIGN.get());
            validSignBlocks.add(BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get());
            BlockEntityType.HANGING_SIGN.validBlocks = validHangingSignBlocks.build();
		});
	}
	
    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) 
    {
        event.put(BFTPEntities.SNOWDO.get(), SnowdoEntity.createAttributes().build());
        event.put(BFTPEntities.FROSTOMPER.get(), FrostomperEntity.createAttributes().build());
    }
    
    @SubscribeEvent
    public static void onSpawnPlacementRegister(SpawnPlacementRegisterEvent event)
    {
    	
    }
}
