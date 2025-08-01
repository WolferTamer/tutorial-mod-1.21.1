package net.wolfertamer.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.wolfertamer.tutorialmod.block.ModBlocks;
import net.wolfertamer.tutorialmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> ZIRCON_SMELTABLES = List.of(ModBlocks.ZIRCON_ORE,ModBlocks.ZIRCON_DEEPSLATE_ORE);
        offerSmelting(exporter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON, 0.25f, 200, "zircon");
        offerBlasting(exporter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON, 0.25f, 100, "zircon");

        List<ItemConvertible> FLAMINGO_FABRIC_SMELTABLES = List.of(ModItems.FLAMINGO_FEATHER);
        offerSmelting(exporter,FLAMINGO_FABRIC_SMELTABLES,RecipeCategory.MISC, ModItems.FLAMINGO_FABRIC, 0.25f, 200, "flamingo_fabric");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,ModItems.FLAMINGO_FABRIC, RecipeCategory.MISC, ModBlocks.FLAMINGO_FABRIC_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.MOB_INSPECTOR)
                .pattern(" CA")
                .pattern(" ZC")
                .pattern("S  ")
                .input('C', Items.COPPER_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('Z',ModItems.ZIRCON)
                .input('S',Items.STICK)
                .criterion(hasItem(ModItems.ZIRCON),conditionsFromItem(ModItems.ZIRCON))
                .offerTo(exporter);

    }
}
