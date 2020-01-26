package AgentIj.SCP.TNG.entity.render;

import AgentIj.SCP.TNG.entity.EntityShyGuy;
import AgentIj.SCP.TNG.entity.model.shyguy.ShyGuyTNG;
import AgentIj.SCP.TNG.entity.model.shyguy.ShyGuyTNGCrying;
import AgentIj.SCP.TNG.entity.model.shyguy.ShyGuyTNGRunning;
import AgentIj.SCP.TNG.entity.model.shyguy.ShyGuyTNGSitting;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class renderShy extends RenderLiving<EntityShyGuy>
{



    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.ID, "textures/entity/shy.png");


    private ShyGuyTNG walking=new ShyGuyTNG();
    private ShyGuyTNGSitting sitting = new ShyGuyTNGSitting();
    private ShyGuyTNGRunning running = new ShyGuyTNGRunning();
    private ShyGuyTNGCrying crying = new ShyGuyTNGCrying();

    public renderShy(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ShyGuyTNGSitting(), 0.5F);
    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityShyGuy entity) {
        return TEXTURES;
    }

    @Override
    public void doRender(EntityShyGuy entity, double x, double y, double z, float entityYaw, float partialTicks) {
        switch (entity.getState())
        {
            case SITTING:
                mainModel = sitting;
                break;
            case WALKING:
                mainModel = walking;
                break;

            case RUNNING:
                mainModel=running;
                break;

            case CRYING:
                mainModel=crying;
                break;
        }



        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }
}
