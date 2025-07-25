package net.wolfertamer.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wolfertamer.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item FLAMINGO_FEATHER = registerItem("flamingo_feather", new Item(new Item.Settings()));
    public static final Item FLAMINGO_FABRIC = registerItem("flamingo_fabric", new Item(new Item.Settings()));
    public static final Item ZIRCON = registerItem("zircon", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FLAMINGO_FEATHER);
            entries.add(FLAMINGO_FABRIC);
            entries.add(ZIRCON);
        });
    }
}
