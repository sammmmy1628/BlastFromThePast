package net.sammmmy1628.blastfromthepast.entity.custom;

import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;
import net.sammmmy1628.blastfromthepast.init.entity.BFTPEntities;

public class ThrownSnowdoEgg extends ThrowableItemProjectile {
    public ThrownSnowdoEgg(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrownSnowdoEgg(Level pLevel, LivingEntity pShooter) {
        super(BFTPEntities.THROWN_SNOWDO_EGG.get(), pShooter, pLevel);
    }

    public ThrownSnowdoEgg(Level pLevel, double pX, double pY, double pZ) {
        super(BFTPEntities.THROWN_SNOWDO_EGG.get(), pX, pY, pZ, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return BFTPItems.SNOWDO_EGG.get(); // El ítem visual que se lanza
    }

    @Override
    public void handleEntityEvent(byte pId) {
        if (pId == 3) {
            // Partículas al romperse (usa el ítem por defecto)
            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(new ItemParticleOption(ParticleTypes.ITEM, this.getItem()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D);
            }
        }
    }

    @Override
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3); // Genera partículas

            // Lógica de Spawn 100%
            SnowdoEntity snowdo = BFTPEntities.SNOWDO.get().create(this.level());
            if (snowdo != null) {
                snowdo.setAge(-24000); // Spawnea como bebé (como los pollos)
                snowdo.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                this.level().addFreshEntity(snowdo);
            }

            this.discard(); // Desaparece el proyectil
        }
    }
}