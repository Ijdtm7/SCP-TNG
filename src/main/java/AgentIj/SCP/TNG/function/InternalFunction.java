package AgentIj.SCP.TNG.function;

import AgentIj.SCP.TNG.ai.AINearestTarget;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITasks;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

public class InternalFunction
{
    public static void addApiTargets(EntityCreature to)
    {
        EntityAITasks targetTasks=to.targetTasks;
        for (Class<? extends EntityLivingBase> aClass : MainFunction.attackables.keySet()) {
            if(!ArrayUtils.contains(aClass.getInterfaces(), Human.class)) {
                Pair<Boolean, Boolean> params = MainFunction.attackables.get(aClass);
                targetTasks.addTask(3, new AINearestTarget<>(to, EntityLivingBase.class, params.getLeft(), params.getRight(), input -> aClass.isAssignableFrom(input.getClass())));
            }
            else{

            }
        }
        for (Class<? extends EntityLivingBase> aClass : MainFunction.strictClassTargets.keySet()) {
            if (!ArrayUtils.contains(aClass.getInterfaces(), Human.class)) {
                Pair<Boolean, Boolean> params = MainFunction.strictClassTargets.get(aClass);
                targetTasks.addTask(3, new AINearestTarget<>(to, EntityLivingBase.class, params.getLeft(), params.getRight(), input -> aClass == input.getClass()));
            }
            else{

            }
        }
    }
}
