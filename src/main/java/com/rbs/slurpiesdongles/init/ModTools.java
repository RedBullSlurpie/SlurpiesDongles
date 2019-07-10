package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import com.rbs.slurpiesdongles.items.tools.materials.ToolMaterials;
import com.rbs.slurpiesdongles.items.tools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD) //This line tells forge this class has events we want to listen to, we also tell forge we want to listen to the Mod bus. (This is new in 1.13)
@ObjectHolder(Reference.MODID) //We use ObjectHolder to let forge inject the item into our variables, this to make sure when people replace our item we use the correct one.

public class ModTools {
    //Axes
    public static final Item amazonite_axe = null;
    public static final Item amethyst_axe = null;
    public static final Item emerald_axe = null;
    public static final Item peridot_axe = null;
    public static final Item ruby_axe = null;
    public static final Item sapphire_axe = null;
    public static final Item topaz_axe = null;
    public static final Item withered_axe = null;
    //Battleaxes
    public static final Item amazonite_battleaxe = null;
    public static final Item amethyst_battleaxe = null;
    public static final Item diamond_battleaxe = null;
    public static final Item emerald_battleaxe = null;
    public static final Item gold_battleaxe = null;
    public static final Item iron_battleaxe = null;
    public static final Item peridot_battleaxe = null;
    public static final Item ruby_battleaxe = null;
    public static final Item sapphire_battleaxe = null;
    public static final Item stone_battleaxe = null;
    public static final Item topaz_battleaxe = null;
    public static final Item withered_battleaxe = null;
    public static final Item wooden_battleaxe = null;
    //Hammers
    public static final Item amazonite_hammer = null;
    public static final Item amethyst_hammer = null;
    public static final Item diamond_hammer = null;
    public static final Item emerald_hammer = null;
    public static final Item gold_hammer = null;
    public static final Item iron_hammer = null;
    public static final Item peridot_hammer = null;
    public static final Item ruby_hammer = null;
    public static final Item sapphire_hammer = null;
    public static final Item stone_hammer = null;
    public static final Item topaz_hammer = null;
    public static final Item vm_hammer = null;
    public static final Item withered_hammer = null;
    public static final Item wooden_hammer = null;
    //Hoes
    public static final Item amazonite_hoe = null;
    public static final Item amethyst_hoe = null;
    public static final Item emerald_hoe = null;
    public static final Item peridot_hoe = null;
    public static final Item ruby_hoe = null;
    public static final Item sapphire_hoe = null;
    public static final Item topaz_hoe = null;
    public static final Item withered_hoe = null;
    //Lumber Axes
    public static final Item amazonite_lumber_axe = null;
    public static final Item amethyst_lumber_axe = null;
    public static final Item diamond_lumber_axe = null;
    public static final Item emerald_lumber_axe = null;
    public static final Item gold_lumber_axe = null;
    public static final Item iron_lumber_axe = null;
    public static final Item peridot_lumber_axe = null;
    public static final Item ruby_lumber_axe = null;
    public static final Item sapphire_lumber_axe = null;
    public static final Item stone_lumber_axe = null;
    public static final Item topaz_lumber_axe = null;
    public static final Item withered_lumber_axe = null;
    public static final Item wooden_lumber_axe = null;
    //Paxels
    public static final Item amazonite_paxel = null;
    public static final Item amethyst_paxel = null;
    public static final Item diamond_paxel = null;
    public static final Item emerald_paxel = null;
    public static final Item gold_paxel = null;
    public static final Item iron_paxel = null;
    public static final Item peridot_paxel = null;
    public static final Item ruby_paxel = null;
    public static final Item sapphire_paxel = null;
    public static final Item stone_paxel = null;
    public static final Item topaz_paxel = null;
    public static final Item withered_paxel = null;
    public static final Item wooden_paxel = null;
    //Pickaxes
    public static final Item amazonite_pickaxe = null;
    public static final Item amethyst_pickaxe = null;
    public static final Item emerald_pickaxe = null;
    public static final Item peridot_pickaxe = null;
    public static final Item ruby_pickaxe = null;
    public static final Item sapphire_pickaxe = null;
    public static final Item topaz_pickaxe = null;
    public static final Item withered_pickaxe = null;
    public static final Item vmpick = null;
    //Shovels
    public static final Item amazonite_shovel = null;
    public static final Item amethyst_shovel = null;
    public static final Item emerald_shovel = null;
    public static final Item peridot_shovel = null;
    public static final Item ruby_shovel = null;
    public static final Item sapphire_shovel = null;
    public static final Item topaz_shovel = null;
    public static final Item withered_shovel = null;
    //Swords
    public static final Item amazonite_sword = null;
    public static final Item amethyst_sword = null;
    public static final Item emerald_sword = null;
    public static final Item peridot_sword = null;
    public static final Item ruby_sword = null;
    public static final Item sapphire_sword = null;
    public static final Item topaz_sword = null;
    public static final Item withered_sword = null;
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                //Axes
                new CustomAxe(ToolMaterials.AMAZONITE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMAZONITE, "amazonite_axe"),
                new CustomAxe(ToolMaterials.AMETHYST, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMETHYST, "amethyst_axe"),
                new CustomAxe(ToolMaterials.EMERALD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.DIAMOND, "emerald_axe"),
                new CustomAxe(ToolMaterials.PERIDOT, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.PERIDOT, "peridot_axe"),
                new CustomAxe(ToolMaterials.RUBY, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.RUBY, "ruby_axe"),
                new CustomAxe(ToolMaterials.SAPPHIRE, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.SAPPHIRE, "sapphire_axe"),
                new CustomAxe(ToolMaterials.TOPAZ, 7, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "topaz_axe"),
                new CustomAxe(ToolMaterials.WITHERED, 8, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "withered_axe"),
                //BattleAxes
                new CustomSword(ToolMaterials.AMAZONITE_BATTLEAXE, 5, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite_battleaxe"),
                new CustomSword(ToolMaterials.AMETHYST_BATTLEAXE, 5, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst_battleaxe"),
                new CustomSword(ItemTier.DIAMOND, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "diamond_battleaxe"),
                new CustomSword(ToolMaterials.EMERALD_BATTLEAXE, 5, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "emerald_battleaxe"),
                new CustomSword(ItemTier.GOLD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "gold_battleaxe"),
                new CustomSword(ItemTier.IRON, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "iron_battleaxe"),
                new CustomSword(ToolMaterials.PERIDOT_BATTLEAXE, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot_battleaxe"),
                new CustomSword(ToolMaterials.RUBY_BATTLEAXE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby_battleaxe"),
                new CustomSword(ToolMaterials.SAPPHIRE_BATTLEAXE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire_battleaxe"),
                new CustomSword(ItemTier.STONE, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "stone_battleaxe"),
                new CustomSword(ToolMaterials.TOPAZ_BATTLEAXE, 7, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_battleaxe"),
                new CustomSword(ToolMaterials.WITHERED_BATTLEAXE, 8, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "withered_battleaxe"),
                new CustomSword(ItemTier.WOOD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "wooden_battleaxe"),
                //Hammers
                new Hammer(ToolMaterials.AMAZONITE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite_hammer"),
                new Hammer(ToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst_hammer"),
                new Hammer(ItemTier.DIAMOND, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "diamond_hammer"),
                new Hammer(ToolMaterials.EMERALD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "emerald_hammer"),
                new Hammer(ItemTier.GOLD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "gold_hammer"),
                new Hammer(ItemTier.IRON, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "iron_hammer"),
                new Hammer(ToolMaterials.PERIDOT, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot_hammer"),
                new Hammer(ToolMaterials.RUBY, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby_hammer"),
                new Hammer(ToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire_hammer"),
                new Hammer(ItemTier.STONE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "stone_hammer"),
                new Hammer(ToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_hammer"),
                new Hammer(ToolMaterials.VMPICK, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "vm_hammer"),
                new Hammer(ToolMaterials.WITHERED, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "withered_hammer"),
                new Hammer(ItemTier.WOOD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), "wooden_hammer"),
                //Hoes
                new CustomHoe(ToolMaterials.AMAZONITE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite_hoe"),
                new CustomHoe(ToolMaterials.AMETHYST, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst_hoe"),
                new CustomHoe(ToolMaterials.EMERALD, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "emerald_hoe"),
                new CustomHoe(ToolMaterials.PERIDOT, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot_hoe"),
                new CustomHoe(ToolMaterials.RUBY, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby_hoe"),
                new CustomHoe(ToolMaterials.SAPPHIRE, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire_hoe"),
                new CustomHoe(ToolMaterials.TOPAZ, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_hoe"),
                new CustomHoe(ToolMaterials.WITHERED, 1, new Item.Properties().group(Reference.tabSlurpiesDongles), "withered_hoe"),
                //Lumber Axes
                new LumbarAxe(ToolMaterials.AMAZONITE, 7, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite_lumber_axe"),
                new LumbarAxe(ToolMaterials.AMETHYST, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst_lumber_axe"),
                new LumbarAxe(ItemTier.DIAMOND, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "diamond_lumber_axe"),
                new LumbarAxe(ToolMaterials.EMERALD, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "emerald_lumber_axe"),
                new LumbarAxe(ItemTier.GOLD, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "gold_lumber_axe"),
                new LumbarAxe(ItemTier.IRON, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "iron_lumber_axe"),
                new LumbarAxe(ToolMaterials.PERIDOT, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot_lumber_axe"),
                new LumbarAxe(ToolMaterials.RUBY, 4, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby_lumber_axe"),
                new LumbarAxe(ToolMaterials.SAPPHIRE, 3, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire_lumber_axe"),
                new LumbarAxe(ItemTier.STONE, 1, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "stone_lumber_axe"),
                new LumbarAxe(ToolMaterials.TOPAZ, 7, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_lumber_axe"),
                new LumbarAxe(ToolMaterials.WITHERED, 8, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "withered_lumber_axe"),
                new LumbarAxe(ItemTier.WOOD, 1, -3.1F, new Item.Properties().group(Reference.tabSlurpiesDongles), "wooden_lumber_axe"),
                //Paxels
                new Paxel(ToolMaterials.AMAZONITE_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMAZONITE, "amazonite_paxel"),
                new Paxel(ToolMaterials.AMETHYST_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMETHYST, "amethyst_paxel"),
                new Paxel(ToolMaterials.DIAMOND_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.DIAMOND, "diamond_paxel"),
                new Paxel(ToolMaterials.EMERALD_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.DIAMOND, "emerald_paxel"),
                new Paxel(ToolMaterials.GOLD_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.GOLD, "gold_paxel"),
                new Paxel(ToolMaterials.IRON_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.IRON, "iron_paxel"),
                new Paxel(ToolMaterials.PERIDOT_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.PERIDOT, "peridot_paxel"),
                new Paxel(ToolMaterials.RUBY_PAXEL, 4, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.RUBY, "ruby_paxel"),
                new Paxel(ToolMaterials.SAPPHIRE_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.SAPPHIRE, "sapphire_paxel"),
                new Paxel(ToolMaterials.STONE_PAXEL, 2, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.STONE, "stone_paxel"),
                new Paxel(ToolMaterials.TOPAZ_PAXEL, 6, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "topaz_paxel"),
                new Paxel(ToolMaterials.WITHERED_PAXEL, 7, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "withered_paxel"),
                new Paxel(ToolMaterials.WOODEN_PAXEL, 3, -3.0F,  new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.WOOD, "wooden_paxel"),
                //Pickaxes
                new CustomPickaxe(ToolMaterials.AMAZONITE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMAZONITE, "amazonite_pickaxe"),
                new CustomPickaxe(ToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMETHYST, "amethyst_pickaxe"),
                new CustomPickaxe(ToolMaterials.EMERALD, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.DIAMOND, "emerald_pickaxe"),
                new CustomPickaxe(ToolMaterials.PERIDOT, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.PERIDOT, "peridot_pickaxe"),
                new CustomPickaxe(ToolMaterials.RUBY, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.RUBY, "ruby_pickaxe"),
                new CustomPickaxe(ToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.SAPPHIRE, "sapphire_pickaxe"),
                new CustomPickaxe(ToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "topaz_pickaxe"),
                new CustomPickaxe(ToolMaterials.VMPICK, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.STONE, "vmpick"),
                new CustomPickaxe(ToolMaterials.WITHERED, 1, -2.8F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "withered_pickaxe"),
                //Shovels
                new CustomShovel(ToolMaterials.AMAZONITE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMAZONITE, "amazonite_shovel"),
                new CustomShovel(ToolMaterials.AMETHYST, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.AMETHYST, "amethyst_shovel"),
                new CustomShovel(ToolMaterials.EMERALD, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.DIAMOND, "emerald_shovel"),
                new CustomShovel(ToolMaterials.PERIDOT, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.PERIDOT, "peridot_shovel"),
                new CustomShovel(ToolMaterials.RUBY, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.RUBY, "ruby_shovel"),
                new CustomShovel(ToolMaterials.SAPPHIRE, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.SAPPHIRE, "sapphire_shovel"),
                new CustomShovel(ToolMaterials.TOPAZ, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "topaz_shovel"),
                new CustomShovel(ToolMaterials.WITHERED, 1, -2.6F, new Item.Properties().group(Reference.tabSlurpiesDongles), HarvestLevelHelper.TOPAZ, "withered_shovel"),
                //Swords
                new CustomSword(ToolMaterials.AMAZONITE_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite_sword"),
                new CustomSword(ToolMaterials.AMETHYST_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst_sword"),
                new CustomSword(ToolMaterials.EMERALD_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "emerald_sword"),
                new CustomSword(ToolMaterials.PERIDOT_SWORD, 2, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot_sword"),
                new CustomSword(ToolMaterials.RUBY_SWORD, 4, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby_sword"),
                new CustomSword(ToolMaterials.SAPPHIRE_SWORD, 3, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire_sword"),
                new CustomSword(ToolMaterials.TOPAZ_SWORD, 6, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_sword"),
                new WitheredSword(ToolMaterials.WITHERED_SWORD, 7, -2.4F, new Item.Properties().group(Reference.tabSlurpiesDongles), "withered_sword")
        );
    }
}
