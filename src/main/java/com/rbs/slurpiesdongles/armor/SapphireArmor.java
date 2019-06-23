package com.rbs.slurpiesdongles.armor;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModArmor;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SapphireArmor extends ArmorItem {
    public SapphireArmor(String name, IArmorMaterial materialIn, EquipmentSlotType slots, Item.Properties builder) {
        super(materialIn, slots, builder);

        this.setRegistryName(Reference.MODID, name);
        ModArmor.ARMORS.add(this);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType equipmentSlotIn, String layer) {
        if (equipmentSlotIn != EquipmentSlotType.LEGS) {
            return "slurpiesdongles:textures/models/armor/sapphire_layer_1.png";
        } else {
            return "slurpiesdongles:textures/models/armor/sapphire_layer_2.png";
        }
    }
}
