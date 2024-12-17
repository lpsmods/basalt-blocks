package dev.lpsmods.basaltblocks.core;


import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/**
 * Author: legopitstop
 */
public class ModCreativeModeTabs {
    public static final CreativeModeTab MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }

    public static void init() {}

    static {
        MAIN = registerTab("basaltblocks", CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("itemGroup."+Constants.MOD_ID)).icon(() -> {
            return new ItemStack(Items.BASALT);
        }).displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
            out.accept(Items.BASALT);
            out.accept(ModItems.BASALT_SLAB);
            out.accept(ModItems.BASALT_STAIRS);
            out.accept(ModItems.BASALT_WALL);
            out.accept(ModItems.BASALT_BUTTON);
            out.accept(ModItems.BASALT_PRESSURE_PLATE);
            out.accept(ModItems.SMOOTH_BASALT_SLAB);
            out.accept(ModItems.SMOOTH_BASALT_STAIRS);
            out.accept(ModItems.SMOOTH_BASALT_WALL);
            out.accept(ModItems.SMOOTH_BASALT_BUTTON);
            out.accept(ModItems.SMOOTH_BASALT_PRESSURE_PLATE);
            out.accept(ModItems.CHISELED_POLISHED_BASALT);
            out.accept(ModItems.POLISHED_BASALT_SLAB);
            out.accept(ModItems.POLISHED_BASALT_STAIRS);
            out.accept(ModItems.POLISHED_BASALT_WALL);
            out.accept(ModItems.POLISHED_BASALT_BUTTON);
            out.accept(ModItems.POLISHED_BASALT_PRESSURE_PLATE);
            out.accept(ModItems.POLISHED_BASALT_BRICK_DOOR);
            out.accept(ModItems.POLISHED_BASALT_BRICK_TRAPDOOR);
            out.accept(ModItems.POLISHED_BASALT_BRICKS);
            out.accept(ModItems.CRACKED_POLISHED_BASALT_BRICKS);
            out.accept(ModItems.POLISHED_BASALT_BRICK_PILLAR);
            out.accept(ModItems.POLISHED_BASALT_BRICK_SLAB);
            out.accept(ModItems.POLISHED_BASALT_BRICK_STAIRS);
            out.accept(ModItems.POLISHED_BASALT_BRICK_WALL);
            out.accept(ModItems.POLISHED_BASALT_BRICK_BUTTON);
            out.accept(ModItems.POLISHED_BASALT_BRICK_PRESSURE_PLATE);
            out.accept(ModItems.COBBLED_BASALT);
            out.accept(ModItems.COBBLED_BASALT_SLAB);
            out.accept(ModItems.COBBLED_BASALT_STAIRS);
            out.accept(ModItems.COBBLED_BASALT_WALL);
            out.accept(ModItems.COBBLED_BASALT_BUTTON);
            out.accept(ModItems.COBBLED_BASALT_PRESSURE_PLATE);
        }).build());
    }
}
