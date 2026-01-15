package net.sammmmy1628.blastfromthepast.entity.custom.ai;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;

import java.util.EnumSet;

public class SnowdoBreakMelonGoal extends Goal {
    private final SnowdoEntity animal;
    private final Level level;
    private BlockPos targetBlock = null;
    private int timer = 0;

    // CONFIGURACIÓN DE TIEMPOS
    private static final int ANIMATION_LENGTH = 25; // Duración total
    private static final int BREAK_TICK = 15;       // Momento del impacto

    public SnowdoBreakMelonGoal(SnowdoEntity animal) {
        this.animal = animal;
        this.level = animal.level();
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        // Validación básica: Solo si no está durmiendo, montado, etc.
        if (this.animal.isBaby() || this.animal.isVehicle()) return false;

        // Probabilidad para no hacerlo todo el tiempo (opcional)
        if (this.animal.getRandom().nextInt(100) != 0) return false;

        this.targetBlock = findNearbyMelon();
        return this.targetBlock != null;
    }

    @Override
    public void start() {
        this.timer = 0;
        if (this.targetBlock != null) {
            this.animal.getNavigation().moveTo(this.targetBlock.getX() + 0.5D, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5D, 1.0D);
        }
    }

    @Override
    public void tick() {
        if (this.targetBlock == null) return;

        // Mirar al bloque
        this.animal.getLookControl().setLookAt(this.targetBlock.getX() + 0.5, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5);

        double distSq = this.animal.distanceToSqr(this.targetBlock.getX() + 0.5D, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5D);

        // Si está cerca (rango de 2 bloques)
        if (distSq <= 4.0D) {
            this.animal.getNavigation().stop();
            this.timer++;

            // Activar animación en el servidor
            if (this.timer == 1) {
                this.animal.setBreaking(true);
            }

            // ROMPER EL BLOQUE
            if (this.timer == BREAK_TICK) {
                BlockState state = this.level.getBlockState(this.targetBlock);
                if (state.is(BFTPBlocks.GELIMELON_BLOCK.get())) {
                    this.level.levelEvent(2001, this.targetBlock, Block.getId(state));
                    this.level.playSound(null, this.targetBlock, SoundEvents.ZOMBIE_BREAK_WOODEN_DOOR, SoundSource.HOSTILE, 1.0f, 1.0f);

                    // destroyBlock(true) hace que suelte el loot (las rodajas/slices)
                    this.level.destroyBlock(this.targetBlock, true);
                }
            }
        }
    }

    @Override
    public boolean canContinueToUse() {
        return this.targetBlock != null && this.timer < ANIMATION_LENGTH && this.level.getBlockState(this.targetBlock).is(BFTPBlocks.GELIMELON_BLOCK.get());
    }

    @Override
    public void stop() {
        this.targetBlock = null;
        this.timer = 0;
        this.animal.setBreaking(false); // Apagar animación
    }

    private BlockPos findNearbyMelon() {
        BlockPos pos = this.animal.blockPosition();
        // Buscar en un radio de 8 bloques
        for (BlockPos nearbyPos : BlockPos.betweenClosed(pos.offset(-8, -2, -8), pos.offset(8, 2, 8))) {
            if (this.level.getBlockState(nearbyPos).is(BFTPBlocks.GELIMELON_BLOCK.get())) {
                return nearbyPos.immutable();
            }
        }
        return null;
    }
}