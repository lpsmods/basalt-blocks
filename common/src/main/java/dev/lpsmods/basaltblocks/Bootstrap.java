package dev.lpsmods.basaltblocks;

import dev.lpsmods.basaltblocks.core.ModBlocks;
import dev.lpsmods.basaltblocks.core.ModCreativeModeTabs;
import dev.lpsmods.basaltblocks.core.ModItems;

/*
* Author: legopitstop
* */
public class Bootstrap {
    public static void init() {
        ModBlocks.init();
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}