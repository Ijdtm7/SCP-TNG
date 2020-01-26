package AgentIj.SCP.TNG.ai.statue;

import AgentIj.SCP.TNG.ai.AINearestTarget;
import AgentIj.SCP.TNG.function.Human;
import AgentIj.SCP.TNG.util.Util;
import com.google.common.base.Predicate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.AxisAlignedBB;

import javax.annotation.Nullable;
import java.util.List;

public class Target extends AINearestTarget<EntityLivingBase>
{
    private Predicate<EntityLivingBase> condition = input -> input instanceof Human || Util.isEntitySurvivalPlayer(input);

    public Target(EntityCreature creature, Class<EntityLivingBase> classTarget, boolean checkSight, boolean onlyNearby) {
        super(creature, classTarget, checkSight, onlyNearby, input -> input instanceof Human || Util.isEntitySurvivalPlayer(input));
    }






    @Override
    public boolean shouldExecute() {

        return canMove(taskOwner) && super.shouldExecute();
    }

    @Override
    public boolean shouldContinueExecuting() {

        return canMove(taskOwner) && super.shouldContinueExecuting();
    }

    private boolean canMove(EntityLivingBase taskOwner){
        double detection=taskOwner.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getAttributeValue();
        List<EntityLivingBase> entities= Util.getEntitiesInsideExcept(taskOwner,EntityLivingBase.class,new AxisAlignedBB(taskOwner.getPosition()).grow(detection),condition );

        entities.removeIf(entityLivingBase -> entityLivingBase.isPotionActive(MobEffects.BLINDNESS) && taskOwner.getDistance(entityLivingBase)>6);
        for (EntityLivingBase entity : entities) {
            if(Util.isInSightOf(taskOwner,entity,80))
            {
                return false;
            }
        }
        return true;
    }
}
