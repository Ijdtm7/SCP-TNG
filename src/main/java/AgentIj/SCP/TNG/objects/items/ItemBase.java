package AgentIj.SCP.TNG.objects.items;

import AgentIj.SCP.TNG.init.ItemInit;
import AgentIj.SCP.TNG.scptng;
import AgentIj.SCP.TNG.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name, CreativeTabs tab)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels()
    {
        scptng.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
