package dev.lpsmods.basaltblocks.core;

import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;

/**
 * Author: legopitstop
 */
public class ModBlocks {
    public static final Block BASALT_SLAB;
    public static final Block BASALT_STAIRS;
    public static final Block BASALT_WALL;
    public static final Block BASALT_BUTTON;
    public static final Block BASALT_PRESSURE_PLATE;
    public static final Block SMOOTH_BASALT_SLAB;
    public static final Block SMOOTH_BASALT_STAIRS;
    public static final Block SMOOTH_BASALT_WALL;
    public static final Block SMOOTH_BASALT_BUTTON;
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE;
    public static final Block CHISELED_POLISHED_BASALT;
    public static final Block POLISHED_BASALT_SLAB;
    public static final Block POLISHED_BASALT_STAIRS;
    public static final Block POLISHED_BASALT_WALL;
    public static final Block POLISHED_BASALT_BUTTON;
    public static final Block POLISHED_BASALT_PRESSURE_PLATE;
    public static final Block POLISHED_BASALT_BRICK_DOOR;
    public static final Block POLISHED_BASALT_BRICK_TRAPDOOR;
    public static final Block POLISHED_BASALT_BRICKS;
    public static final Block CRACKED_POLISHED_BASALT_BRICKS;
    public static final Block POLISHED_BASALT_BRICK_PILLAR;
    public static final Block POLISHED_BASALT_BRICK_SLAB;
    public static final Block POLISHED_BASALT_BRICK_STAIRS;
    public static final Block POLISHED_BASALT_BRICK_WALL;
    public static final Block POLISHED_BASALT_BRICK_BUTTON;
    public static final Block POLISHED_BASALT_BRICK_PRESSURE_PLATE;
    public static final Block COBBLED_BASALT;
    public static final Block COBBLED_BASALT_SLAB;
    public static final Block COBBLED_BASALT_STAIRS;
    public static final Block COBBLED_BASALT_WALL;
    public static final Block COBBLED_BASALT_BUTTON;
    public static final Block COBBLED_BASALT_PRESSURE_PLATE;

    private static Block register(String key, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.tryBuild(Constants.MOD_ID, key), block);
    }

    private static Block stair(Block pBaseBlock) {
        return new StairBlock(pBaseBlock.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(pBaseBlock));
    }

    private static Block basaltButton() {
        return new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }

    public static void init() {}

    static {
        BASALT_SLAB = register("basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        BASALT_STAIRS = register("basalt_stairs", stair(Blocks.BASALT));
        BASALT_WALL = register("basalt_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        BASALT_BUTTON = register("basalt_button", basaltButton());
        BASALT_PRESSURE_PLATE = register("basalt_pressure_plate", new PressurePlateBlock(ModSetType.BASALT,  BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", stair(Blocks.SMOOTH_BASALT));
        SMOOTH_BASALT_WALL = register("smooth_basalt_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        SMOOTH_BASALT_BUTTON = register("smooth_basalt_button", basaltButton());
        SMOOTH_BASALT_PRESSURE_PLATE = register("smooth_basalt_pressure_plate", new PressurePlateBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        CHISELED_POLISHED_BASALT = register("chiseled_polished_basalt", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_SLAB = register("polished_basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", stair(Blocks.POLISHED_BASALT));
        POLISHED_BASALT_WALL = register("polished_basalt_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BUTTON = register("polished_basalt_button", basaltButton());
        POLISHED_BASALT_PRESSURE_PLATE = register("polished_basalt_pressure_plate", new PressurePlateBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_DOOR = register("polished_basalt_brick_door", new DoorBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_TRAPDOOR = register("polished_basalt_brick_trapdoor", new TrapDoorBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICKS = register("polished_basalt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        CRACKED_POLISHED_BASALT_BRICKS = register("cracked_polished_basalt_bricks", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_PILLAR = register("polished_basalt_brick_pillar", new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_SLAB = register("polished_basalt_brick_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_STAIRS = register("polished_basalt_brick_stairs", stair(POLISHED_BASALT_BRICKS));
        POLISHED_BASALT_BRICK_WALL = register("polished_basalt_brick_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_BUTTON = register("polished_basalt_brick_button", basaltButton());
        POLISHED_BASALT_BRICK_PRESSURE_PLATE = register("polished_basalt_brick_pressure_plate", new PressurePlateBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        COBBLED_BASALT = register("cobbled_basalt", new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        COBBLED_BASALT_SLAB = register("cobbled_basalt_slab", new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        COBBLED_BASALT_STAIRS = register("cobbled_basalt_stairs", stair(COBBLED_BASALT));
        COBBLED_BASALT_WALL = register("cobbled_basalt_wall", new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        COBBLED_BASALT_BUTTON = register("cobbled_basalt_button", basaltButton());
        COBBLED_BASALT_PRESSURE_PLATE = register("cobbled_basalt_pressure_plate", new PressurePlateBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
    }
}
