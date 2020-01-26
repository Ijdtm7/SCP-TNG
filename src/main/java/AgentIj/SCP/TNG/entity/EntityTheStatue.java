package AgentIj.SCP.TNG.entity;

import AgentIj.SCP.TNG.ai.AIMeleeAttack;
import AgentIj.SCP.TNG.ai.AINearestTarget;
import AgentIj.SCP.TNG.ai.statue.Movement;
import AgentIj.SCP.TNG.ai.statue.Target;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityTheStatue extends EntityCreeeature
{
    private int damageTime;


    public EntityTheStatue(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void initEntityAI() {
        wandering=new Movement(this, 1, 10);
        tasks.addTask(4, wandering);
        tasks.addTask(1, new AIMeleeAttack(this, 1, false));
        targetTasks.addTask(2, new Target(this, EntityLivingBase.class,true,false));
    }

    @Override
    protected int getSpawnProbability() {
        return 20;
    }


    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(50);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(Reference.PLAYER_SPRINT_SPEED);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64);

    }


    @Override
    public boolean isEntityInvulnerable(DamageSource source) {
        damageTime = 20;
        if (source.getTrueSource() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) source.getTrueSource();
            Item item = player.getHeldItemMainhand().getItem();
            if (item instanceof ItemPickaxe)
            {
                ItemPickaxe pickaxe = (ItemPickaxe) item;
                return !pickaxe.canHarvestBlock(Blocks.OBSIDIAN.getDefaultState());
            }
        }
        return source != DamageSource.OUT_OF_WORLD;




    }


    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (damageTime > 0)
        {
            damageTime --;
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        return super.attackEntityAsMob(entityIn);
    }
}

