package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.items.tools.materials.ToolMaterials;
import com.rbs.slurpiesdongles.items.tools.*;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

import java.util.ArrayList;
import java.util.List;

public class ModTools {

    public static final List<Item> TOOLS = new ArrayList<Item>();

    //Axes
    public static Item AMAZONITE_AXE = new CustomAxe("amazonite_axe", ToolMaterials.AMAZONITE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_AXE = new CustomAxe("amethyst_axe", ToolMaterials.AMETHYST, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_AXE = new CustomAxe("emerald_axe", ToolMaterials.EMERALD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_AXE = new CustomAxe("peridot_axe", ToolMaterials.PERIDOT, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_AXE = new CustomAxe("ruby_axe", ToolMaterials.RUBY, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_AXE = new CustomAxe("sapphire_axe", ToolMaterials.SAPPHIRE, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_AXE = new CustomAxe("topaz_axe", ToolMaterials.TOPAZ, 7, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_AXE = new CustomAxe("withered_axe", ToolMaterials.WITHERED, 8, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));

    //Battleaxes
    public static Item AMAZONITE_BATTLEAXE = new CustomSword("amazonite_battleaxe", ToolMaterials.AMAZONITE_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_BATTLEAXE = new CustomSword("amethyst_battleaxe", ToolMaterials.AMETHYST_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item DIAMOND_BATTLEAXE = new CustomSword("diamond_battleaxe", ItemTier.DIAMOND, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_BATTLEAXE = new CustomSword("emerald_battleaxe", ToolMaterials.EMERALD_BATTLEAXE, 5, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GOLD_BATTLEAXE = new CustomSword("gold_battleaxe", ItemTier.GOLD, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item IRON_BATTLEAXE = new CustomSword("iron_battleaxe", ItemTier.IRON, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_BATTLEAXE = new CustomSword("peridot_battleaxe", ToolMaterials.PERIDOT_BATTLEAXE, 3, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_BATTLEAXE = new CustomSword("ruby_battleaxe", ToolMaterials.RUBY_BATTLEAXE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_BATTLEAXE = new CustomSword("sapphire_battleaxe", ToolMaterials.SAPPHIRE_BATTLEAXE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STONE_BATTLEAXE = new CustomSword("stone_battleaxe", ItemTier.STONE, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_BATTLEAXE = new CustomSword("topaz_battleaxe", ToolMaterials.TOPAZ_BATTLEAXE, 7, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_BATTLEAXE = new WitheredSword("withered_battleaxe", ToolMaterials.WITHERED_BATTLEAXE, 8, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));
    public static Item WOODEN_BATTLEAXE = new CustomSword("wooden_battleaxe", ItemTier.WOOD, 4, -3.0F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Hoes
    public static Item AMAZONITE_HOE = new CustomHoe("amazonite_hoe", ToolMaterials.AMAZONITE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_HOE = new CustomHoe("amethyst_hoe", ToolMaterials.AMETHYST, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_HOE = new CustomHoe("emerald_hoe", ToolMaterials.EMERALD, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_HOE = new CustomHoe("peridot_hoe", ToolMaterials.PERIDOT, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_HOE = new CustomHoe("ruby_hoe", ToolMaterials.RUBY, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_HOE = new CustomHoe("sapphire_hoe", ToolMaterials.SAPPHIRE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_HOE = new CustomHoe("topaz_hoe", ToolMaterials.TOPAZ, 1, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_HOE = new CustomHoe("withered_hoe", ToolMaterials.WITHERED, 1, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));

    //Paxels
    public static Item AMAZONITE_PAXEL = new Paxel("amazonite_paxel", ToolMaterials.AMAZONITE_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_PAXEL = new Paxel("amethyst_paxel", ToolMaterials.AMETHYST_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item DIAMOND_PAXEL = new Paxel("diamond_paxel", ToolMaterials.DIAMOND_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_PAXEL = new Paxel("emerald_paxel", ToolMaterials.EMERALD_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GOLD_PAXEL = new Paxel("gold_paxel", ToolMaterials.GOLD_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item IRON_PAXEL = new Paxel("iron_paxel", ToolMaterials.IRON_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STONE_PAXEL = new Paxel("stone_paxel", ToolMaterials.STONE_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_PAXEL = new Paxel("peridot_paxel", ToolMaterials.PERIDOT_PAXEL, 2, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_PAXEL = new Paxel("ruby_paxel", ToolMaterials.RUBY_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_PAXEL = new Paxel("sapphire_paxel", ToolMaterials.SAPPHIRE_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_PAXEL = new Paxel("topaz_paxel", ToolMaterials.TOPAZ_PAXEL, 6, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_PAXEL = new Paxel("withered_paxel", ToolMaterials.WITHERED_PAXEL, 7, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));
    public static Item WOODEN_PAXEL = new Paxel("wooden_paxel", ToolMaterials.WOODEN_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Pickaxes
    public static Item AMAZONITE_PICKAXE = new CustomPickaxe("amazonite_pickaxe", ToolMaterials.AMAZONITE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_PICKAXE = new CustomPickaxe("amethyst_pickaxe", ToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_PICKAXE = new CustomPickaxe("emerald_pickaxe", ToolMaterials.EMERALD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_PICKAXE = new CustomPickaxe("peridot_pickaxe", ToolMaterials.PERIDOT, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_PICKAXE = new CustomPickaxe("ruby_pickaxe", ToolMaterials.RUBY, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_PICKAXE = new CustomPickaxe("sapphire_pickaxe", ToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_PICKAXE = new CustomPickaxe("topaz_pickaxe", ToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_PICKAXE = new CustomPickaxe("withered_pickaxe", ToolMaterials.WITHERED, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));
    public static Item VM_PICKAXE = new VMPick("vmpick", ToolMaterials.VMPICK, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Shovels
    public static Item AMAZONITE_SHOVEL = new CustomShovel("amazonite_shovel", ToolMaterials.AMAZONITE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_SHOVEL = new CustomShovel("amethyst_shovel", ToolMaterials.AMETHYST, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_SHOVEL = new CustomShovel("emerald_shovel", ToolMaterials.EMERALD, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_SHOVEL = new CustomShovel("peridot_shovel", ToolMaterials.PERIDOT, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_SHOVEL = new CustomShovel("ruby_shovel", ToolMaterials.RUBY, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_SHOVEL = new CustomShovel("sapphire_shovel", ToolMaterials.SAPPHIRE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_SHOVEL = new CustomShovel("topaz_shovel", ToolMaterials.TOPAZ, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_SHOVEL = new CustomShovel("withered_shovel", ToolMaterials.WITHERED, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));

    //Swords
    public static Item AMAZONITE_SWORD = new CustomSword("amazonite_sword", ToolMaterials.AMAZONITE_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST_SWORD = new CustomSword("amethyst_sword", ToolMaterials.AMETHYST_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item EMERALD_SWORD = new CustomSword("emerald_sword", ToolMaterials.EMERALD_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT_SWORD = new CustomSword("peridot_sword", ToolMaterials.PERIDOT_SWORD, 2, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY_SWORD = new CustomSword("ruby_sword", ToolMaterials.RUBY_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE_SWORD = new CustomSword("sapphire_sword", ToolMaterials.SAPPHIRE_SWORD, 3, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_SWORD = new CustomSword("topaz_sword", ToolMaterials.TOPAZ_SWORD, 6, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.RARE));
    public static Item WITHERED_SWORD = new WitheredSword("withered_sword", ToolMaterials.WITHERED_SWORD, 7, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles).rarity(EnumRarity.EPIC));
}
