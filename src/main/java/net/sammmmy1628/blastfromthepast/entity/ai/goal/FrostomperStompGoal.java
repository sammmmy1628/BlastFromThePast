package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.List;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;

public class FrostomperStompGoal extends AbstractAnimationGoal<FrostomperEntity>
{
	public FrostomperStompGoal(FrostomperEntity mob) 
	{
		super(mob);
	}
	
	@Override
	public void start()
	{
		super.start();
		if(this.mob.getRandom().nextBoolean())
		{
			this.mob.setAnimationState(1);
			
		}
		else
		{
			this.mob.setAnimationState(2);
		}
	}
	
	@Override
	public boolean canUse() 
	{
		return super.canUse() && this.mob.distanceTo(this.mob.getTarget()) <= 4.0F;
	}
	
	@Override
	public void performSkill() 
	{
		this.mob.playSound(SoundEvents.GENERIC_EXPLODE, 2.0F, 1.0F);
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
	public int getSkillUsingTime()
	{
		return 20;
	}
	
	@Override
	public int getSkillWarmupTime() 
	{
		return 14;
	}

	@Override
	public int getSkillUsingInterval() 
	{
		return 40;
	}
}
