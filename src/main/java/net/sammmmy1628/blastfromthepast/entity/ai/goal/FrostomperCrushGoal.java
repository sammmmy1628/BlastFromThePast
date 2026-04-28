package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.List;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;

public class FrostomperCrushGoal extends AbstractAnimationGoal<FrostomperEntity>
{
	public FrostomperCrushGoal(FrostomperEntity mob) 
	{
		super(mob);
	}
	
	@Override
	public void start()
	{
		super.start();
		this.mob.setAnimationState(5);
	}
	
	@Override
	public boolean canUse() 
	{
		if(this.mob.isBaby())
		{
			return false;
		}
		return super.canUse() && this.mob.distanceTo(this.mob.getTarget()) <= 4.0F && this.mob.getRandom().nextInt(3) == 0;
	}
	
	@Override
	public void performSkill() 
	{
		float size = 3.5F;
		List<LivingEntity> list = this.mob.level.getEntitiesOfClass(LivingEntity.class, new AABB(-size, 0.0F, -size, size, size, size).move(this.mob.getLegPos(this.mob.getAnimationState())), t -> t != this.mob && !t.isAlliedTo(this.mob));
		list.forEach(t -> 
		{
			if(this.mob.doHurtTarget(t))
			{
				t.addDeltaMovement(new Vec3(0, 0.4F, 0));
				t.hurtMarked = true;
			}
		});
	}

	@Override
	public int getSkillUsingTime()
	{
		return 20;
	}
	
	@Override
	public int getSkillWarmupTime() 
	{
		return 12;
	}

	@Override
	public int getSkillUsingInterval() 
	{
		return 40;
	}
}
