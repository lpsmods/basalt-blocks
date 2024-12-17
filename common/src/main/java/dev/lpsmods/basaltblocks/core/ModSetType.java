package dev.lpsmods.basaltblocks.core;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

/**
 * Author: legopitstop
 */
public class ModSetType {
    public static final BlockSetType BASALT = new BlockSetType("basalt", true, true, true,BlockSetType.PressurePlateSensitivity.EVERYTHING, SoundType.BASALT, ModSoundEvents.BLOCK_BASALT_DOOR_CLOSE, ModSoundEvents.BLOCK_BASALT_DOOR_OPEN, ModSoundEvents.BLOCK_BASALT_TRAPDOOR_CLOSE, ModSoundEvents.BLOCK_BASALT_TRAPDOOR_OPEN, ModSoundEvents.BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF, ModSoundEvents.BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON, ModSoundEvents.BLOCK_BASALT_BUTTON_CLICK_OFF, ModSoundEvents.BLOCK_BASALT_BUTTON_CLICK_ON);
}
