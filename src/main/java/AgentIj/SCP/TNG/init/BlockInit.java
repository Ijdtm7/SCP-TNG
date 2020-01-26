package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.blocks.BlockFacility;
import AgentIj.SCP.TNG.blocks.PillJar;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block WHITE_WALL = new BlockFacility("white_wall");
    public static final Block CEILING_TILE = new BlockFacility("ceiling_tile");
    public static final Block WALL_BOTTOM = new BlockFacility("wall_bottom");
    public static final Block CEILING_VENT = new BlockFacility("ceiling_vent");
    public static final Block TILED_FLOOR = new BlockFacility("tiled_floor");
    public static final Block CONCRETE_WALL = new BlockFacility("concrete_wall");
    public static final Block HEAVY_FLOOR = new BlockFacility("heavy_floor");
    public static final Block REINFORCED_STEEL = new BlockFacility("reinforced_steel");
    public static final Block STEEL_FLOOR = new BlockFacility("steel_floor");
    public static final Block VENT = new BlockFacility("vent");
    public static final Block WALL_TOP = new BlockFacility("wall_top");
    public static final Block PILL_JAR = new PillJar("pill_jar");

}
