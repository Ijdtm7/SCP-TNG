package AgentIj.SCP.TNG.init;

import AgentIj.SCP.TNG.Main;
import AgentIj.SCP.TNG.entity.EntityShyGuy;
import AgentIj.SCP.TNG.entity.EntityTheStatue;
import AgentIj.SCP.TNG.util.Reference;
import AgentIj.SCP.TNG.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import javax.annotation.Nullable;
import java.awt.*;

public class EntityInit
{

    public static void registerEntities()
    {
        registerEntity("scp_173",EntityTheStatue.class, 173, EntityLiving.SpawnPlacementType.ON_GROUND, Util.getRandomColor(), Util.getRandomColor());
        registerEntity("scp_096", EntityShyGuy.class, 96, EntityLiving.SpawnPlacementType.ON_GROUND, Util.getRandomColor(), Util.getRandomColor());


    }



    private static void registerEntity(String name, Class<? extends Entity> entity, int id,@Nullable EntityLiving.SpawnPlacementType placementType, @Nullable Color shellColor, @Nullable Color spotColor)
    {

        ResourceLocation resourceLocation = new ResourceLocation(Reference.ID, name);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.ID + ":" + name), entity, name, id, Main.instance, 64, 3, true);
        if (shellColor!= null && spotColor != null)
        {
            EntityRegistry.registerEgg(resourceLocation, shellColor.getRGB(), spotColor.getRGB());
        }


    }
}
