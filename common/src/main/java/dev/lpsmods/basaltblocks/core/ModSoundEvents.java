package dev.lpsmods.basaltblocks.core;

import dev.lpsmods.basaltblocks.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

/**
 * Author: legopitstop
 */
public class ModSoundEvents {
    public static final SoundEvent BLOCK_BASALT_DOOR_CLOSE = register("block.basalt_door.close");
    public static final SoundEvent BLOCK_BASALT_DOOR_OPEN = register("block.basalt_door.open");
    public static final SoundEvent BLOCK_BASALT_TRAPDOOR_CLOSE = register("block.basalt_trapdoor.close");
    public static final SoundEvent BLOCK_BASALT_TRAPDOOR_OPEN = register("block.basalt_trapdoor.open");
    public static final SoundEvent BLOCK_BASALT_BUTTON_CLICK_OFF = register("block.basalt_button.click_off");
    public static final SoundEvent BLOCK_BASALT_BUTTON_CLICK_ON = register("block.basalt_button.click_on");
    public static final SoundEvent BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF = register("block.basalt_pressure_plate.click_off");
    public static final SoundEvent BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON = register("block.basalt_pressure_plate.click_on");

    private static SoundEvent register(String key) {
        ResourceLocation res = ResourceLocation.tryBuild(Constants.MOD_ID, key);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, res, SoundEvent.createVariableRangeEvent(res));
    }
}
