package AgentIj.SCP.TNG.objects.blocks;

import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class PillJar extends BlockBase
{

    public static final AxisAlignedBB JAR_500_AABB = new AxisAlignedBB(0.40625, 0, 0.40625, 0.59375, 0.328125, 0.59375);



    public PillJar(String name)
    {
        super(name, Material.IRON);

        setResistance(Reference.BLOCKTNTRESISTANCE);
        setHardness(4f);

    }


    @Override
    @SuppressWarnings("deprecation")
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isToolEffective(String type, IBlockState state) {
        if(getClass()==this.getClass())
            return type.equals("pickaxe");
        return super.isToolEffective(type, state);
    }


    @Override
    @SuppressWarnings("deprecation")
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return JAR_500_AABB;
    }


    //TODO add functionality prob do this tommorow



}
