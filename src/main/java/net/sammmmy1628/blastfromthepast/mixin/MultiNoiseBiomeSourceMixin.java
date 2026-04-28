package net.sammmmy1628.blastfromthepast.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.sammmmy1628.blastfromthepast.world.MultiNoiseBiomeSourceAccessor;
import net.sammmmy1628.blastfromthepast.world.biome.BFTPBiomeRarity;
import net.sammmmy1628.blastfromthepast.world.biome.BiomeGenerationConfig;
import net.sammmmy1628.blastfromthepast.world.biome.BiomeGenerationNoiseCondition;

@Mixin(value = MultiNoiseBiomeSource.class, priority = -69420)
public class MultiNoiseBiomeSourceMixin implements MultiNoiseBiomeSourceAccessor
{
	private RegistryAccess bftp$registryAccess;
    private ResourceKey<Level> bftp$lastSampledDimension;
    private long bftp$lastSampledWorldSeed;
    
	@Inject(at = @At("HEAD"), method = "Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
	private void dynasty_getNoiseBiomeCoords(int x, int y, int z, Climate.Sampler sampler, CallbackInfoReturnable<Holder<Biome>> cir)
	{
		if(this.bftp$registryAccess == null)
		{
			return;
		}
		
		if(this.bftp$lastSampledDimension != null && this.bftp$lastSampledDimension != Level.OVERWORLD)
		{
			return;
		}
		
		for(Map.Entry<ResourceKey<Biome>, BiomeGenerationNoiseCondition> entry : BiomeGenerationConfig.BIOMES.entrySet())
        {
            BiomeGenerationNoiseCondition condition = entry.getValue();
            var voronoiInfo = BFTPBiomeRarity.getRareBiomeInfoForQuad(condition.getOffsetAmount(), condition.getBiomeSize(), condition.getSeparationDistance(), this.bftp$lastSampledWorldSeed, x, z);
            if(voronoiInfo != null)
            {
                float unquantizedDepth = Climate.unquantizeCoord(sampler.sample(x, y, z).depth());
                int offsetId = BFTPBiomeRarity.getRareBiomeOffsetId(voronoiInfo, BiomeGenerationConfig.getBiomeCount());
                if(offsetId == condition.getRarityOffset() && condition.test(x, y, z, unquantizedDepth, sampler, this.bftp$lastSampledDimension, voronoiInfo))
                {
                    cir.setReturnValue(this.bftp$registryAccess.registryOrThrow(Registries.BIOME).getHolderOrThrow(entry.getKey()));
                    return;
                }
            }
        }
	}
	
	@Override
	public void bftp_setLastSampledDimension(ResourceKey<Level> key) 
	{
		this.bftp$lastSampledDimension = key;
	}
	
	@Override
	public void bftp_setRegistryAccess(RegistryAccess registryAccess) 
	{
		this.bftp$registryAccess = registryAccess;
	}
	
	@Override
	public void bftp_setLastSampledWorldSeed(long seed)
	{
		this.bftp$lastSampledWorldSeed = seed;
	}
}
