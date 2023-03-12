package net.marmo.timaomod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.marmo.timaomod.block.ModBlocks;
import net.marmo.timaomod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORINTHIANS_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORINTHIANS_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CORINTHIANS_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CORINTHIANS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORINTHIANS_DUST, Models.GENERATED);
    }
}