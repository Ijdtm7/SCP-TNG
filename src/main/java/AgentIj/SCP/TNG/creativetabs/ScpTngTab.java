package AgentIj.SCP.TNG.creativetabs;

import AgentIj.SCP.TNG.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ScpTngTab extends CreativeTabs
{
    public ScpTngTab(String label) {
        super("scptngtab-basic");
        setBackgroundImageName("scptng-basic.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.REINFORCED_STEEL));
    }
}
