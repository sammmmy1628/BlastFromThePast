package net.sammmmy1628.blastfromthepast.entity.living;

import net.minecraft.Util;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.level.Level;
import net.sammmmy1628.blastfromthepast.entity.AbstractAnimatableAnimal;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperFlingGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperStompGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.LookAtTargetGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.MoveToTargetGoal;
import net.sammmmy1628.blastfromthepast.misc.SmoothAnimationState;

public class FrostomperEntity extends AbstractAnimatableAnimal
{
	public final SmoothAnimationState idleAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState stompAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState stomp2AnimationState = new SmoothAnimationState();
	public final SmoothAnimationState flingAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState earsAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState tailAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState trumpetAnimationState = new SmoothAnimationState();
	
	public AmbientType ambientType;
	public int ambientTick;
	
	public FrostomperEntity(EntityType<? extends TamableAnimal> pEntityType, Level pLevel) 
	{
		super(pEntityType, pLevel);
	}
	
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes()
    			.add(Attributes.MAX_HEALTH, 300.0F)
    			.add(Attributes.KNOCKBACK_RESISTANCE, 1.0F)
    			.add(Attributes.ATTACK_DAMAGE, 6.0F)
    			.add(Attributes.MOVEMENT_SPEED, 0.15F);
    }
    
	@Override
	public void playAmbientSound()
	{
		super.playAmbientSound();
		if(!this.isInWater() && !this.isTargetValid())
		{
			AmbientType type = AmbientType.getRandom(this.random);
			this.ambientType = type;
			this.ambientTick = type.tick;
		}
	}
	
    @Override
    protected void registerGoals() 
    {
    	super.registerGoals();
    	this.goalSelector.addGoal(0, new MoveToTargetGoal<>(this));
    	this.goalSelector.addGoal(0, new LookAtTargetGoal<>(this));
    	this.goalSelector.addGoal(0, new FrostomperStompGoal(this));
    	this.goalSelector.addGoal(0, new FrostomperFlingGoal(this));
    	this.targetSelector.addGoal(0, new HurtByTargetGoal(this).setAlertOthers());
    }
    
    @Override
    public void tick()
    {
    	super.tick();
    	if(this.level.isClientSide)
    	{
    		this.idleAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == null, this.tickCount);
    		this.stompAnimationState.updateWhen(this.isAnimationPlaying(1), this.tickCount);
    		this.stomp2AnimationState.updateWhen(this.isAnimationPlaying(2), this.tickCount);
    		this.flingAnimationState.updateWhen(this.isAnimationPlaying(3), this.tickCount);
    		this.earsAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.EARS, this.tickCount);
    		this.tailAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.TAIL, this.tickCount);
    		this.trumpetAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.TRUMPET, this.tickCount);
    	}
		if(this.ambientType != null)
		{
			this.ambientTick--;
			if(this.ambientTick <= 0)
			{
				this.ambientType = null;
				this.ambientTick = 0;
			}
		}
    }
    
    @Override
    protected void updateWalkAnimation(float pPartialTick) 
    {
        float f = Math.min(pPartialTick * 8.0F, 1.0F);
        this.walkAnimation.update(f, 0.4F);
    }

	@Override
	public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) 
	{
		if(!this.isBaby())
		{
			return BFTPEntities.FROSTOMPER.get().create(pLevel);
		}
		return null;
	}
	
	public static enum AmbientType
	{
		EARS(21),
		TAIL(25),
		TRUMPET(30);
		
		int tick;
		
		private AmbientType(int tick) 
		{
			this.tick = tick;
		}
		
		public static AmbientType getRandom(RandomSource random)
		{
			return Util.getRandom(AmbientType.values(), random);
		}
	}
}
