package AgentIj.SCP.TNG.objects.items;

import AgentIj.SCP.TNG.function.Get500PillFromJar;
import AgentIj.SCP.TNG.scptng;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PillExchanger extends ItemBase
{
    public static final Item block = null;
    public PillExchanger(String name)
    {
        super(name, scptng.scptngtab);

    }


    @Override
    public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {

        ItemStack stack = entity.getHeldItem(hand);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        {
            java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
            $_dependencies.put("entity", entity);
            $_dependencies.put("x", x);
            $_dependencies.put("y", y);
            $_dependencies.put("z", z);
            $_dependencies.put("world", world);
            Get500PillFromJar.executeFunction($_dependencies);

        }
        return EnumActionResult.PASS;

    }
}
