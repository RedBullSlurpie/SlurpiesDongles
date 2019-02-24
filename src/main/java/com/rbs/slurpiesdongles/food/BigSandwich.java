package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import com.rbs.slurpiesdongles.init.ModTools;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class BigSandwich extends ItemFood {
    public BigSandwich(String name, Item.Properties builder) {
        super(20, 1.0F, true, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }

    @Nonnull
    @Override
    public ItemStack onItemUseFinish(@Nonnull ItemStack stack, @Nonnull World world, EntityLivingBase entityLiving) {
        if (!(entityLiving instanceof EntityPlayer))
            return stack;

        EntityPlayer player = (EntityPlayer) entityLiving;

        stack.shrink(1);
        player.getFoodStats().addStats(20, 1.0F);
        world.playSound((EntityPlayer) entityLiving, player.getPosition(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 1.0F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, world, player);
        return stack;
    }

    /**
     * How long it takes to use or consume an item
     */


    /**
     * returns the action that specifies what animation to play when the items
     * is being used
     */

    /**
     * Called whenever this item is equipped and the right mouse button is
     * pressed. Args: itemStack, world, entityPlayer
     */
    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);

        if (player.canEat(false)) {
            player.setActiveHand(hand);
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }

        return new ActionResult<>(EnumActionResult.FAIL, stack);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("This is a big sandwich, heals alot, but takes twice as long to eat"));
    }



    @Override
    public int getUseDuration(ItemStack par1ItemStack) {
        return 64;
    }
}
