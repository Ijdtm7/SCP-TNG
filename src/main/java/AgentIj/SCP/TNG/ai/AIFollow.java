package AgentIj.SCP.TNG.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;

import java.util.List;
import java.util.function.Predicate;

public class AIFollow extends AIBase {
    protected EntityLiving follower;
    protected Class<? extends EntityLivingBase> targetClass;
    protected boolean alwaysLookAt;
    protected EntityLivingBase target;
    protected Predicate<EntityLivingBase> condition;


    public AIFollow(EntityLiving livingEntity, Class<? extends EntityLivingBase> targetClass_, boolean lookAtTarget)
    {
        alwaysLookAt=lookAtTarget;
        follower=livingEntity;
        targetClass=targetClass_;
    }

    public AIFollow(EntityLiving livingEntity,Class<? extends EntityLivingBase> targetClass_, boolean lookAtTarget,Predicate<EntityLivingBase> predicate)
    {
        this(livingEntity, targetClass_, lookAtTarget);
        condition=predicate;
    }



    @Override
    public boolean shouldExecute() {
        double range=follower.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue();
        List<EntityLivingBase> targets=follower.world.getEntitiesWithinAABB(targetClass, follower.getEntityBoundingBox().grow(range));
        if (!targets.isEmpty())
        {
            target=targets.get(follower.getRNG().nextInt(targets.size()));
            if (condition!=null)
            {
                return condition.test(target);
            }
            return true;
        }


        return false;
    }


    @Override
    public void resetTask() {
        target = null;
        follower.getNavigator().clearPath();
    }


    @Override
    public boolean shouldContinueExecuting() {
        if(target!=null)
        {
            if(condition!=null)
                return condition.test(target);
        }
        return target!=null;
    }


    @Override
    public void updateTask() {
        if(alwaysLookAt)
            follower.getLookHelper().setLookPositionWithEntity(target,30,30);
        follower.getNavigator().tryMoveToEntityLiving(target,1);
        if(follower.getDistanceSq(target)<4)
        {
            follower.getNavigator().clearPath();
        }
    }




}
