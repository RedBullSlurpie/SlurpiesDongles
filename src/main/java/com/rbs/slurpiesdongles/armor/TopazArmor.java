package com.rbs.slurpiesdongles.armor;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModArmor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class TopazArmor extends ArmorItem {
    public TopazArmor(String name, IArmorMaterial materialIn, EquipmentSlotType slots, Item.Properties builder) {
        super(materialIn, slots, builder);

        this.setRegistryName(Reference.MODID, name);
        ModArmor.ARMORS.add(this);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EquipmentSlotType.LEGS) {
            return "slurpiesdongles:textures/models/armor/topaz_layer_1.png";
        } else {
            return "slurpiesdongles:textures/models/armor/topaz_layer_2.png";
        }
    }


    /*@Override
    public void onArmorTick(ItemStack stack, World world, EntityPlayer player) {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModArmor.TOPAZ_HELMET
                && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ModArmor.TOPAZ_CHESTPLATE
                && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModArmor.TOPAZ_LEGGINGS
                && player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModArmor.TOPAZ_BOOTS) {
            //player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 300, 0, false, false));

            if (!player.abilities.isCreativeMode) {
                if (!player.abilities.allowFlying) {
                    player.abilities.allowFlying = true;
                }

            }
        } else {
            if (!player.abilities.isCreativeMode) {
                player.abilities.isFlying = false;
                player.abilities.allowFlying = false;
            }

        }
    }*/
    public Rarity getRarity(ItemStack stack) {
        return stack.getCount() == 0 ? Rarity.RARE : Rarity.RARE;

    }
}