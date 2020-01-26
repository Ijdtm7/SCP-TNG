package AgentIj.SCP.TNG.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nonnull;

public class AIMeleeAttack extends EntityAIAttackMelee {
    protected DamageSource damageSource;
    protected float damage;
    public AIMeleeAttack(EntityCreature creature, double speedIn, float fallback_damage_, boolean useLongMemory) {
        super(creature, speedIn, useLongMemory);
        damage=fallback_damage_;
        damageSource = DamageSource.causeMobDamage(attacker);
    }

    public AIMeleeAttack(EntityCreature creature,double speedFactor,boolean longMemory)
    {
        this(creature,speedFactor,1,longMemory);
    }


    @Override
    public void updateTask()
    {
        if(attacker.getAttackTarget()!=null)
            super.updateTask();
        else resetTask();
    }

    @Override
    protected void checkAndPerformAttack(@Nonnull EntityLivingBase target, double distance)
    {
        double d0 = this.getAttackReachSqr(target);
        d0= MathHelper.clamp(d0,3,6);
        if (distance <= d0 && this.attackTick <= 0)
        {
            this.attackTick = 20;
            this.attacker.swingArm(EnumHand.MAIN_HAND);
            float f;
            if(attacker.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE)!=null)
            {
                float attack= (float)attacker.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
                if(attack>0) f=attack;
                else f=damage;
            }
            else f=damage;
            boolean flag=target.attackEntityFrom(damageSource,f);
            attacker.attackEntityAsMob(target);
            System.out.println(attacker.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue());

            if (flag)
            {
                target.knockBack(attacker,  0.5F, MathHelper.sin(attacker.rotationYaw * 0.017453292F), (-MathHelper.cos(attacker.rotationYaw * 0.017453292F)));
                attacker.motionX *= 0.6D;
                attacker.motionZ *= 0.6D;
            }
        }
    }

    public AIMeleeAttack setDamageSource(DamageSource damageSource)
    {
        this.damageSource = damageSource;
        return this;
    }
}