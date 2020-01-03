package AgentIj.SCP.TNG.function;

import AgentIj.SCP.TNG.init.BlockInit;
import AgentIj.SCP.TNG.init.ItemInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class Get500PillFromJar
{
    @SuppressWarnings("deprecation")
    public static void executeFunction(java.util.HashMap<String, Object> dependencies)
    {
        if (dependencies.get("entity") == null) {
            System.err.println("Failed to load dependency entity for function SCP 500 Pill Retrieval system!");
            return;
        }
        if (dependencies.get("x") == null) {
            System.err.println("Failed to load dependency x for function SCP 500 Pill Retrieval system!");
            return;
        }
        if (dependencies.get("y") == null) {
            System.err.println("Failed to load dependency y for function SCP 500 Pill Retrieval system!");
            return;
        }
        if (dependencies.get("z") == null) {
            System.err.println("Failed to load dependency z for function SCP 500 Pill Retrieval system!");
            return;
        }
        if (dependencies.get("world") == null) {
            System.err.println("Failed to load dependency world for function SCP 500 Pill Retrieval system!");
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        int x = (int) dependencies.get("x");
        int y = (int) dependencies.get("y");
        int z = (int) dependencies.get("z");
        World world = (World) dependencies.get("world");
        if ((new Object() {
            public boolean blockEquals(IBlockState a, IBlockState b)
            {
                try {
                    return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
                } catch (Exception e) {
                    return (a.getBlock() == b.getBlock());
                }
            }
        }.blockEquals((world.getBlockState(new BlockPos((int) x,(int) y, (int) z))), BlockInit.PILL_JAR.getStateFromMeta(0))))
        {
            if (entity instanceof EntityPlayer)
                ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.PILL_MAKER, (int) (1)).getItem(), -1, (int) 1, null);
            if(entity instanceof EntityPlayer)
                ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.HEALING_PILL, (int) (1)));

        }else{
            if (entity instanceof EntityPlayer && !world.isRemote)
            {
                ((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Please Bring a SCP 500 Exchanger Token"), (false));
            }
        }





    }
}
