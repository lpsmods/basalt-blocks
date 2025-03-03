package dev.lpsmods.basaltblocks.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.basaltblocks.block.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

@RegistryContainer
public class ModBlocks {
    public static final RegistryEntry<Block> BASALT_SLAB;
    public static final RegistryEntry<Block> BASALT_STAIRS;
    public static final RegistryEntry<Block> BASALT_WALL;
    public static final RegistryEntry<Block> BASALT_BUTTON;
    public static final RegistryEntry<Block> BASALT_PRESSURE_PLATE;
    public static final RegistryEntry<Block> SMOOTH_BASALT_SLAB;
    public static final RegistryEntry<Block> SMOOTH_BASALT_STAIRS;
    public static final RegistryEntry<Block> SMOOTH_BASALT_WALL;
    public static final RegistryEntry<Block> SMOOTH_BASALT_BUTTON;
    public static final RegistryEntry<Block> SMOOTH_BASALT_PRESSURE_PLATE;
    public static final RegistryEntry<Block> CHISELED_POLISHED_BASALT;
    public static final RegistryEntry<Block> POLISHED_BASALT_SLAB;
    public static final RegistryEntry<Block> POLISHED_BASALT_STAIRS;
    public static final RegistryEntry<Block> POLISHED_BASALT_WALL;
    public static final RegistryEntry<Block> POLISHED_BASALT_BUTTON;
    public static final RegistryEntry<Block> POLISHED_BASALT_PRESSURE_PLATE;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_DOOR;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_TRAPDOOR;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICKS;
    public static final RegistryEntry<Block> CRACKED_POLISHED_BASALT_BRICKS;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_PILLAR;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_SLAB;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_STAIRS;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_WALL;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_BUTTON;
    public static final RegistryEntry<Block> POLISHED_BASALT_BRICK_PRESSURE_PLATE;
    public static final RegistryEntry<Block> COBBLED_BASALT;
    public static final RegistryEntry<Block> COBBLED_BASALT_SLAB;
    public static final RegistryEntry<Block> COBBLED_BASALT_STAIRS;
    public static final RegistryEntry<Block> COBBLED_BASALT_WALL;
    public static final RegistryEntry<Block> COBBLED_BASALT_BUTTON;
    public static final RegistryEntry<Block> COBBLED_BASALT_PRESSURE_PLATE;

    private static RegistryEntry<Block> block(String name, Supplier<Block> supplier) {
        return RegistryEntry.blockWithItem(ModUtils.makeId(name), supplier);
    }

    private static RegistryEntry<Block> stair(String name, Block baseBlock) {
        return block(name, () -> new ModStairBlock(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    private static RegistryEntry<Block> button(String name) {
        return block(name, () -> new ModButtonBlock(ModSetType.BASALT, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    }

    private static RegistryEntry<Block> pressurePlate(String name, Block baseBlock) {
        return block(name, () -> new ModPressurePlateBlock(ModSetType.BASALT,  BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    private static RegistryEntry<Block> slab(String name, Block baseBlock) {
        return block(name, () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    private static RegistryEntry<Block> wall(String name, Block baseBlock) {
        return block(name, () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    private static RegistryEntry<Block> door(String name, Block baseBlock) {
        return block(name, () -> new ModDoorBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    private static RegistryEntry<Block> trapdoor(String name, Block baseBlock) {
        return block(name, () -> new ModTrapDoorBlock(ModSetType.BASALT, BlockBehaviour.Properties.ofFullCopy(baseBlock)));
    }

    static {
        BASALT_SLAB = slab("basalt_slab", Blocks.BASALT);
        BASALT_STAIRS = stair("basalt_stairs", Blocks.BASALT);
        BASALT_WALL = wall("basalt_wall", Blocks.BASALT);
        BASALT_BUTTON = button("basalt_button");
        BASALT_PRESSURE_PLATE = pressurePlate("basalt_pressure_plate", Blocks.BASALT);
        SMOOTH_BASALT_SLAB = slab("smooth_basalt_slab", Blocks.SMOOTH_BASALT);
        SMOOTH_BASALT_STAIRS = stair("smooth_basalt_stairs", Blocks.SMOOTH_BASALT);
        SMOOTH_BASALT_WALL = wall("smooth_basalt_wall", Blocks.SMOOTH_BASALT);
        SMOOTH_BASALT_BUTTON = button("smooth_basalt_button");
        SMOOTH_BASALT_PRESSURE_PLATE = pressurePlate("smooth_basalt_pressure_plate", Blocks.BASALT);
        CHISELED_POLISHED_BASALT = block("chiseled_polished_basalt", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_SLAB = slab("polished_basalt_slab", Blocks.BASALT);
        POLISHED_BASALT_STAIRS = stair("polished_basalt_stairs", Blocks.POLISHED_BASALT);
        POLISHED_BASALT_WALL = wall("polished_basalt_wall", Blocks.BASALT);
        POLISHED_BASALT_BUTTON = button("polished_basalt_button");
        POLISHED_BASALT_PRESSURE_PLATE = pressurePlate("polished_basalt_pressure_plate", Blocks.BASALT);
        POLISHED_BASALT_BRICK_DOOR = door("polished_basalt_brick_door", Blocks.BASALT);
        POLISHED_BASALT_BRICK_TRAPDOOR = trapdoor("polished_basalt_brick_trapdoor", Blocks.BASALT);
        POLISHED_BASALT_BRICKS = block("polished_basalt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        CRACKED_POLISHED_BASALT_BRICKS = block("cracked_polished_basalt_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_PILLAR = block("polished_basalt_brick_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        POLISHED_BASALT_BRICK_SLAB = slab("polished_basalt_brick_slab", Blocks.BASALT);
        POLISHED_BASALT_BRICK_STAIRS = stair("polished_basalt_brick_stairs", Blocks.BASALT);
        POLISHED_BASALT_BRICK_WALL = wall("polished_basalt_brick_wall", Blocks.BASALT);
        POLISHED_BASALT_BRICK_BUTTON = button("polished_basalt_brick_button");
        POLISHED_BASALT_BRICK_PRESSURE_PLATE = pressurePlate("polished_basalt_brick_pressure_plate", Blocks.BASALT);
        COBBLED_BASALT = block("cobbled_basalt",() ->  new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));
        COBBLED_BASALT_SLAB = slab("cobbled_basalt_slab", Blocks.BASALT);
        COBBLED_BASALT_STAIRS = stair("cobbled_basalt_stairs", Blocks.BASALT);
        COBBLED_BASALT_WALL = wall("cobbled_basalt_wall", Blocks.BASALT);
        COBBLED_BASALT_BUTTON = button("cobbled_basalt_button");
        COBBLED_BASALT_PRESSURE_PLATE = pressurePlate("cobbled_basalt_pressure_plate", Blocks.BASALT);
    }
}
