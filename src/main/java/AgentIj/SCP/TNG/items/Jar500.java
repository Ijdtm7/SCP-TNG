package AgentIj.SCP.TNG.items;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.init.BlockInit;
import AgentIj.SCP.TNG.init.ItemInit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class Jar500 extends ItemBase
{
    public Jar500(String name) {
        super(name, Main.scptngtab);


        setMaxStackSize(1);


        ItemInit.ITEMS.add(this);


    }




    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        worldIn.setBlockState(new BlockPos((int) x, (int) (y+1), (int) z), BlockInit.PILL_JAR.getDefaultState());
        worldIn.playSound(null, pos, SoundEvents.BLOCK_SAND_PLACE, SoundCategory.BLOCKS, 5, 1);


        ItemStack item = player.getHeldItem(hand);
        if (!player.isCreative()&&!player.isSpectator())
        {
            item.shrink(1);

        }

        return EnumActionResult.PASS;



    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        if (playerIn.isSneaking()) {
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) playerIn), new ItemStack(ItemInit.HEALING_PILL, (int) 1));
            item.shrink(1);
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }


}
