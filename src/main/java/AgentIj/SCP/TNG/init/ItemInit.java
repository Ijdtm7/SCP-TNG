package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.armor.ArmorBase;
import AgentIj.SCP.TNG.items.ItemBase;
import AgentIj.SCP.TNG.items.Jar500;
import AgentIj.SCP.TNG.items.SCP500;
import AgentIj.SCP.TNG.items.tools.*;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final Item.ToolMaterial TOOL_TELEKILL = EnumHelper.addToolMaterial("tool_telekill", 3, 1720, 14.0F, 4.0F, 22);
    public static final ItemArmor.ArmorMaterial ARMOR_TELEKILL = EnumHelper.addArmorMaterial("armor_telekill", Reference.ID + ":telekill", 55, new int[] {4, 7, 9, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);

    public static final List<Item> ITEMS = new ArrayList<Item>();



    public static final Item HEALING_PILL  = new SCP500("healing_pill");
    public static final Item JAR_500 = new Jar500("jar_500");

    public static final Item TELEKILL_INGOT = new ItemBase("telekill_ingot", Main.scptngtab);
    public static final Item TELEKILL_AXE = new ToolAxeBase("telekill_axe", TOOL_TELEKILL, Main.scptngtab);
    public static final Item TELEKILL_HOE = new ToolHoeBase("telekill_hoe", TOOL_TELEKILL, Main.scptngtab);
    public static final Item TELEKILL_PICKAXE = new ToolPickaxeBase("telekill_pickaxe", TOOL_TELEKILL, Main.scptngtab);
    public static final Item TELEKILL_SHOVEL = new ToolShovelBase("telekill_shovel", TOOL_TELEKILL, Main.scptngtab);
    public static final Item TELEKILL_SWORD = new ToolSwordBase("telekill_sword", TOOL_TELEKILL, Main.scptngtab);
    public static final Item TELEKILL_HELMET = new ArmorBase("telekill_helmet", ARMOR_TELEKILL, 1, EntityEquipmentSlot.HEAD, Main.scptngtab);
    public static final Item TELEKILL_CHESTPLATE = new ArmorBase("telekill_chestplate", ARMOR_TELEKILL, 1, EntityEquipmentSlot.CHEST, Main.scptngtab);
    public static final Item TELEKILL_LEGGINGS = new ArmorBase("telekill_leggings", ARMOR_TELEKILL, 2, EntityEquipmentSlot.LEGS, Main.scptngtab);
    public static final Item TELEKILL_BOOTS = new ArmorBase("telekill_boots", ARMOR_TELEKILL, 1, EntityEquipmentSlot.FEET, Main.scptngtab);

}
