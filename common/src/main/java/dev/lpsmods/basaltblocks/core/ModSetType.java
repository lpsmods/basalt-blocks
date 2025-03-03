package dev.lpsmods.basaltblocks.core;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

/**
 * Author: legopitstop
 */
public class ModSetType {
    public static final BlockSetType BASALT = new BlockSetType("basalt", true, true, true,BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.BASALT, ModSounds.BLOCK_BASALT_DOOR_CLOSE.get(), ModSounds.BLOCK_BASALT_DOOR_OPEN.get(), ModSounds.BLOCK_BASALT_TRAPDOOR_CLOSE.get(), ModSounds.BLOCK_BASALT_TRAPDOOR_OPEN.get(), ModSounds.BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF.get(), ModSounds.BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON.get(), ModSounds.BLOCK_BASALT_BUTTON_CLICK_OFF.get(), ModSounds.BLOCK_BASALT_BUTTON_CLICK_ON.get());
}
