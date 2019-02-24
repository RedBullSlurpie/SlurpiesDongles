package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.armor.*;
import com.rbs.slurpiesdongles.handlers.SDEnumArmorMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModArmor {

    public static final List<Item> ARMORS = new ArrayList<>();

    public static Item AMAZONITE_HELMET = new AmazoniteArmor("amazonite_helmet", SDEnumArmorMaterials.AMAZONITE, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_CHESTPLATE = new AmazoniteArmor("amazonite_chestplate", SDEnumArmorMaterials.AMAZONITE, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_LEGGINGS = new AmazoniteArmor("amazonite_leggings", SDEnumArmorMaterials.AMAZONITE, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_BOOTS = new AmazoniteArmor("amazonite_boots", SDEnumArmorMaterials.AMAZONITE, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_HELMET = new AmethystArmor("amethyst_helmet", SDEnumArmorMaterials.AMETHYST, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_CHESTPLATE = new AmethystArmor("amethyst_chestplate", SDEnumArmorMaterials.AMETHYST, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_LEGGINGS = new AmethystArmor("amethyst_leggings", SDEnumArmorMaterials.AMETHYST, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_BOOTS = new AmethystArmor("amethyst_boots", SDEnumArmorMaterials.AMETHYST, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_HELMET = new PeridotArmor("peridot_helmet", SDEnumArmorMaterials.PERIDOT, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_CHESTPLATE = new PeridotArmor("peridot_chestplate", SDEnumArmorMaterials.PERIDOT, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_LEGGINGS = new PeridotArmor("peridot_leggings", SDEnumArmorMaterials.PERIDOT, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_BOOTS = new PeridotArmor("peridot_boots", SDEnumArmorMaterials.PERIDOT, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_HELMET = new RubyArmor("ruby_helmet", SDEnumArmorMaterials.RUBY, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_CHESTPLATE = new RubyArmor("ruby_chestplate", SDEnumArmorMaterials.RUBY, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_LEGGINGS = new RubyArmor("ruby_leggings", SDEnumArmorMaterials.RUBY, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_BOOTS = new RubyArmor("ruby_boots", SDEnumArmorMaterials.RUBY, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_HELMET = new SapphireArmor("sapphire_helmet", SDEnumArmorMaterials.SAPPHIRE, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_CHESTPLATE = new SapphireArmor("sapphire_chestplate", SDEnumArmorMaterials.SAPPHIRE, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_LEGGINGS = new SapphireArmor("sapphire_leggings", SDEnumArmorMaterials.SAPPHIRE, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_BOOTS = new SapphireArmor("sapphire_boots", SDEnumArmorMaterials.SAPPHIRE, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_HELMET = new TopazArmor("topaz_helmet", SDEnumArmorMaterials.TOPAZ, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_CHESTPLATE = new TopazArmor("topaz_chestplate", SDEnumArmorMaterials.TOPAZ, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_LEGGINGS = new TopazArmor("topaz_leggings", SDEnumArmorMaterials.TOPAZ, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_BOOTS = new TopazArmor("topaz_boots", SDEnumArmorMaterials.TOPAZ, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));

}
