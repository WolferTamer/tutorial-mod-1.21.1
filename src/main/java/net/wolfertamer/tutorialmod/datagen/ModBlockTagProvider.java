package net.wolfertamer.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.wolfertamer.tutorialmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ZIRCON_DEEPSLATE_ORE)
                .add(ModBlocks.ZIRCON_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ZIRCON_ORE)
                .add(ModBlocks.ZIRCON_DEEPSLATE_ORE);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.FLAMINGO_FABRIC_BLOCK);
    }
}
