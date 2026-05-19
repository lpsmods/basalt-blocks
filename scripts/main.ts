import { StartupEvent, system } from "@minecraft/server";
import { registerBlockComponents, registerCommands, registerItemComponents } from "./registry.js";
import { AddonUtils } from "@lpsmods/mc-utils";
import { PROJECT_ID } from "./constants.js";

AddonUtils.addonId = PROJECT_ID;

function startup(event: StartupEvent): void {
  registerBlockComponents(event.blockComponentRegistry);
  registerItemComponents(event.itemComponentRegistry);
  registerCommands(event.customCommandRegistry);
}

system.beforeEvents.startup.subscribe(startup);
