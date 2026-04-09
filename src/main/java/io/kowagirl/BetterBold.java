package io.kowagirl;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBold implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("assets/betterbold/betterbold");

	@Override
	public void onInitialize() {
		LOGGER.info("BetterBold initialized!");
	}
}
