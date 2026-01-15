package net.sammmmy1628.blastfromthepast.level;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public interface MultiNoiseBiomeSourceAccessor {
    void setRegistryAccess(RegistryAccess registryAccess);

    void setLastSampledDimension(ResourceKey<Level> key);
}
