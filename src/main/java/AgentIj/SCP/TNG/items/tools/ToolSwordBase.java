package AgentIj.SCP.TNG.items.tools;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.init.ItemInit;
import AgentIj.SCP.TNG.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSwordBase extends ItemSword implements IHasModel
{




    public ToolSwordBase(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }







    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0);
    }


}
