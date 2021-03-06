package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.SlurpiesDongles;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EnchantedEmeraldApple extends ItemFood {

    public EnchantedEmeraldApple(int amount, float saturation, boolean isWolfFood, String name) {

        super(amount, saturation, isWolfFood);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();
        this.setMaxStackSize(16);
        setCreativeTab(SlurpiesDongles.creativeTab);

        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public EnumRarity getRarity(ItemStack stack)
    {
        return stack.getMetadata() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;
    }


    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            if (stack.getMetadata() > 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 2));//200 = 10 seconds in game
                player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 40, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3600, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 4800, 4));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 3));
            } else {
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 2));//200 = 10 seconds in game
                player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 40, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3600, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 4800, 4));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 3));
            }
        }
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Grants Strength, Resistance, Absorbtion, Speed, & instant full health.");
    }
}
