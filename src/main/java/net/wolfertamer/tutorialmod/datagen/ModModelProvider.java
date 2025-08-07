package net.wolfertamer.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.wolfertamer.tutorialmod.block.ModBlocks;
import net.wolfertamer.tutorialmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCON_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCON_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.FLAMINGO_FABRIC_BLOCK,TexturedModel.END_FOR_TOP_CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENCHANTED_TREE_BARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAMINGO_FEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAMINGO_FABRIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZIRCON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOB_INSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PET_FOOD, Models.GENERATED);
    }
}
