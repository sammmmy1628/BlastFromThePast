package net.sammmmy1628.blastfromthepast.event;

import java.util.Optional;
import java.util.Set;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.world.BFTPBiomes;
import net.sammmmy1628.blastfromthepast.world.BiomeSourceAccessor;

@Mod.EventBusSubscriber(modid = BlastFromThePast.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandlerForge 
{
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onServerAboutToStart(ServerAboutToStartEvent event)
    {
        RegistryAccess registryAccess = event.getServer().registryAccess();
        Registry<Biome> biomes = registryAccess.registryOrThrow(Registries.BIOME);
        Registry<LevelStem> levelStems = registryAccess.registryOrThrow(Registries.LEVEL_STEM);
        
        Optional<Holder.Reference<LevelStem>> holder = levelStems.getHolder(LevelStem.OVERWORLD);
        if(holder.isPresent() && holder.get().value().generator().getBiomeSource() instanceof BiomeSourceAccessor expandedBiomeSource)
        {
            expandedBiomeSource.bftp_expandBiomesWith(Set.of(biomes.getHolderOrThrow(BFTPBiomes.FROSTBITE_FOREST)));
        }
    }
}