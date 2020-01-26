package AgentIj.SCP.TNG.blocks;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.init.BlockInit;
import AgentIj.SCP.TNG.init.ItemInit;
import AgentIj.SCP.TNG.util.IHasModel;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class PillJar extends Block implements IHasModel
{

    public static final AxisAlignedBB JAR_500_AABB = new AxisAlignedBB(0.40625, 0, 0.40625, 0.59375, 0.328125, 0.59375);



    public PillJar(String name)
    {
        super(Material.IRON);
        setSoundType(SoundType.METAL);

        setResistance(Reference.BLOCKTNTRESISTANCE);
        setHardness(4f);
        setUnlocalizedName(name);
        setRegistryName(name);


        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        

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


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);

    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemInit.JAR_500;
    }
}
