package dev.lpsmods.basaltblocks.core;


import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

@RegistryContainer
public class ModCreativeTabs {
    public static final RegistryEntry<CreativeModeTab> MAIN;

    static {
        MAIN = RegistryEntry.creativeModeTab(ModUtils.makeId("basaltblocks"), builder -> {
            builder.icon(() -> {return new ItemStack(Items.BASALT);});
            builder.title(Component.translatable("itemGroup."+Constants.MOD_ID));
            builder.displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
                out.accept(Items.BASALT);
                out.accept(ModBlocks.BASALT_STAIRS.get());
                out.accept(ModBlocks.BASALT_SLAB.get());
                out.accept(ModBlocks.BASALT_WALL.get());
                out.accept(ModBlocks.BASALT_PRESSURE_PLATE.get());
                out.accept(ModBlocks.BASALT_BUTTON.get());

                out.accept(Items.SMOOTH_BASALT);
                out.accept(ModBlocks.SMOOTH_BASALT_STAIRS.get());
                out.accept(ModBlocks.SMOOTH_BASALT_SLAB.get());
                out.accept(ModBlocks.SMOOTH_BASALT_WALL.get());
                out.accept(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get());
                out.accept(ModBlocks.SMOOTH_BASALT_BUTTON.get());

                out.accept(ModBlocks.CHISELED_POLISHED_BASALT.get());
                out.accept(Items.POLISHED_BASALT);
                out.accept(ModBlocks.POLISHED_BASALT_STAIRS.get());
                out.accept(ModBlocks.POLISHED_BASALT_SLAB.get());
                out.accept(ModBlocks.POLISHED_BASALT_WALL.get());
                out.accept(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE.get());
                out.accept(ModBlocks.POLISHED_BASALT_BUTTON.get());

                out.accept(ModBlocks.POLISHED_BASALT_BRICK_PILLAR.get());
                out.accept(ModBlocks.CRACKED_POLISHED_BASALT_BRICKS.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICKS.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_STAIRS.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_SLAB.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_WALL.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_DOOR.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_TRAPDOOR.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_PRESSURE_PLATE.get());
                out.accept(ModBlocks.POLISHED_BASALT_BRICK_BUTTON.get());

                out.accept(ModBlocks.COBBLED_BASALT.get());
                out.accept(ModBlocks.COBBLED_BASALT_STAIRS.get());
                out.accept(ModBlocks.COBBLED_BASALT_SLAB.get());
                out.accept(ModBlocks.COBBLED_BASALT_WALL.get());
                out.accept(ModBlocks.COBBLED_BASALT_PRESSURE_PLATE.get());
                out.accept(ModBlocks.COBBLED_BASALT_BUTTON.get());
            }).build();
        });
    }
}
