package net.sammmmy1628.blastfromthepast.level;

import java.util.Set;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;

public interface BiomeSourceAccessor {
    void expandBiomesWith(Set<Holder<Biome>> set);
}
