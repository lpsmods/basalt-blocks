import { AddonUtils, GuideBookComponent } from "@lpsmods/mc-utils";
import { BlockComponentRegistry, CustomCommandRegistry, ItemComponentRegistry } from "@minecraft/server";
import { pages } from "./guide/main";

export function registerBlockComponents(registry: BlockComponentRegistry): void {}

export function registerItemComponents(reg: ItemComponentRegistry): void {
  reg.registerCustomComponent(AddonUtils.makeId("guide_book"), new GuideBookComponent(pages));
}

export function registerCommands(reg: CustomCommandRegistry): void {}
