package AgentIj.SCP.TNG.util.handlers;

import AgentIj.SCP.TNG.entity.EntityShyGuy;
import AgentIj.SCP.TNG.entity.EntityTheStatue;
import AgentIj.SCP.TNG.entity.render.renderShy;
import AgentIj.SCP.TNG.entity.render.renderStatue;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityTheStatue.class, new IRenderFactory<EntityTheStatue>() {
            @Override
            public Render<? super EntityTheStatue> createRenderFor(RenderManager manager) {
                return new renderStatue(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityShyGuy.class, new IRenderFactory<EntityShyGuy>() {
            @Override
            public Render<? super EntityShyGuy> createRenderFor(RenderManager manager) {
                return new renderShy(manager);
            }
        });
    }
}
