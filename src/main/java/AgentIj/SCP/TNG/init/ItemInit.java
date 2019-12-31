package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.objects.items.ItemBase;
import AgentIj.SCP.TNG.objects.items.SCP500;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item HEALING_PILL  = new SCP500("healing_pill");
}
