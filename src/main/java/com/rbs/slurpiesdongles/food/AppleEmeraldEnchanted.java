package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class AppleEmeraldEnchanted extends ItemFood {
    public AppleEmeraldEnchanted(int amount, float saturation, boolean isWolfFood, String name, Item.Properties builder) {
        super(amount, saturation, isWolfFood, builder);

        this.setAlwaysEdible();
        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public EnumRarity getRarity(ItemStack stack) {
        return stack.getCount() == 0 ? EnumRarity.EPIC : EnumRarity.EPIC;
    }


    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            if (stack.getCount() > 0) {
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 2));//200 = 10 seconds in game
                player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 40, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3600, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 4800, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 3));
            } else {
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 2));//200 = 10 seconds in game
                player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 40, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3600, 2));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 4800, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 3));
            }
        }
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponentString("Grants Absorbtion, Speed, Strength, Resistance & instant full health"));
    }
}