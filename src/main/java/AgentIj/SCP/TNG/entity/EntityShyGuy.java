package AgentIj.SCP.TNG.entity;

import AgentIj.SCP.TNG.ai.AIMeleeAttack;
import AgentIj.SCP.TNG.ai.AINearestTarget;
import AgentIj.SCP.TNG.function.ListU;
import AgentIj.SCP.TNG.function.MainFunction;
import AgentIj.SCP.TNG.function.PlayerObserve;
import AgentIj.SCP.TNG.util.Reference;
import AgentIj.SCP.TNG.util.Util;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.init.MobEffects;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fluids.BlockFluidClassic;

import java.util.List;

@SuppressWarnings("unused")
public class EntityShyGuy extends EntityCreeeature
{

    public static final String UUID = "targetUUID";

    private final ListU<EntityLivingBase> KILL_LIST = new ListU<>(3);
    private static final DataParameter<Byte> STATE= EntityDataManager.createKey(EntityShyGuy.class, DataSerializers.BYTE);
    private int cryTimer = 0;


    public EntityShyGuy(World worldIn) {
        super(worldIn);

        stepHeight=1;
    }


    @Override
    protected void initEntityAI() {
        tasks.addTask(1, new EntityAIWanderAvoidWater(this, 1));

    }


    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(50);
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.2);
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(Integer.MAX_VALUE);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(Reference.SMALL_ZOMBIE_SPEED);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(Reference.GHAST_DETECTION_RANGE);
        getEntityAttribute(SWIM_SPEED).setBaseValue(2);
    }


    @Override
    protected void entityInit() {
        super.entityInit();
        dataManager.register(STATE,(byte) ShyGuyState.SITTING.ordinal());

    }


    @Override
    protected int getSpawnProbability() {
        return 25;
    }


    public enum ShyGuyState
    {
        SITTING(true),
        WALKING(true),
        CRYING(false),
        RUNNING(false);

        public final boolean isPassive;

        ShyGuyState(boolean isPassive)
        {
            this.isPassive = isPassive;
        }
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }



    public ShyGuyState getState()
    {
        return ShyGuyState.values()[dataManager.get(STATE)];
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!world.isRemote)
        {
            WorldServer worldServer = (WorldServer) world;
            if(getState() == ShyGuyState.CRYING)
                cryTimer++;
            KILL_LIST.removeIf(input -> !isValidTarget(input));
            IAttributeInstance followrange=getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
            List<EntityLivingBase> observers = world.getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(getPosition()).grow(followrange.getAttributeValue()), input -> isValidTarget(input) && Util.isInSightOf(input,this,90) && Util.isWatcherLookingAtHead(input,this));
            for (EntityLivingBase observer : observers)
            {
                addTarget(observer);
            }
            if(!KILL_LIST.isEmpty() && getState().isPassive)
            {

                setState(ShyGuyState.CRYING);
                getNavigator().clearPath();
                tasks.taskEntries.removeIf(entityAITaskEntry -> !(entityAITaskEntry.action instanceof EntityAISwimming));
            }

            if(cryTimer == Util.secondsToTicks(29))
            {
                setState(ShyGuyState.RUNNING);
                enableAI();
                cryTimer = 0;
            }
            if (getState() == ShyGuyState.RUNNING)
            {
                if (KILL_LIST.isEmpty())
                {
                    tasks.taskEntries.clear();
                    targetTasks.taskEntries.clear();
                    initEntityAI();
                    setState(ShyGuyState.SITTING);
                }else {
                    if (getNavigator().noPath())
                    {
                        EnumFacing facing= getHorizontalFacing();
                        AxisAlignedBB axisAlignedBB= new AxisAlignedBB(getPosition()).expand(facing.getFrontOffsetX(), 1, facing.getFrontOffsetZ());
                        List<BlockPos> blockPos = Util.boundingBoxToPositions(axisAlignedBB);
                        for (BlockPos pos : blockPos)
                        {
                            IBlockState blockState = world.getBlockState(pos);
                            Block block = blockState.getBlock();
                            if (!(block instanceof BlockLiquid) && !(block instanceof BlockFluidClassic))
                            {
                                if (Util.canReplaceBlock(pos, world))
                                {
                                    world.destroyBlock(pos, true);
                                }
                            }
                        }
                    }
                }
            }


            if(getState().isPassive && getNavigator().noPath())
            {
                if(getState()!=ShyGuyState.SITTING)
                    setState(ShyGuyState.SITTING);
            }
            else if(getState().isPassive)
            {
                if(getState()!=ShyGuyState.WALKING)
                    setState(ShyGuyState.WALKING);
            }

            this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1, 1, false, false));

        }

    }
    public void setState(ShyGuyState state)
    {
        dataManager.set(STATE,(byte) state.ordinal());
    }
    private void addTarget(EntityLivingBase livingBase)
    {
        if(isValidTarget(livingBase))
        {
            KILL_LIST.add(livingBase);
        }
    }

    private boolean isValidTarget(EntityLivingBase livingBase)
    {
        return !livingBase.isDead && (Util.isEntitySurvivalPlayer(livingBase) || (livingBase instanceof PlayerObserve && ((PlayerObserve) livingBase).canAngerShyGuy()));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        NBTTagList tagList = new NBTTagList();

        for(EntityLivingBase entityLivingBase : KILL_LIST)
        {
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setUniqueId(UUID, entityLivingBase.getUniqueID());
            tagList.appendTag(nbt);
        }

        compound.setTag("players", tagList);
        compound.setByte("state", (byte) getState().ordinal());
        compound.setInteger("Crytime",cryTimer);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        NBTTagList tagList = compound.getTagList("players", 11);
        cryTimer=compound.getInteger("Crytime");
        tagList.forEach(input ->
        {
            if(!((NBTTagCompound) input).hasKey(UUID))
                KILL_LIST.add(world.getPlayerEntityByUUID(((NBTTagCompound) input).getUniqueId(UUID)));
        });
        setState(ShyGuyState.values()[compound.getByte("state")]);
    }

    private void enableAI()
    {
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new AIMeleeAttack(this, 2, true));
        targetTasks.addTask(1, new AINearestTarget<>(this, EntityLivingBase.class,  false, false, input -> MainFunction.humanTargets.apply(input) && KILL_LIST.contains(input)));
        targetTasks.addTask(1,new AINearestTarget<>(this,EntityLivingBase.class,true,false,input -> {
            if(input instanceof PlayerObserve)
            {
                PlayerObserve observer= (PlayerObserve) input;
                return observer.canAngerShyGuy() && KILL_LIST.contains(observer);
            }
            return false;
        }));
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();
        if (getState()==ShyGuyState.RUNNING)
        {
            enableAI();
        }
    }
    @Override
    public float getEyeHeight() {
        if(getState()==ShyGuyState.SITTING)
            return 1.1875f;
        else if(getState()==ShyGuyState.CRYING)
            return super.getEyeHeight();
        return height+3/16f;
    }
}
