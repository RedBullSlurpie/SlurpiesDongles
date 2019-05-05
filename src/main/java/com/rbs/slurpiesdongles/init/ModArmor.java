package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.armor.*;
import com.rbs.slurpiesdongles.armor.materials.ArmorMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModArmor {

    public static final List<Item> ARMORS = new ArrayList<>();

    public static Item AMAZONITE_HELMET = new AmazoniteArmor("amazonite_helmet", ArmorMaterials.AMAZONITE, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_CHESTPLATE = new AmazoniteArmor("amazonite_chestplate", ArmorMaterials.AMAZONITE, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_LEGGINGS = new AmazoniteArmor("amazonite_leggings", ArmorMaterials.AMAZONITE, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMAZONITE_BOOTS = new AmazoniteArmor("amazonite_boots", ArmorMaterials.AMAZONITE, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_HELMET = new AmethystArmor("amethyst_helmet", ArmorMaterials.AMETHYST, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_CHESTPLATE = new AmethystArmor("amethyst_chestplate", ArmorMaterials.AMETHYST, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_LEGGINGS = new AmethystArmor("amethyst_leggings", ArmorMaterials.AMETHYST, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_BOOTS = new AmethystArmor("amethyst_boots", ArmorMaterials.AMETHYST, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WITHERED_HELMET = new WitheredArmor("withered_helmet", ArmorMaterials.WITHERED, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WITHERED_CHESTPLATE = new WitheredArmor("withered_chestplate", ArmorMaterials.WITHERED, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WITHERED_LEGGINGS = new WitheredArmor("withered_leggings", ArmorMaterials.WITHERED, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WITHERED_BOOTS = new WitheredArmor("withered_boots", ArmorMaterials.WITHERED, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_HELMET = new PeridotArmor("peridot_helmet", ArmorMaterials.PERIDOT, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_CHESTPLATE = new PeridotArmor("peridot_chestplate", ArmorMaterials.PERIDOT, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_LEGGINGS = new PeridotArmor("peridot_leggings", ArmorMaterials.PERIDOT, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_BOOTS = new PeridotArmor("peridot_boots", ArmorMaterials.PERIDOT, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_HELMET = new RubyArmor("ruby_helmet", ArmorMaterials.RUBY, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_CHESTPLATE = new RubyArmor("ruby_chestplate", ArmorMaterials.RUBY, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_LEGGINGS = new RubyArmor("ruby_leggings", ArmorMaterials.RUBY, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_BOOTS = new RubyArmor("ruby_boots", ArmorMaterials.RUBY, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_HELMET = new SapphireArmor("sapphire_helmet", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_CHESTPLATE = new SapphireArmor("sapphire_chestplate", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_LEGGINGS = new SapphireArmor("sapphire_leggings", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_BOOTS = new SapphireArmor("sapphire_boots", ArmorMaterials.SAPPHIRE, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_HELMET = new TopazArmor("topaz_helmet", ArmorMaterials.TOPAZ, EntityEquipmentSlot.HEAD, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_CHESTPLATE = new TopazArmor("topaz_chestplate", ArmorMaterials.TOPAZ, EntityEquipmentSlot.CHEST, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_LEGGINGS = new TopazArmor("topaz_leggings", ArmorMaterials.TOPAZ, EntityEquipmentSlot.LEGS, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_BOOTS = new TopazArmor("topaz_boots", ArmorMaterials.TOPAZ, EntityEquipmentSlot.FEET, new Item.Properties().group(Reference.tabSlurpiesDongles));

}
