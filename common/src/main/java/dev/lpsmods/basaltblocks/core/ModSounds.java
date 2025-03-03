package dev.lpsmods.basaltblocks.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import net.minecraft.sounds.SoundEvent;

@RegistryContainer
public class ModSounds {
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_DOOR_CLOSE;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_DOOR_OPEN;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_TRAPDOOR_CLOSE;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_TRAPDOOR_OPEN;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_BUTTON_CLICK_OFF;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_BUTTON_CLICK_ON;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF;
    public static final RegistryEntry<SoundEvent> BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON;

    private static RegistryEntry<SoundEvent> sound(String name) {
        return RegistryEntry.soundEvent(ModUtils.makeId(name), id -> () -> SoundEvent.createVariableRangeEvent(id));
    }

    static {
        BLOCK_BASALT_DOOR_CLOSE = sound("block.basalt_door.close");
        BLOCK_BASALT_DOOR_OPEN = sound("block.basalt_door.open");
        BLOCK_BASALT_TRAPDOOR_CLOSE = sound("block.basalt_trapdoor.close");
        BLOCK_BASALT_TRAPDOOR_OPEN = sound("block.basalt_trapdoor.open");
        BLOCK_BASALT_BUTTON_CLICK_OFF = sound("block.basalt_button.click_off");
        BLOCK_BASALT_BUTTON_CLICK_ON = sound("block.basalt_button.click_on");
        BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF = sound("block.basalt_pressure_plate.click_off");
        BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON = sound("block.basalt_pressure_plate.click_on");
    }
}
