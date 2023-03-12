package net.marmo.timaomod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.marmo.timaomod.block.ModBlocks;
import net.marmo.timaomod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CORINTHIANS_BLOCK);

        addDrop(ModBlocks.CORINTHIANS_ORE, oreDrops(ModBlocks.CORINTHIANS_ORE, ModItems.CORINTHIANS_DUST));
        addDrop(ModBlocks.DEEPSLATE_CORINTHIANS_ORE, oreDrops(ModBlocks.DEEPSLATE_CORINTHIANS_ORE, ModItems.CORINTHIANS_DUST));
    }
}