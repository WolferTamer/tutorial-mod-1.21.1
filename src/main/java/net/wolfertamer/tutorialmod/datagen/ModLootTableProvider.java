package net.wolfertamer.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.wolfertamer.tutorialmod.block.ModBlocks;
import net.wolfertamer.tutorialmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FLAMINGO_FABRIC_BLOCK);
        addDrop(ModBlocks.ZIRCON_ORE, oreDrops(ModBlocks.ZIRCON_ORE, ModItems.ZIRCON));
        addDrop(ModBlocks.ZIRCON_DEEPSLATE_ORE, oreDrops(ModBlocks.ZIRCON_DEEPSLATE_ORE, ModItems.ZIRCON));
    }
}
