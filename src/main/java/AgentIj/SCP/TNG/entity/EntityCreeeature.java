package AgentIj.SCP.TNG.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class EntityCreeeature extends EntityCreature {

    protected EntityAIWander wandering;
    protected EntityAIHurtByTarget defense;
    protected EntityAISwimming swimming;

    @Override
    protected void initEntityAI() {
        tasks.addTask(0,swimming=new EntityAISwimming(this));
        tasks.addTask(4,wandering=new EntityAIWanderAvoidWater(this,1,4));
    }

    public EntityCreeeature(World worldIn) {
        super(worldIn);
    }



    @Override
    public boolean canBeLeashedTo(EntityPlayer player) {
        return player.isCreative() || (super.canBeLeashedTo(player) && getAttackTarget()==null && getRevengeTarget()==null);
    }


    @Override
    protected void handleJumpWater() {
        motionY += 0.04;
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        return (int) (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()+getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getAttributeValue());
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23);
    }

    protected int getSpawnProbability(){
        return 50;
    }
}
