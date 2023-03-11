package net.marmo.timaomod;

import net.fabricmc.api.ModInitializer;

import net.marmo.timaomod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimaoMod implements ModInitializer {
	public static final String MOD_ID = "timaomod";
	public static final Logger LOGGER = LoggerFactory.getLogger("timaomod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}