package AgentIj.SCP.TNG.ai.statue;

import AgentIj.SCP.TNG.function.PlayerObserve;
import AgentIj.SCP.TNG.util.Util;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;
import java.util.function.Predicate;

public class Movement extends EntityAIWanderAvoidWater {

    private Predicate<EntityLivingBase> stopCondition=entityLivingBase ->
    {
        if(entityLivingBase instanceof PlayerObserve)
        {
            PlayerObserve playerObserve = (PlayerObserve) entityLivingBase;
            return playerObserve.canTriggerStatue();
        }
        return Util.isEntitySurvivalPlayer(entityLivingBase);

    };


    @Override
    public boolean shouldExecute() {
        return canMove() &&  super.shouldExecute();
    }

    public Movement(EntityCreature creature, double speedFactor, float probability) {
        super(creature, speedFactor, probability);
    }


    @Override
    public boolean shouldContinueExecuting() {
        return canMove() && super.shouldContinueExecuting();
    }

    private boolean canMove()
    {
        double range = entity.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue();
        List<EntityLivingBase> entities=Util.getEntitiesInsideExcept(entity,EntityLivingBase.class,new AxisAlignedBB(entity.getPosition()).grow(range), stopCondition);
        entities.removeIf(entityLivingBase -> entityLivingBase.isPotionActive(MobEffects.BLINDNESS) && entity.getDistance(entityLivingBase)>6);
        for (EntityLivingBase entity : entities) {
            if(Util.isInSightOf(this.entity,entity,80)) {
                return false;
            }
        }
        return true;
    }




}
