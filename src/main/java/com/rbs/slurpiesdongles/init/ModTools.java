package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.handlers.SDEnumToolMaterials;
import com.rbs.slurpiesdongles.items.tools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModTools {

    public static final List<Item> TOOLS = new ArrayList<Item>();

    //Axes
    public static Item AMAZONITE_AXE = new CustomAxe("amazonite_axe", SDEnumToolMaterials.AMAZONITE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_AXE = new CustomAxe("amethyst_axe", SDEnumToolMaterials.AMETHYST, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_AXE = new CustomAxe("emerald_axe", SDEnumToolMaterials.EMERALD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_AXE = new CustomAxe("peridot_axe", SDEnumToolMaterials.PERIDOT, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_AXE = new CustomAxe("ruby_axe", SDEnumToolMaterials.RUBY, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_AXE = new CustomAxe("sapphire_axe", SDEnumToolMaterials.SAPPHIRE, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_AXE = new CustomAxe("topaz_axe", SDEnumToolMaterials.TOPAZ, 9, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Battleaxes
    public static Item AMAZONITE_BATTLEAXE = new CustomSword("amazonite_battleaxe", SDEnumToolMaterials.AMAZONITE_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_BATTLEAXE = new CustomSword("amethyst_battleaxe", SDEnumToolMaterials.AMETHYST_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item DIAMOND_BATTLEAXE = new CustomSword("diamond_battleaxe", ItemTier.DIAMOND, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_BATTLEAXE = new CustomSword("emerald_battleaxe", SDEnumToolMaterials.EMERALD_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GOLD_BATTLEAXE = new CustomSword("gold_battleaxe", ItemTier.GOLD, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item IRON_BATTLEAXE = new CustomSword("iron_battleaxe", ItemTier.IRON, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_BATTLEAXE = new CustomSword("peridot_battleaxe", SDEnumToolMaterials.PERIDOT_BATTLEAXE, 3, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_BATTLEAXE = new CustomSword("ruby_battleaxe", SDEnumToolMaterials.RUBY_BATTLEAXE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_BATTLEAXE = new CustomSword("sapphire_battleaxe", SDEnumToolMaterials.SAPPHIRE_BATTLEAXE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STONE_BATTLEAXE = new CustomSword("stone_battleaxe", ItemTier.STONE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_BATTLEAXE = new CustomSword("topaz_battleaxe", SDEnumToolMaterials.TOPAZ_BATTLEAXE, 7, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WOODEN_BATTLEAXE = new CustomSword("wooden_battleaxe", ItemTier.WOOD, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Hoes
    public static Item AMAZONITE_HOE = new CustomHoe("amazonite_hoe", SDEnumToolMaterials.AMAZONITE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_HOE = new CustomHoe("amethyst_hoe", SDEnumToolMaterials.AMETHYST, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_HOE = new CustomHoe("emerald_hoe", SDEnumToolMaterials.EMERALD, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_HOE = new CustomHoe("peridot_hoe", SDEnumToolMaterials.PERIDOT, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_HOE = new CustomHoe("ruby_hoe", SDEnumToolMaterials.RUBY, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_HOE = new CustomHoe("sapphire_hoe", SDEnumToolMaterials.SAPPHIRE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_HOE = new CustomHoe("topaz_hoe", SDEnumToolMaterials.TOPAZ, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Paxels
    public static Item AMAZONITE_PAXEL = new Paxel("amazonite_paxel", SDEnumToolMaterials.AMAZONITE_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_PAXEL = new Paxel("amethyst_paxel", SDEnumToolMaterials.AMETHYST_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item DIAMOND_PAXEL = new Paxel("diamond_paxel", SDEnumToolMaterials.DIAMOND_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_PAXEL = new Paxel("emerald_paxel", SDEnumToolMaterials.EMERALD_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GOLD_PAXEL = new Paxel("gold_paxel", SDEnumToolMaterials.GOLD_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item IRON_PAXEL = new Paxel("iron_paxel", SDEnumToolMaterials.IRON_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STONE_PAXEL = new Paxel("stone_paxel", SDEnumToolMaterials.STONE_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_PAXEL = new Paxel("peridot_paxel", SDEnumToolMaterials.PERIDOT_PAXEL, 2, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_PAXEL = new Paxel("ruby_paxel", SDEnumToolMaterials.RUBY_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_PAXEL = new Paxel("sapphire_paxel", SDEnumToolMaterials.SAPPHIRE_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_PAXEL = new Paxel("topaz_paxel", SDEnumToolMaterials.TOPAZ_PAXEL, 6, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WOODEN_PAXEL = new Paxel("wooden_paxel", SDEnumToolMaterials.WOODEN_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Pickaxes
    public static Item AMAZONITE_PICKAXE = new CustomPickaxe("amazonite_pickaxe", SDEnumToolMaterials.AMAZONITE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_PICKAXE = new CustomPickaxe("amethyst_pickaxe", SDEnumToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_PICKAXE = new CustomPickaxe("emerald_pickaxe", SDEnumToolMaterials.EMERALD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_PICKAXE = new CustomPickaxe("peridot_pickaxe", SDEnumToolMaterials.PERIDOT, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_PICKAXE = new CustomPickaxe("ruby_pickaxe", SDEnumToolMaterials.RUBY, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_PICKAXE = new CustomPickaxe("sapphire_pickaxe", SDEnumToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_PICKAXE = new CustomPickaxe("topaz_pickaxe", SDEnumToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item VM_PICKAXE = new VMPick("vmpick", SDEnumToolMaterials.VMPICK, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Shovels
    public static Item AMAZONITE_SHOVEL = new CustomShovel("amazonite_shovel", SDEnumToolMaterials.AMAZONITE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_SHOVEL = new CustomShovel("amethyst_shovel", SDEnumToolMaterials.AMETHYST, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_SHOVEL = new CustomShovel("emerald_shovel", SDEnumToolMaterials.EMERALD, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_SHOVEL = new CustomShovel("peridot_shovel", SDEnumToolMaterials.PERIDOT, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_SHOVEL = new CustomShovel("ruby_shovel", SDEnumToolMaterials.RUBY, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_SHOVEL = new CustomShovel("sapphire_shovel", SDEnumToolMaterials.SAPPHIRE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_SHOVEL = new CustomShovel("topaz_shovel", SDEnumToolMaterials.TOPAZ, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Swords
    public static Item AMAZONITE_SWORD = new CustomSword("amazonite_sword", SDEnumToolMaterials.AMAZONITE_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_SWORD = new CustomSword("amethyst_sword", SDEnumToolMaterials.AMETHYST_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_SWORD = new CustomSword("emerald_sword", SDEnumToolMaterials.EMERALD_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_SWORD = new CustomSword("peridot_sword", SDEnumToolMaterials.PERIDOT_SWORD, 2, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_SWORD = new CustomSword("ruby_sword", SDEnumToolMaterials.RUBY_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_SWORD = new CustomSword("sapphire_sword", SDEnumToolMaterials.SAPPHIRE_SWORD, 3, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_SWORD = new CustomSword("topaz_sword", SDEnumToolMaterials.TOPAZ_SWORD, 6, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
}
