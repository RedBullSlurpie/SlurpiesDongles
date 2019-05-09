package com.rbs.slurpiesdongles.items.charms;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class SpeedCharmTier2 extends CharmBase {
    public SpeedCharmTier2 (String name, Properties properties) {
        super(properties, name);
    }

    @Override
    public void onTick(ItemStack stack, EntityPlayer living) {

    }

    @Override
    public boolean onTick(ItemStack stack, EntityPlayer living, World world) {
        if (!this.canTick(stack)) {
            living.addPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 1, false, false));
        }
        return false;
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Having this item in your inventory grants you Speed Tier 2"));
    }
    public EnumRarity getRarity(ItemStack stack) {
        return stack.getCount() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;

    }
    @OnlyIn(Dist.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
