package AgentIj.SCP.TNG.armor;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.init.ItemInit;
import AgentIj.SCP.TNG.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, CreativeTabs tabs)
    {
        super(material, renderIndexIn, equipmentSlotIn);


        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
