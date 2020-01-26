package AgentIj.SCP.TNG.items.tools;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.init.ItemInit;
import AgentIj.SCP.TNG.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxeBase extends ItemPickaxe implements IHasModel
{




    public ToolPickaxeBase(String name, ToolMaterial material, CreativeTabs tab) {
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
