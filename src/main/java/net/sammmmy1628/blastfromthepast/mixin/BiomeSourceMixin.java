package net.sammmmy1628.blastfromthepast.mixin;

import java.util.Set;
import java.util.function.Supplier;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.sammmmy1628.blastfromthepast.level.BiomeSourceAccessor;

@Mixin(BiomeSource.class)
public class BiomeSourceMixin implements BiomeSourceAccessor {
	
    @Shadow
    @Final
    @Mutable
    public Supplier<Set<Holder<Biome>>> possibleBiomes;
    
    private boolean bftp$expanded;
    
    @Override
    public void bftp_expandBiomesWith(Set<Holder<Biome>> newGenBiomes) {
        if(!this.bftp$expanded) {
            ImmutableSet.Builder<Holder<Biome>> builder = ImmutableSet.builder();
            builder.addAll(this.possibleBiomes.get());
            builder.addAll(newGenBiomes);
            this.possibleBiomes = Suppliers.memoize(builder::build);
            this.bftp$expanded = true;
        }
    }
}
