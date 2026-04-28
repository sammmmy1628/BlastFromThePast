package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.List;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.util.BFTPUtil;

public class FrostomperChargeGoal extends AbstractAnimationGoal<FrostomperEntity>
{
	public FrostomperChargeGoal(FrostomperEntity mob) 
	{
		super(mob);
	}
	
	@Override
	public void start()
	{
		super.start();
		this.mob.setAnimationState(4);
		this.mob.setStopLookTick(this.getSkillUsingTime());
	}
	
	@Override
	public boolean canUse() 
	{
		if(this.mob.isBaby())
		{
			return false;
		}
		return super.canUse() && this.mob.distanceTo(this.mob.getTarget()) >= 15.0F;
	}
	
	@Override
	public boolean canContinueToUse()
	{
		return super.canContinueToUse() && this.mob.getTarget() != null && this.mob.distanceTo(this.mob.getTarget()) >= 2.0F && this.mob.distanceTo(this.mob.getTarget()) <= 20.0F;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		BFTPUtil.dashToward(this.mob, 0.5F);
		List<LivingEntity> list = this.mob.level.getEntitiesOfClass(LivingEntity.class, this.mob.getBoundingBox().inflate(2.0F), t -> t != this.mob && !t.isAlliedTo(this.mob));
		list.forEach(t -> 
		{
			if(this.mob.doHurtTarget(t))
			{
				t.addDeltaMovement(new Vec3(0, 0.2F, 0));
				t.hurtMarked = true;
			}
		});
	}
	
	@Override
	public void stop() 
	{
		super.stop();
		this.mob.setAnimationTick(0);
	}

	@Override
	public int getSkillUsingTime()
	{
		return 150;
	}
	
	@Override
	public int getSkillUsingInterval() 
	{
		return 80;
	}
}
