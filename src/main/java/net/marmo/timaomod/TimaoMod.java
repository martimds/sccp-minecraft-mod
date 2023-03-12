package net.marmo.timaomod;

import net.fabricmc.api.ModInitializer;

import net.marmo.timaomod.block.ModBlocks;
import net.marmo.timaomod.item.ModItemGroup;
import net.marmo.timaomod.item.ModItems;
import net.marmo.timaomod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimaoMod implements ModInitializer {
	public static final String MOD_ID = "timaomod";
	public static final Logger LOGGER = LoggerFactory.getLogger("timaomod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}