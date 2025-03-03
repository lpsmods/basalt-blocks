package dev.lpsmods.basaltblocks;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Constants.MOD_ID)
public class BasaltBlocks {
    public BasaltBlocks(IEventBus eventBus) {
        eventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(Bootstrap::init);
    }
}
