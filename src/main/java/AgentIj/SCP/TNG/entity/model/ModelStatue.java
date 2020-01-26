package AgentIj.SCP.TNG.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * TheStatueTNG - Gusutab0
 * Created using Tabula 7.1.0
 */
public class ModelStatue extends ModelBase {
    public double[] modelScale = new double[] { 0.8D, 0.8D, 0.8D };
    public ModelRenderer RShoulder;
    public ModelRenderer LShoulder;
    public ModelRenderer RArmC;
    public ModelRenderer RHand;
    public ModelRenderer RFingerT;
    public ModelRenderer RFinger1;
    public ModelRenderer RFinger2;
    public ModelRenderer RFinger1E;
    public ModelRenderer RFinger2E;
    public ModelRenderer LArmC;
    public ModelRenderer LRebar1;
    public ModelRenderer LRebar2;
    public ModelRenderer RlegLow;
    public ModelRenderer LlegLow;
    public ModelRenderer TorsoLow;
    public ModelRenderer Neck;
    public ModelRenderer Head;
    public ModelRenderer Rleg;
    public ModelRenderer Lleg;
    public ModelRenderer TorsoUp;
    public ModelRenderer RebarH1a;
    public ModelRenderer RebarH2a;
    public ModelRenderer RebarH3a;
    public ModelRenderer RebarHBa;
    public ModelRenderer RebarH1b;
    public ModelRenderer RebarH2b;
    public ModelRenderer RebarH3b;
    public ModelRenderer RebarHBb;

