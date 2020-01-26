package AgentIj.SCP.TNG.entity;

import AgentIj.SCP.TNG.ai.AIMeleeAttack;
import AgentIj.SCP.TNG.ai.AINearestTarget;
import AgentIj.SCP.TNG.function.InternalFunction;
import AgentIj.SCP.TNG.function.MainFunction;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public abstract class EntityHostileSCP extends EntityCreeeature
{

    protected AIMeleeAttack meleeAttack;
    protected AINearestTarget<EntityLivingBase> baseAINearestTarget;


    public EntityHostileSCP(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        tasks.addTask(2,meleeAttack=new AIMeleeAttack(this,1,false));
        targetTasks.addTask(2,defense=new EntityAIHurtByTarget(this,false));
        targetTasks.addTask(3, baseAINearestTarget =new AINearestTarget<>(this,EntityLivingBase.class,true,true, MainFunction.humanTargets));
        InternalFunction.addApiTargets(this);
    }

    @Override
    public void onUpdate() {
        if(world.getDifficulty()== EnumDifficulty.PEACEFUL) setDead();
        super.onUpdate();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(Reference.PLAYER_WALK_SPEED);
    }

    @Override
    protected int getSpawnProbability() {
        return 25;
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        return super.attackEntityAsMob(entityIn);
    }
}
