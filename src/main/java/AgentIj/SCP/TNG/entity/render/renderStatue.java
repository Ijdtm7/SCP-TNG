package AgentIj.SCP.TNG.entity.render;

import AgentIj.SCP.TNG.entity.EntityTheStatue;
import AgentIj.SCP.TNG.entity.model.ModelStatue;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class renderStatue extends RenderLiving<EntityTheStatue> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.ID + ":textures/entity/statue.png");


    public renderStatue(RenderManager manager) {
        super(manager, new ModelStatue(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityTheStatue entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityTheStatue entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}

