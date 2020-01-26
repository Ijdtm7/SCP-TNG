package AgentIj.SCP.TNG.blocks;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockFacility extends BlockBase {
    public BlockFacility(String name) {
        super(name,Material.IRON, Main.scptngtab);


        setResistance(Reference.BLOCKCREEPERESISTANCE);
        setHardness(5f);

    }

    @Override
    public boolean isToolEffective(String type, IBlockState state) {
        if(getClass()==this.getClass())
            return type.equals("pickaxe");
        return super.isToolEffective(type, state);
    }


    @Override
    @SuppressWarnings("deprecation")
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }


    @Override
    @SuppressWarnings("deprecation")
    public boolean isFullCube(IBlockState state) {
        return true;
    }
}
