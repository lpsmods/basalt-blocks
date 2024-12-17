package dev.lpsmods.basaltblocks;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BasaltBlocks {
    public BasaltBlocks(IEventBus eventBus) {
        Bootstrap.init();
    }
}