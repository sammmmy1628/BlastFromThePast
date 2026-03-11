package net.sammmmy1628.blastfromthepast.mixin;

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
import net.sammmmy1628.blastfromthepast.misc.BFTPBiomes;
import net.sammmmy1628.blastfromthepast.world.MultiNoiseBiomeSourceAccessor;

@Mixin(MultiNoiseBiomeSource.class)
public class MultiNoiseBiomeSourceMixin implements MultiNoiseBiomeSourceAccessor
{
	private RegistryAccess bftp$registryAccess;
    private ResourceKey<Level> bftp$lastSampledDimension;
    
	@Inject(at = @At("HEAD"),
			method = "Lnet/minecraft/world/level/biome/MultiNoiseBiomeSource;getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;",
			cancellable = true
	)
	private void bftp_getNoiseBiomeCoords(int x, int y, int z, Climate.Sampler sampler, CallbackInfoReturnable<Holder<Biome>> cir) {
        Climate.TargetPoint targetPoint = sampler.sample(x, y, z);
        float f = Climate.unquantizeCoord(targetPoint.continentalness());
        float f1 = Climate.unquantizeCoord(targetPoint.erosion());
        float f2 = Climate.unquantizeCoord(targetPoint.temperature());
        float f3 = Climate.unquantizeCoord(targetPoint.humidity());
        float f4 = Climate.unquantizeCoord(targetPoint.weirdness());
        float f5 = Climate.unquantizeCoord(targetPoint.depth());
        if(this.bftp$lastSampledDimension == Level.OVERWORLD && this.bftp$registryAccess != null) {
            if(this.bftp_test(f, f1, f2, f3, f4, f5)) {
            	cir.setReturnValue(this.bftp$registryAccess.registryOrThrow(Registries.BIOME).getHolderOrThrow(BFTPBiomes.FROSTBITE_FOREST));
            }
        }
	}
	
	@Override
	public void bftp_setLastSampledDimension(ResourceKey<Level> key) {
		this.bftp$lastSampledDimension = key;
	}
	
	@Override
	public void bftp_setRegistryAccess(RegistryAccess registryAccess) {
		this.bftp$registryAccess = registryAccess;
	}
	
	private boolean bftp_test(float continentalness, float erosion, float temperature, float humidity, float weirdness, float depth) {
		if(continentalness < 0.3F || continentalness > 1.0F) {
			return false;
		}
		if(temperature < -1.0F || temperature > -0.45F) {
			return false;
		}
		return true;
	}
}
