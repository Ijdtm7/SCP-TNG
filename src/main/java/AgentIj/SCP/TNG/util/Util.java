package AgentIj.SCP.TNG.util;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Util
{
    public static Color getRandomColor()
    {
        return new Color(Reference.randomGenerator.nextInt(256), Reference.randomGenerator.nextInt(256), Reference.randomGenerator.nextInt(256));
    }

    public static boolean isEntitySurvivalPlayer(Entity entity)
    {
        if(entity instanceof EntityPlayer)
            return isPlayerInSurvivalMode((EntityPlayer) entity);
        return false;
    }

    public static boolean isPlayerInSurvivalMode(EntityPlayer entityPlayer)
    {
        return !entityPlayer.isSpectator() && !entityPlayer.isCreative();
    }


    public static <T extends Entity> java.util.List<T> getEntitiesInsideExcept(Entity entity, Class<T> cls, AxisAlignedBB axisAlignedBB, Predicate<T> condition)
    {
        List<T> entities=entity.world.getEntitiesWithinAABB(cls,axisAlignedBB);
        if(condition!=null)
            entities.removeIf(condition.negate());
        entities.remove(entity);
        return entities;
    }

    public static boolean isInSightOf(Entity watched, EntityLivingBase watcher, float angleRange)
    {
        assert angleRange<=180;
        Vec3d vecOne=new Vec3d(watched.posX- watcher.posX,(watched.posY+watched.getEyeHeight())- watcher.posY- watcher.getEyeHeight(),watched.posZ- watcher.posZ);
        vecOne=vecOne.normalize();
        Vec3d vecTwo= watcher.getLook(1).normalize();
        double dotproduct=vecTwo.dotProduct(vecOne);
        float threshold=(180-angleRange)/180f;
        if(dotproduct>threshold)
        {
            return watcher.canEntityBeSeen(watched);
        }
        return false;
    }

    public static boolean isWatcherLookingAtHead(EntityLivingBase watcher, Entity target)
    {
        Vec3d vec3d = watcher.getLook(1.0F).normalize();
        Vec3d vec3d1 = new Vec3d(target.posX - watcher.posX, watcher.getEntityBoundingBox().minY + (double)target.getEyeHeight() - (watcher.posY + (double)watcher.getEyeHeight()), target.posZ - watcher.posZ);
        double lengthVector = vec3d1.lengthVector();
        vec3d1 = vec3d1.normalize();
        double dotProduct = vec3d.dotProduct(vec3d1);
        if(dotProduct > 1.0D - 0.025D / lengthVector)
            return watcher.canEntityBeSeen(target);
        return false;
    }

    public static int secondsToTicks(int seconds)
    {
        return seconds*20;
    }

    public static List<BlockPos> boundingBoxToPositions(AxisAlignedBB axisAlignedBB)
    {
        List<BlockPos> positions=new ArrayList<>();
        for (double X = axisAlignedBB.minX; X <=axisAlignedBB.maxX; X++) {
            for (double Y = axisAlignedBB.minY; Y <= axisAlignedBB.maxY; Y++) {
                for (double Z = axisAlignedBB.minZ; Z <= axisAlignedBB.maxZ; Z++) {
                    positions.add(new BlockPos(X,Y,Z));
                }
            }
        }
        return positions;
    }
    public static boolean canReplaceBlock(BlockPos blockPos, World world)
    {
        IBlockState iBlockState=world.getBlockState(blockPos);
//        if(world.getTileEntity(blockPos)!=null)
        if(iBlockState.getBlock().hasTileEntity(iBlockState))
            return false;
        return !(iBlockState.getBlockHardness(world, blockPos) == -1);
    }
}
