package net.jerry.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.jerry.tutorialmod.block.ModBlocks;
import net.jerry.tutorialmod.item.ModItemGroups;
import net.jerry.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}