    public ModelStatue() {
        this.textureWidth = 64;
        this.textureHeight = 75;
        this.RArmC = new ModelRenderer(this, 51, 27);
        this.RArmC.setRotationPoint(0.6F, 3.6F, 0.5F);
        this.RArmC.addBox(0.0F, -2.0F, -2.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(RArmC, -0.17453292519943295F, 0.0F, 0.0F);
        this.RlegLow = new ModelRenderer(this, 0, 60);
        this.RlegLow.setRotationPoint(2.3F, 11.5F, -1.0F);
        this.RlegLow.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(RlegLow, 0.0F, -0.136659280431156F, 0.0F);
        this.RebarHBa = new ModelRenderer(this, 55, 60);
        this.RebarHBa.setRotationPoint(0.0F, -2.1F, 2.6F);
        this.RebarHBa.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(RebarHBa, 0.8196066167365371F, 0.0F, 0.0F);
        this.LArmC = new ModelRenderer(this, 30, 27);
        this.LArmC.setRotationPoint(-1.5F, 2.5F, -0.5F);
        this.LArmC.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(LArmC, 0.0F, -0.045553093477052F, 0.0F);
        this.Lleg = new ModelRenderer(this, 18, 49);
        this.Lleg.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.Lleg.addBox(-2.0F, -7.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Lleg, -0.31869712141416456F, 0.0F, 0.0F);
        this.TorsoUp = new ModelRenderer(this, 0, 25);
        this.TorsoUp.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.TorsoUp.addBox(-4.0F, -7.0F, -2.5F, 8, 7, 4, 0.0F);
        this.setRotateAngle(TorsoUp, -0.091106186954104F, 0.0F, 0.0F);
        this.RebarH3b = new ModelRenderer(this, 55, 60);
        this.RebarH3b.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.RebarH3b.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(RebarH3b, 1.9123572614101867F, 1.654137058292369F, 0.2617993877991494F);
        this.LShoulder = new ModelRenderer(this, 30, 19);
        this.LShoulder.setRotationPoint(-3.9F, -4.1F, 1.0F);
        this.LShoulder.addBox(-3.0F, -2.0F, -2.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(LShoulder, -0.8185965826156772F, 1.5734652913132954F, -0.6610935572251146F);
        this.RebarH2b = new ModelRenderer(this, 55, 60);
        this.RebarH2b.setRotationPoint(0.0F, 2.1F, 0.6F);
        this.RebarH2b.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RebarH2b, 2.0943951023931953F, 0.0F, -0.017453292519943295F);
        this.RFingerT = new ModelRenderer(this, 55, 55);
        this.RFingerT.setRotationPoint(0.5F, 3.6F, 0.3F);
        this.RFingerT.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RFingerT, 0.0F, 0.0F, 0.40980330836826856F);
        this.LlegLow = new ModelRenderer(this, 19, 60);
        this.LlegLow.setRotationPoint(-2.2F, 11.5F, -1.0F);
        this.LlegLow.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(LlegLow, 0.0F, 0.136659280431156F, 0.0F);
        this.RFinger1 = new ModelRenderer(this, 55, 55);
        this.RFinger1.setRotationPoint(3.6F, 3.9F, -0.8F);
        this.RFinger1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RFinger1, -0.27314402793711257F, 0.40142572795869574F, -0.1935570140461712F);
        this.LRebar1 = new ModelRenderer(this, 55, 55);
        this.LRebar1.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.LRebar1.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LRebar1, -1.3989681882115574F, -1.0836990765508405F, 0.6685264349296534F);
        this.RFinger1E = new ModelRenderer(this, 55, 55);
        this.RFinger1E.mirror = true;
        this.RFinger1E.setRotationPoint(0.1F, 3.6F, 0.0F);
        this.RFinger1E.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RFinger1E, 0.0F, 0.0F, 0.6829473363053812F);
        this.RFinger2E = new ModelRenderer(this, 55, 55);
        this.RFinger2E.setRotationPoint(0.1F, 3.6F, 0.0F);
        this.RFinger2E.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RFinger2E, 0.15707963267948966F, 0.12217304763960307F, 1.1829841670017567F);
        this.RebarH2a = new ModelRenderer(this, 55, 60);
        this.RebarH2a.setRotationPoint(3.0F, -0.7F, -1.5F);
        this.RebarH2a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RebarH2a, -0.5462880558742251F, -0.7672467391767074F, -0.8196066167365371F);
        this.RebarH3a = new ModelRenderer(this, 55, 60);
        this.RebarH3a.setRotationPoint(-2.8F, -1.6F, -1.8F);
        this.RebarH3a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(RebarH3a, 0.0F, -1.0836749325632793F, 1.0016444577195458F);
        this.TorsoLow = new ModelRenderer(this, 0, 36);
        this.TorsoLow.setRotationPoint(0.0F, 0.3F, 0.7F);
        this.TorsoLow.addBox(-4.0F, 0.0F, -2.5F, 8, 6, 5, 0.0F);
        this.setRotateAngle(TorsoLow, 0.045553093477052F, 0.0F, 0.0F);
        this.LRebar2 = new ModelRenderer(this, 55, 55);
        this.LRebar2.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.LRebar2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(LRebar2, -0.5462880558742251F, -2.0943951023931953F, -0.744997341487209F);
        this.RebarH1a = new ModelRenderer(this, 55, 60);
        this.RebarH1a.setRotationPoint(0.0F, -0.5F, -2.6F);
        this.RebarH1a.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(RebarH1a, -0.36425021489121656F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -7.8F, 0.0F);
        this.Head.addBox(-3.5F, -9.0F, -3.5F, 7, 9, 7, 0.0F);
        this.setRotateAngle(Head, -0.22759093446006054F, 0.0F, 0.0F);
        this.RFinger2 = new ModelRenderer(this, 55, 55);
        this.RFinger2.setRotationPoint(3.6F, 3.9F, 1.0F);
        this.RFinger2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(RFinger2, 0.045553093477052F, -0.017453292519943295F, -0.40299652428549065F);
        this.Rleg = new ModelRenderer(this, 0, 49);
        this.Rleg.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.Rleg.addBox(-2.0F, -7.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Rleg, -0.31869712141416456F, 0.0F, 0.0F);
        this.RebarH1b = new ModelRenderer(this, 55, 60);
        this.RebarH1b.setRotationPoint(0.0F, 4.1F, 0.6F);
        this.RebarH1b.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(RebarH1b, 1.1838568316277536F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 17);
        this.Neck.setRotationPoint(0.0F, -5.3F, 0.8F);
        this.Neck.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        this.RHand = new ModelRenderer(this, 47, 35);
        this.RHand.setRotationPoint(0.4F, 6.0F, 0.0F);
        this.RHand.addBox(0.0F, -2.0F, -2.0F, 4, 6, 4, 0.0F);
        this.RebarHBb = new ModelRenderer(this, 55, 60);
        this.RebarHBb.setRotationPoint(0.0F, 4.1F, -0.6F);
        this.RebarHBb.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(RebarHBb, -1.0927506446736497F, 0.0F, 0.0F);
        this.RShoulder = new ModelRenderer(this, 47, 18);
        this.RShoulder.setRotationPoint(3.9F, -4.1F, 1.0F);
        this.RShoulder.addBox(0.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(RShoulder, -1.4873695885495677F, 0.04101523742186677F, 0.08342673824532897F);
        this.RShoulder.addChild(this.RArmC);
        this.Head.addChild(this.RebarHBa);
        this.LShoulder.addChild(this.LArmC);
        this.LlegLow.addChild(this.Lleg);
        this.TorsoLow.addChild(this.TorsoUp);
        this.RebarH3a.addChild(this.RebarH3b);
        this.RebarH2a.addChild(this.RebarH2b);
        this.RHand.addChild(this.RFingerT);
        this.RHand.addChild(this.RFinger1);
        this.LArmC.addChild(this.LRebar1);
        this.RFinger1.addChild(this.RFinger1E);
        this.RFinger2.addChild(this.RFinger2E);
        this.Head.addChild(this.RebarH2a);
        this.Head.addChild(this.RebarH3a);
        this.LArmC.addChild(this.LRebar2);
        this.Head.addChild(this.RebarH1a);
        this.RHand.addChild(this.RFinger2);
        this.RlegLow.addChild(this.Rleg);
        this.RebarH1a.addChild(this.RebarH1b);
        this.RShoulder.addChild(this.RHand);
        this.RebarHBa.addChild(this.RebarHBb);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.RlegLow.render(f5);
        this.LShoulder.render(f5);
        this.LlegLow.render(f5);
        this.TorsoLow.render(f5);
        this.Head.render(f5);
        this.Neck.render(f5);
        this.RShoulder.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
