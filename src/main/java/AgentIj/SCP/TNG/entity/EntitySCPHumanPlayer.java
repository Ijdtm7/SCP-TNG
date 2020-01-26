package AgentIj.SCP.TNG.entity;

import AgentIj.SCP.TNG.function.Human;
import AgentIj.SCP.TNG.function.PlayerObserve;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public abstract class EntitySCPHumanPlayer extends EntityCreature implements PlayerObserve, Human
{

    public EntitySCPHumanPlayer(World worldIn) {
        super(worldIn);
    }


    @Override
    public boolean canTriggerStatue() {
        return true;
    }

    @Override
    public boolean canAngerShyGuy() {
        return true;
    }
}
