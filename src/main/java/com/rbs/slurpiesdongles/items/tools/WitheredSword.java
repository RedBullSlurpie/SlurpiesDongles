package com.rbs.slurpiesdongles.items.tools;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class WitheredSword extends CustomSword {
    public WitheredSword(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(name, tier, attackDamageIn, attackSpeedIn, builder);
    }

    //This is to add a potion effect to a mob upon hitting them
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 100, 1));//100 = 5 seconds of Wither

        return true;
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Upon hitting an enemy, a 5 second Wither debuff is applied to them"));
    }
}
