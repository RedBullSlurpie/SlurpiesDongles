package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class RawBeefSlice extends Item {
    public RawBeefSlice(String name, Item.Properties p_i50045_1_) {
        super(p_i50045_1_);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
    public void onFoodEaten(ItemStack stack, World worldIn, PlayerEntity player) {
        if (!worldIn.isRemote) {
            if (stack.getCount() > 0)
            {
                player.addPotionEffect(new EffectInstance(Effects.HUNGER, 200, 1));

            }
            else
            {
                player.addPotionEffect(new EffectInstance(Effects.HUNGER, 200, 1));
            }
        }
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("Perhaps you should cook this first...or don't"));
    }
}
