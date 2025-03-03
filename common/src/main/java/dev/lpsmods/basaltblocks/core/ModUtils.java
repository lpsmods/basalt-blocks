package dev.lpsmods.basaltblocks.core;

import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.resources.ResourceLocation;

public class ModUtils {
    public static ResourceLocation makeId(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }
}
