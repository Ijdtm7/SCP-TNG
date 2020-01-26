package AgentIj.SCP.TNG.ai;

import com.google.common.base.Predicate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

import javax.annotation.Nullable;


public class AINearestTarget<T extends EntityLivingBase> extends EntityAINearestAttackableTarget<T> {


    public AINearestTarget(EntityCreature creature, Class<T> classTarget, boolean checkSight, boolean onlyNearby, @Nullable Predicate<? super EntityLivingBase> targetSelector) {
        super(creature, classTarget, 0, checkSight, onlyNearby, targetSelector);
    }
}
