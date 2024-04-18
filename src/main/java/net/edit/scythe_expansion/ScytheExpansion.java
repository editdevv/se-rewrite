package net.edit.scythe_expansion;

import net.edit.scythe_expansion.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScytheExpansion implements ModInitializer {
    public static final String MOD_ID = "scythe-expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}