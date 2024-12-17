package dev.lpsmods.basaltblocks.core;

import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

/**
 * Author: legopitstop
 */
public class ModItems {
    public static final Item BASALT_SLAB;
    public static final Item BASALT_STAIRS;
    public static final Item BASALT_WALL;
    public static final Item BASALT_BUTTON;
    public static final Item BASALT_PRESSURE_PLATE;
    public static final Item SMOOTH_BASALT_SLAB;
    public static final Item SMOOTH_BASALT_STAIRS;
    public static final Item SMOOTH_BASALT_WALL;
    public static final Item SMOOTH_BASALT_BUTTON;
    public static final Item SMOOTH_BASALT_PRESSURE_PLATE;
    public static final Item CHISELED_POLISHED_BASALT;
    public static final Item POLISHED_BASALT_SLAB;
    public static final Item POLISHED_BASALT_STAIRS;
    public static final Item POLISHED_BASALT_WALL;
    public static final Item POLISHED_BASALT_BUTTON;
    public static final Item POLISHED_BASALT_PRESSURE_PLATE;
    public static final Item POLISHED_BASALT_BRICK_DOOR;
    public static final Item POLISHED_BASALT_BRICK_TRAPDOOR;
    public static final Item POLISHED_BASALT_BRICKS;
    public static final Item CRACKED_POLISHED_BASALT_BRICKS;
    public static final Item POLISHED_BASALT_BRICK_PILLAR;
    public static final Item POLISHED_BASALT_BRICK_SLAB;
    public static final Item POLISHED_BASALT_BRICK_STAIRS;
    public static final Item POLISHED_BASALT_BRICK_WALL;
    public static final Item POLISHED_BASALT_BRICK_BUTTON;
    public static final Item POLISHED_BASALT_BRICK_PRESSURE_PLATE;
    public static final Item COBBLED_BASALT;
    public static final Item COBBLED_BASALT_SLAB;
    public static final Item COBBLED_BASALT_STAIRS;
    public static final Item COBBLED_BASALT_WALL;
    public static final Item COBBLED_BASALT_BUTTON;
    public static final Item COBBLED_BASALT_PRESSURE_PLATE;

    private static Item register(String key, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(Constants.MOD_ID, key), item);
    }

    public static void init() {}

    static {
        BASALT_SLAB = register("basalt_slab", new BlockItem(ModBlocks.BASALT_SLAB, new Item.Properties()));
        BASALT_STAIRS = register("basalt_stairs", new BlockItem(ModBlocks.BASALT_STAIRS, new Item.Properties()));
        BASALT_WALL = register("basalt_wall", new BlockItem(ModBlocks.BASALT_WALL, new Item.Properties()));
        BASALT_BUTTON = register("basalt_button", new BlockItem(ModBlocks.BASALT_BUTTON, new Item.Properties()));
        BASALT_PRESSURE_PLATE = register("basalt_pressure_plate", new BlockItem(ModBlocks.BASALT_PRESSURE_PLATE, new Item.Properties()));
        SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", new BlockItem(ModBlocks.SMOOTH_BASALT_SLAB, new Item.Properties()));
        SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", new BlockItem(ModBlocks.SMOOTH_BASALT_STAIRS, new Item.Properties()));
        SMOOTH_BASALT_WALL = register("smooth_basalt_wall", new BlockItem(ModBlocks.SMOOTH_BASALT_WALL, new Item.Properties()));
        SMOOTH_BASALT_BUTTON = register("smooth_basalt_button", new BlockItem(ModBlocks.SMOOTH_BASALT_BUTTON, new Item.Properties()));
        SMOOTH_BASALT_PRESSURE_PLATE = register("smooth_basalt_pressure_plate", new BlockItem(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE, new Item.Properties()));
        CHISELED_POLISHED_BASALT = register("chiseled_polished_basalt", new BlockItem(ModBlocks.CHISELED_POLISHED_BASALT, new Item.Properties()));
        POLISHED_BASALT_SLAB = register("polished_basalt_slab", new BlockItem(ModBlocks.POLISHED_BASALT_SLAB, new Item.Properties()));
        POLISHED_BASALT_STAIRS = register( "polished_basalt_stairs", new BlockItem(ModBlocks.POLISHED_BASALT_STAIRS, new Item.Properties()));
        POLISHED_BASALT_WALL = register("polished_basalt_wall", new BlockItem(ModBlocks.POLISHED_BASALT_WALL, new Item.Properties()));
        POLISHED_BASALT_BUTTON = register("polished_basalt_button", new BlockItem(ModBlocks.POLISHED_BASALT_BUTTON, new Item.Properties()));
        POLISHED_BASALT_PRESSURE_PLATE = register("polished_basalt_pressure_plate", new BlockItem(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE, new Item.Properties()));
        POLISHED_BASALT_BRICK_DOOR = register("polished_basalt_brick_door", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_DOOR, new Item.Properties()));
        POLISHED_BASALT_BRICK_TRAPDOOR = register("polished_basalt_brick_trapdoor", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_TRAPDOOR, new Item.Properties()));
        POLISHED_BASALT_BRICKS = register("polished_basalt_brick_bricks", new BlockItem(ModBlocks.POLISHED_BASALT_BRICKS, new Item.Properties()));
        CRACKED_POLISHED_BASALT_BRICKS = register("cracked_polished_basalt_bricks", new BlockItem(ModBlocks.CRACKED_POLISHED_BASALT_BRICKS, new Item.Properties()));
        POLISHED_BASALT_BRICK_PILLAR = register("polished_basalt_brick_pillar", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_PILLAR, new Item.Properties()));
        POLISHED_BASALT_BRICK_SLAB = register("polished_basalt_brick_slab", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_SLAB, new Item.Properties()));
        POLISHED_BASALT_BRICK_STAIRS = register("polished_basalt_brick_stairs", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_STAIRS, new Item.Properties()));
        POLISHED_BASALT_BRICK_WALL = register("polished_basalt_brick_wall", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_WALL, new Item.Properties()));
        POLISHED_BASALT_BRICK_BUTTON = register("polished_basalt_brick_button", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_BUTTON, new Item.Properties()));
        POLISHED_BASALT_BRICK_PRESSURE_PLATE = register("polished_basalt_brick_pressure_plate", new BlockItem(ModBlocks.POLISHED_BASALT_BRICK_PRESSURE_PLATE, new Item.Properties()));
        COBBLED_BASALT = register("cobbled_basalt", new BlockItem(ModBlocks.COBBLED_BASALT, new Item.Properties()));
        COBBLED_BASALT_SLAB = register("cobbled_basalt_slab", new BlockItem(ModBlocks.COBBLED_BASALT_SLAB, new Item.Properties()));
        COBBLED_BASALT_STAIRS = register("cobbled_basalt_stairs", new BlockItem(ModBlocks.COBBLED_BASALT_STAIRS, new Item.Properties()));
        COBBLED_BASALT_WALL = register("cobbled_basalt_wall", new BlockItem(ModBlocks.COBBLED_BASALT_WALL, new Item.Properties()));
        COBBLED_BASALT_BUTTON = register("cobbled_basalt_button", new BlockItem(ModBlocks.COBBLED_BASALT_BUTTON, new Item.Properties()));
        COBBLED_BASALT_PRESSURE_PLATE = register("cobbled_basalt_pressure_plate", new BlockItem(ModBlocks.COBBLED_BASALT_PRESSURE_PLATE, new Item.Properties()));
    }
}
