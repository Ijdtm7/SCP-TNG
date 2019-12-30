package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block WHITE_WALL = new BlockBase("white_wall", Material.CLAY);
}
