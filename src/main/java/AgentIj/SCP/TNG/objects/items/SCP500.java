package AgentIj.SCP.TNG.objects.items;

import AgentIj.SCP.TNG.scptng;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Collection;

public class SCP500 extends ItemBase
{

    public SCP500(String name)
    {
        super(name, scptng.scptngtab);

        setMaxStackSize(47);


    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 15;
    }


    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand)
    {
        if(heal(target, stack))
        {
            stack.shrink(1);
            return true;
        }
        return super.itemInteractionForEntity(stack, playerIn, target, hand);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        if(!playerIn.getActivePotionEffects().isEmpty()||playerIn.getHealth()<playerIn.getMaxHealth())
        {
            playerIn.setActiveHand(handIn);
            return new ActionResult<>(EnumActionResult.SUCCESS,playerIn.getHeldItem(handIn));
        }
        return new ActionResult<>(EnumActionResult.PASS,playerIn.getHeldItem(handIn));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if(heal(entityLiving, stack))
        {

            stack.shrink(1);
        }
        return stack;
    }



    private boolean heal(EntityLivingBase entityLiving, ItemStack stack)
    {
        boolean decreaseStack=false;
        Collection<PotionEffect> effects = entityLiving.getActivePotionEffects();
        for (PotionEffect activePotionEffect : entityLiving.getActivePotionEffects())
        {
            if (activePotionEffect.getPotion().isBadEffect())
            {
                for(PotionEffect effect : effects)
                {
                    if (effect.getPotion().isBadEffect()) {
                        entityLiving.removePotionEffect(effect.getPotion());
                    }
                }

                entityLiving.curePotionEffects(stack);
                decreaseStack=true;
                break;
            }
        }

        entityLiving.curePotionEffects(stack);
        if(entityLiving.getHealth()<entityLiving.getMaxHealth())
        {
            entityLiving.heal(entityLiving.getMaxHealth());
            decreaseStack=true;
        }
        return decreaseStack;

    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return  EnumAction.EAT;
    }




















}
