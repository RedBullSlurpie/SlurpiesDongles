package com.rbs.slurpiesdongles.items.charms;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class RegenerationCharmTier2 extends CharmBase {
    public RegenerationCharmTier2 (String name, Properties properties) {
        super(properties, name);
    }

    @Override
    public void onTick(ItemStack stack, EntityPlayer living) {

    }

    @Override
    public boolean onTick(ItemStack stack, EntityPlayer living, World world) {
        if (living instanceof EntityPlayer) {
            if (world.getGameTime() % 40 == 0 && ((EntityPlayer) living).getHealth() < ((EntityPlayer) living).getMaxHealth())//% number is how often the charm heals, 20 = 1 second

                if (!this.canTick(stack)) {
                    living.heal(1.0F);
                }
        }
        return false;
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Having this item in your inventory grants you Health Regeneration at a faster rate than the tier 1 charm"));
    }
    public EnumRarity getRarity(ItemStack stack) {
        return stack.getCount() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;

    }
    @OnlyIn(Dist.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
