package net.sammmmy1628.blastfromthepast.entity.custom.ai;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;

import java.util.EnumSet;

public class SnowdoDanceGoal extends Goal {
    private final SnowdoEntity entity;
    private BlockPos jukeboxPos;

    public SnowdoDanceGoal(SnowdoEntity entity) {
        this.entity = entity;
        // MOVE: Para que se detenga. JUMP/LOOK: Para que pueda mirar a la caja pero no salte a lo loco.
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        // Optimización: Solo buscar cada 20 ticks (1 segundo) para no laggear
        if (this.entity.tickCount % 20 != 0) {
            return false;
        }

        // Si ya está bailando o haciendo algo importante, no buscar
        if (this.entity.isPassenger() || this.entity.isBaby()) {
            return false;
        }

        this.jukeboxPos = this.findJukebox();
        return this.jukeboxPos != null;
    }

    @Override
    public boolean canContinueToUse() {
        // Sigue bailando si:
        // 1. La Jukebox sigue ahí y tiene un disco.
        // 2. Estamos cerca (menos de 16 bloques cuadrados = 4 bloques de distancia).
        return this.jukeboxPos != null
                && this.isJukeboxPlaying(this.jukeboxPos)
                && this.entity.distanceToSqr(this.jukeboxPos.getX() + 0.5, this.jukeboxPos.getY() + 0.5, this.jukeboxPos.getZ() + 0.5) < 16.0D;
    }

    @Override
    public void start() {
        this.entity.setDancing(true);
        this.entity.getNavigation().stop(); // ¡Quieto!
    }

    @Override
    public void stop() {
        this.entity.setDancing(false);
        this.jukeboxPos = null;
    }

    @Override
    public void tick() {
        // Mantenerse quieto y mirar a la Jukebox
        if (this.jukeboxPos != null) {
            this.entity.getLookControl().setLookAt(this.jukeboxPos.getX() + 0.5, this.jukeboxPos.getY() + 1.0, this.jukeboxPos.getZ() + 0.5);
        }
    }

    // --- MÉTODOS DE BÚSQUEDA ---

    private BlockPos findJukebox() {
        BlockPos entityPos = this.entity.blockPosition();
        // Buscar en un radio de 4 bloques
        for (BlockPos pos : BlockPos.betweenClosed(entityPos.offset(-4, -2, -4), entityPos.offset(4, 2, 4))) {
            if (isJukeboxPlaying(pos)) {
                return pos.immutable();
            }
        }
        return null;
    }

    private boolean isJukeboxPlaying(BlockPos pos) {
        BlockState state = this.entity.level().getBlockState(pos);
        // Verifica si es Jukebox Y si tiene la propiedad HAS_RECORD en true
        return state.is(Blocks.JUKEBOX) && state.getValue(JukeboxBlock.HAS_RECORD);
    }
}