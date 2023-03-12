package net.marmo.timaomod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.marmo.timaomod.block.ModBlocks;
import net.marmo.timaomod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.CORINTHIANS_DUST), RecipeCategory.MISC, ModItems.CORINTHIANS_INGOT,
                0.7f, 200, "corinthians");

        offerBlasting(exporter, List.of(ModItems.CORINTHIANS_DUST), RecipeCategory.MISC, ModItems.CORINTHIANS_INGOT,
                0.7f, 100, "corinthians");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CORINTHIANS_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.CORINTHIANS_BLOCK);


    }
}