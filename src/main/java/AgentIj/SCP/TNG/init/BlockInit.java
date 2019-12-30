package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block WHITE_WALL = new BlockBase("white_wall", Material.IRON);
    public static final Block CEILING_TILE = new BlockBase("ceiling_tile", Material.IRON);
    public static final Block WALL_BOTTOM = new BlockBase("wall_bottom", Material.IRON);
    public static final Block CEILING_VENT = new BlockBase("ceiling_vent", Material.IRON);
    public static final Block TILED_FLOOR = new BlockBase("tiled_floor", Material.IRON);
    public static final Block CONCRETE_WALL = new BlockBase("concrete_wall", Material.IRON);
    public static final Block HEAVY_FLOOR = new BlockBase("heavy_floor", Material.IRON);
    public static final Block REINFORCED_STEEL = new BlockBase("reinforced_steel", Material.IRON);
    public static final Block STEEL_FLOOR = new BlockBase("steel_floor", Material.IRON);
    public static final Block VENT = new BlockBase("vent", Material.IRON);
    public static final Block WALL_TOP = new BlockBase("wall_top", Material.IRON);

}
