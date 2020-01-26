package AgentIj.SCP.TNG.function;

import com.google.common.base.Predicate;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
@SuppressWarnings("unused")
public class MainFunction {
    public static final HashMap<Class<? extends EntityLivingBase>, Pair<Boolean,Boolean>> attackables=new HashMap<>();
    public static final HashMap<Class<? extends EntityLivingBase>, Pair<Boolean,Boolean>> strictClassTargets=new HashMap<>();
    @SuppressWarnings("Guava")
    public static final Predicate<EntityLivingBase> humanTargets = input -> input instanceof EntityPlayer || input instanceof Human;


    public static void registerEntityTarget(Class<? extends EntityLivingBase> targetableClass, boolean checkSight, boolean targetOnlyNearby)
    {
        attackables.put(targetableClass,Pair.of(checkSight,targetOnlyNearby));
    }
    public static void registerStrictEntityTarget(Class<? extends EntityLivingBase> targetClass, boolean checkSight, boolean targetOnlyNearby)
    {
        strictClassTargets.put(targetClass,Pair.of(checkSight,targetOnlyNearby));
    }
}
