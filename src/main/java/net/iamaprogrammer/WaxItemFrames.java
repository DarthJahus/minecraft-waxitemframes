package net.iamaprogrammer;

import net.iamaprogrammer.config.ModConfig;
import net.iamaprogrammer.config.core.ConfigRegistry;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(WaxItemFrames.MOD_ID)
public class WaxItemFrames {
	public static final String MOD_ID = "waxitemframes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ModConfig CONFIG;

	public WaxItemFrames() {
		ModConfig defaultConfig = new ModConfig();
		defaultConfig.shouldFixItemFrameWhenWaxed(false);
		CONFIG = new ConfigRegistry<>(defaultConfig, ModConfig.class).register();
		LOGGER.info("Wax Item Frames (Forge) loaded");
	}
}
