package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.util.BFTPUtil;

public class FrostomperFlingGoal extends AbstractAnimationGoal<FrostomperEntity>
{
	public FrostomperFlingGoal(FrostomperEntity mob) 
	{
		super(mob);
	}
	
	@Override
	public void start()
	{
		super.start();
		this.mob.setAnimationState(3);
	}
	
	@Override
	public boolean canUse() 
	{
		return super.canUse() && this.mob.distanceTo(this.mob.getTarget()) <= 3.0F;
	}
	
	@Override
	public void performSkill() 
	{
		if(this.mob.getTarget() != null && this.mob.distanceTo(this.mob.getTarget()) <= 3.0F)
		{
			if(this.mob.doHurtTarget(this.mob.getTarget()))
			{
				Vec3 motion = BFTPUtil.getVelocityTowards(this.mob.position(), this.mob.getTarget().position(), 2.5F);
				this.mob.getTarget().setDeltaMovement(new Vec3(motion.x, 0.8F, motion.z));
				this.mob.getTarget().hurtMarked = true;
			}
		}
	}

	@Override
	public int getSkillUsingTime()
	{
		return 15;
	}
	
	@Override
	public int getSkillWarmupTime() 
	{
		return 8;
	}

	@Override
	public int getSkillUsingInterval() 
	{
		return 20;
	}
}
