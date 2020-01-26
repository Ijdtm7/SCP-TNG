package AgentIj.SCP.TNG.ai;

import net.minecraft.entity.ai.EntityAIBase;

public abstract class AIBase extends EntityAIBase {


    protected int timeExecuting;

    public EntityAIBase setMutexBitsItself(int bits)
    {
        setMutexBits(bits);
        return this;
    }


    @Override
    public void updateTask() {
        timeExecuting++;
    }
}

