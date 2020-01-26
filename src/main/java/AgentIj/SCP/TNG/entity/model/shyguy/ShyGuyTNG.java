package AgentIj.SCP.TNG.entity.model.shyguy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * ShyGuyTNG - Gusutab0
 * Created using Tabula 7.1.0
 */
public class ShyGuyTNG extends ModelBase {
    public double[] modelScale = new double[] { 0.77D, 0.77D, 0.77D };
    public ModelRenderer BodyLow;
    public ModelRenderer Neck;
    public ModelRenderer Head;
    public ModelRenderer LLegJoint;
    public ModelRenderer RLegJoint;
    public ModelRenderer LSholder;
    public ModelRenderer RSholder;
    public ModelRenderer BodyMiddle;
    public ModelRenderer BodyTop;
    public ModelRenderer LJaw;
    public ModelRenderer RJaw;
    public ModelRenderer LLeg;
    public ModelRenderer LKnee;
    public ModelRenderer LLegLow;
    public ModelRenderer LFeet;
    public ModelRenderer RLeg;
    public ModelRenderer RKnee;
    public ModelRenderer RLegLow;
    public ModelRenderer RFeet;
    public ModelRenderer LArm;
    public ModelRenderer LElbow;
    public ModelRenderer RArmLow;
    public ModelRenderer LHand;
    public ModelRenderer LThumb;
    public ModelRenderer LFingerSet1a;
    public ModelRenderer LFingerSet2a;
    public ModelRenderer LFingerSet1b;
    public ModelRenderer LFingerSet2b;
    public ModelRenderer RArm;
    public ModelRenderer RElbow;
    public ModelRenderer RArmLow_1;
    public ModelRenderer LHand_1;
    public ModelRenderer RThumb;
    public ModelRenderer RFingerSet1a;
    public ModelRenderer RFingerSet2a;
    public ModelRenderer LFingerSet1b_1;
    public ModelRenderer RFingerSet2b;

