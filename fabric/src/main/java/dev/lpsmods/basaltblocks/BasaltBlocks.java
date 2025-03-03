package dev.lpsmods.basaltblocks;

import com.mrcrayfish.framework.FrameworkSetup;
import net.fabricmc.api.ModInitializer;

public class BasaltBlocks implements ModInitializer {
    
    @Override
    public void onInitialize() {
        FrameworkSetup.run();
        Bootstrap.init();
    }
}
