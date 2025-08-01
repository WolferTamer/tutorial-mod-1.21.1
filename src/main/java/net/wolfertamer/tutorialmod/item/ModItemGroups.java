package net.wolfertamer.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wolfertamer.tutorialmod.TutorialMod;
import net.wolfertamer.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TUTORIAL_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "tutorial_mod"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.FLAMINGO_FEATHER))
                    .displayName(Text.translatable("itemgroup.tutorialmod.tutorial_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ZIRCON);
                        entries.add(ModBlocks.ZIRCON_ORE);
                        entries.add(ModBlocks.ZIRCON_DEEPSLATE_ORE);
                        entries.add(ModItems.FLAMINGO_FEATHER);
                        entries.add(ModItems.FLAMINGO_FABRIC);
                        entries.add(ModBlocks.FLAMINGO_FABRIC_BLOCK);
                        entries.add(ModItems.ENCHANTED_TREE_BARK);
                        entries.add(ModItems.PET_FOOD);
                        entries.add(ModItems.MOB_INSPECTOR);
                    })
                    .build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