    public ShyGuyTNG() {
        this.textureWidth = 64;
        this.textureHeight = 78;
        this.LLegJoint = new ModelRenderer(this, 0, 0);
        this.LLegJoint.setRotationPoint(0.0F, 0.49999999999999967F, 2.0000000000000004F);
        this.LLegJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.RFeet = new ModelRenderer(this, 18, 58);
        this.RFeet.setRotationPoint(0.2F, 9.2F, 0.0F);
        this.RFeet.addBox(-2.0F, 0.0F, -3.7F, 4, 2, 5, 0.0F);
        this.setRotateAngle(RFeet, -0.36425021489121656F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 23);
        this.Neck.setRotationPoint(0.0F, -9.1F, -0.7F);
        this.Neck.addBox(-1.0F, -7.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(Neck, 0.5462880558742251F, 0.0F, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 35);
        this.LLeg.setRotationPoint(-2.0F, 0.6F, 1.7F);
        this.LLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(LLeg, -0.7740535232594852F, 0.045553093477052F, 0.0F);
        this.LHand_1 = new ModelRenderer(this, 46, 58);
        this.LHand_1.setRotationPoint(1.0F, 9.3F, 0.0F);
        this.LHand_1.addBox(-2.0F, -1.5F, -1.5F, 2, 4, 3, 0.0F);
        this.LJaw = new ModelRenderer(this, 0, 14);
        this.LJaw.setRotationPoint(-0.5F, -4.0F, -1.4F);
        this.LJaw.addBox(-2.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.LElbow = new ModelRenderer(this, 10, 23);
        this.LElbow.setRotationPoint(1.5F, 9.3F, 0.0F);
        this.LElbow.addBox(-3.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.RLeg = new ModelRenderer(this, 18, 35);
        this.RLeg.setRotationPoint(2.2F, 0.6F, 1.7F);
        this.RLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(RLeg, -0.7740535232594852F, -0.045553093477052F, 0.0F);
        this.RLegJoint = new ModelRenderer(this, 0, 0);
        this.RLegJoint.setRotationPoint(0.0F, 0.49999999999999967F, 2.0000000000000004F);
        this.RLegJoint.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.RElbow = new ModelRenderer(this, 10, 23);
        this.RElbow.setRotationPoint(1.5F, 9.3F, 0.0F);
        this.RElbow.addBox(-3.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RElbow, 0.0F, -0.06503781172472956F, 0.0F);
        this.RFingerSet2b = new ModelRenderer(this, 12, 70);
        this.RFingerSet2b.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.RFingerSet2b.addBox(-0.5F, 0.0F, -0.4F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RFingerSet2b, 0.0F, 0.0F, 0.36425021489121656F);
        this.LThumb = new ModelRenderer(this, 0, 65);
        this.LThumb.setRotationPoint(-0.5F, 0.1F, -0.9F);
        this.LThumb.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(LThumb, -0.136659280431156F, 0.0F, 0.0F);
        this.BodyMiddle = new ModelRenderer(this, 32, 10);
        this.BodyMiddle.setRotationPoint(1.5F, -7.4F, -1.4F);
        this.BodyMiddle.addBox(-4.5F, -1.5F, -2.0F, 6, 8, 3, 0.0F);
        this.setRotateAngle(BodyMiddle, 0.27314402793711257F, 0.0F, 0.0F);
        this.LFingerSet1b = new ModelRenderer(this, 5, 70);
        this.LFingerSet1b.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.LFingerSet1b.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(LFingerSet1b, 0.0F, 0.0F, -0.36425021489121656F);
        this.RLegLow = new ModelRenderer(this, 18, 46);
        this.RLegLow.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RLegLow.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.LFingerSet1a = new ModelRenderer(this, 5, 65);
        this.LFingerSet1a.setRotationPoint(-1.4F, 1.0F, -0.5F);
        this.LFingerSet1a.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(LFingerSet1a, 0.0F, 0.136659280431156F, 0.18203784098300857F);
        this.RFingerSet2a = new ModelRenderer(this, 12, 66);
        this.RFingerSet2a.setRotationPoint(-1.0F, 1.6F, 1.0F);
        this.RFingerSet2a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RFingerSet2a, 0.0F, -0.40980330836826856F, -0.18203784098300857F);
        this.BodyTop = new ModelRenderer(this, 32, 0);
        this.BodyTop.setRotationPoint(-1.5F, -1.3F, -1.2F);
        this.BodyTop.addBox(-3.5F, -2.5F, -2.5F, 7, 5, 5, 0.0F);
        this.setRotateAngle(BodyTop, 0.27314402793711257F, 0.0F, 0.0F);
        this.LLegLow = new ModelRenderer(this, 0, 46);
        this.LLegLow.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LLegLow.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.LArm = new ModelRenderer(this, 36, 35);
        this.LArm.setRotationPoint(-1.6F, 0.7F, 0.0F);
        this.LArm.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(LArm, 0.40980330836826856F, -0.18203784098300857F, 0.0F);
        this.RJaw = new ModelRenderer(this, 14, 14);
        this.RJaw.setRotationPoint(0.5F, -4.0F, -1.4F);
        this.RJaw.addBox(-0.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.RArmLow_1 = new ModelRenderer(this, 46, 46);
        this.RArmLow_1.setRotationPoint(-1.6F, 0.7F, 0.0F);
        this.RArmLow_1.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(RArmLow_1, -0.7285004297824331F, -0.091106186954104F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -12.6F, -3.7F);
        this.Head.addBox(-3.5F, -8.0F, -3.5F, 7, 7, 7, 0.0F);
        this.setRotateAngle(Head, -0.043509845363600315F, 2.511265318566215E-15F, 0.0F);
        this.LFingerSet1b_1 = new ModelRenderer(this, 5, 70);
        this.LFingerSet1b_1.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.LFingerSet1b_1.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(LFingerSet1b_1, 0.0F, 0.0F, 0.36425021489121656F);
        this.LKnee = new ModelRenderer(this, 10, 23);
        this.LKnee.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.LKnee.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LKnee, 1.1383037381507017F, 0.0F, 0.0F);
        this.LSholder = new ModelRenderer(this, 10, 23);
        this.LSholder.setRotationPoint(-3.2F, -8.3F, -0.8F);
        this.LSholder.addBox(-3.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LSholder, 0.0F, -0.2080540269475341F, 0.056742007349327425F);
        this.LFingerSet2a = new ModelRenderer(this, 12, 66);
        this.LFingerSet2a.setRotationPoint(-1.0F, 1.4F, 0.8F);
        this.LFingerSet2a.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LFingerSet2a, 0.045553093477052F, 0.40980330836826856F, 0.18203784098300857F);
        this.RFingerSet1a = new ModelRenderer(this, 5, 65);
        this.RFingerSet1a.setRotationPoint(-0.6F, 1.0F, -0.5F);
        this.RFingerSet1a.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(RFingerSet1a, 0.0F, -0.136659280431156F, -0.18203784098300857F);
        this.RKnee = new ModelRenderer(this, 10, 23);
        this.RKnee.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.RKnee.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RKnee, 1.1383037381507017F, 0.0F, 0.0F);
        this.RThumb = new ModelRenderer(this, 0, 65);
        this.RThumb.setRotationPoint(-1.5F, 0.1F, -0.9F);
        this.RThumb.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(RThumb, -0.136659280431156F, 0.14611609378280338F, 0.0F);
        this.RArmLow = new ModelRenderer(this, 36, 46);
        this.RArmLow.setRotationPoint(-1.6F, 0.7F, 0.0F);
        this.RArmLow.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(RArmLow, -0.7285004297824331F, 0.091106186954104F, 0.0F);
        this.LHand = new ModelRenderer(this, 36, 58);
        this.LHand.setRotationPoint(1.0F, 9.3F, 0.0F);
        this.LHand.addBox(-2.0F, -1.5F, -1.5F, 2, 4, 3, 0.0F);
        this.LFingerSet2b = new ModelRenderer(this, 12, 70);
        this.LFingerSet2b.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.LFingerSet2b.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LFingerSet2b, 0.0F, 0.0F, -0.36425021489121656F);
        this.RArm = new ModelRenderer(this, 46, 35);
        this.RArm.setRotationPoint(1.6F, 0.7F, 0.0F);
        this.RArm.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(RArm, 0.40980330836826856F, 0.0194433116711849F, 0.0F);
        this.LFeet = new ModelRenderer(this, 0, 58);
        this.LFeet.setRotationPoint(0.2F, 9.2F, 0.0F);
        this.LFeet.addBox(-2.4F, 0.0F, -3.7F, 4, 2, 5, 0.0F);
        this.setRotateAngle(LFeet, -0.36425021489121656F, 0.0F, 0.0F);
        this.BodyLow = new ModelRenderer(this, 32, 21);
        this.BodyLow.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.BodyLow.addBox(-3.5F, -1.5F, -2.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(BodyLow, 0.091106186954104F, 0.0F, 0.0F);
        this.RSholder = new ModelRenderer(this, 10, 23);
        this.RSholder.setRotationPoint(3.2F, -8.3F, -0.8F);
        this.RSholder.addBox(0.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RSholder, 0.0F, -0.09755671758709375F, 0.0F);
        this.RLegLow.addChild(this.RFeet);
        this.LLegJoint.addChild(this.LLeg);
        this.RArmLow_1.addChild(this.LHand_1);
        this.Head.addChild(this.LJaw);
        this.LArm.addChild(this.LElbow);
        this.RLegJoint.addChild(this.RLeg);
        this.RArm.addChild(this.RElbow);
        this.RFingerSet2a.addChild(this.RFingerSet2b);
        this.LHand.addChild(this.LThumb);
        this.BodyLow.addChild(this.BodyMiddle);
        this.LFingerSet1a.addChild(this.LFingerSet1b);
        this.RKnee.addChild(this.RLegLow);
        this.LHand.addChild(this.LFingerSet1a);
        this.LHand_1.addChild(this.RFingerSet2a);
        this.BodyMiddle.addChild(this.BodyTop);
        this.LKnee.addChild(this.LLegLow);
        this.LSholder.addChild(this.LArm);
        this.Head.addChild(this.RJaw);
        this.RElbow.addChild(this.RArmLow_1);
        this.RFingerSet1a.addChild(this.LFingerSet1b_1);
        this.LLeg.addChild(this.LKnee);
        this.LHand.addChild(this.LFingerSet2a);
        this.LHand_1.addChild(this.RFingerSet1a);
        this.RLeg.addChild(this.RKnee);
        this.LHand_1.addChild(this.RThumb);
        this.LElbow.addChild(this.RArmLow);
        this.RArmLow.addChild(this.LHand);
        this.LFingerSet2a.addChild(this.LFingerSet2b);
        this.RSholder.addChild(this.RArm);
        this.LLegLow.addChild(this.LFeet);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.scale(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.LLegJoint.render(f5);
        this.Neck.render(f5);
        this.RLegJoint.render(f5);
        this.Head.render(f5);
        this.LSholder.render(f5);
        this.BodyLow.render(f5);
        this.RSholder.render(f5);
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

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    }
}
