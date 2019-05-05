package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.blocks.*;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks
    public static Block BLUE_BRICKS = new CustomBricks("blue_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block CYAN__BRICKS = new CustomBricks("cyan_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block GREEN_BRICKS = new CustomBricks("green_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block ORANGE_BRICKS = new CustomBricks("orange_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block PURPLE_BRICKS = new CustomBricks("purple_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block RAINBOW_BRICKS = new CustomBricks("rainbow_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block YELLOW_BRICKS = new CustomBricks("yellow_bricks", Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 10.0F));
    public static Block BLUE_GLOWSTONE = new CustomGlowstone("blue_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block GRAY_GLOWSTONE = new CustomGlowstone("gray_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block GREEN_GLOWSTONE = new CustomGlowstone("green_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block ORANGE_GLOWSTONE = new CustomGlowstone("orange_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block PINK_GLOWSTONE = new CustomGlowstone("pink_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block PURPLE_GLOWSTONE = new CustomGlowstone("purple_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block RED_GLOWSTONE = new CustomGlowstone("red_glowstone", Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F, 2.0F).lightValue(15));
    public static Block AMAZONITE_BLOCK = new BlockBase("amazonite_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.AMAZONITE);
    public static Block AMETHYST_BLOCK = new BlockBase("amethyst_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.AMETHYST);
    public static Block HARDENED_TOPAZ_BLOCK = new BlockBase("hardened_topaz_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 25.0F), HarvestLevelHelper.TOPAZ);
    public static Block PERIDOT_BLOCK = new BlockBase("peridot_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.PERIDOT);
    public static Block REINFORCED_OBSIDIAN = new BlockBase("reinforced_obsidian",Block.Properties.create(Material.ROCK).hardnessAndResistance(100.0F, 4000.0F), HarvestLevelHelper.TOPAZ);
    public static Block RUBY_BLOCK = new BlockBase("ruby_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.RUBY);
    public static Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.SAPPHIRE);
    public static Block TOPAZ = new BlockBase("topaz_block",Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 5.0F), HarvestLevelHelper.TOPAZ);


    //Bushes & Crops
    public static CabbageCrop CABBAGE_CROP = new CabbageCrop("cabbage_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));
    public static CornCrop CORN_CROP = new CornCrop("corn_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));
    public static LemonCrop LEMON_CROP = new LemonCrop("lemon_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));
    public static OrangeCrop ORANGE_CROP = new OrangeCrop("orange_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));
    public static StrawberryCrop STRAWBERRY_CROP = new StrawberryCrop("strawberry_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));
    public static TomatoCrop TOMATO_CROP = new TomatoCrop("tomato_crop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().needsRandomTick().sound(SoundType.PLANT));

    //Ores
    public static Block AMAZONITE_ORE = new AmazoniteOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "amazonite_ore", HarvestLevelHelper.AMAZONITE);
    public static Block AMETHYST_ORE = new AmethystOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "amethyst_ore", HarvestLevelHelper.AMETHYST);
    public static Block PERIDOT_ORE = new PeridotOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "peridot_ore", HarvestLevelHelper.PERIDOT);
    public static Block RUBY_ORE = new RubyOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "ruby_ore", HarvestLevelHelper.RUBY);
    public static Block SAPPHIRE_ORE = new SapphireOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "sapphire_ore", HarvestLevelHelper.SAPPHIRE);
    public static Block TOPAZ_ORE = new TopazOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "topaz_ore", HarvestLevelHelper.TOPAZ);
    //Nether Ores
    public static Block NETHER_COAL_ORE = new NetherCoalOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_coal_ore", HarvestLevelHelper.STONE);
    public static Block NETHER_DIAMOND_ORE = new NetherDiamondOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_diamond_ore", HarvestLevelHelper.IRON);
    public static Block NETHER_EMERALD_ORE = new NetherEmeraldOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_emerald_ore", HarvestLevelHelper.IRON);
    public static Block NETHER_GOLD_ORE = new NetherGoldOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_gold_ore", HarvestLevelHelper.IRON);
    public static Block NETHER_IRON_ORE = new NetherIronOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_iron_ore", HarvestLevelHelper.STONE);
    public static Block NETHER_LAPIS_ORE = new NetherLapisOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_lapis_ore", HarvestLevelHelper.STONE);
    public static Block NETHER_REDSTONE_ORE = new NetherRedstoneOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F), "nether_redstone_ore", HarvestLevelHelper.IRON);

}
