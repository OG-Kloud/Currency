package net.kloudspace.currency.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegistryHelper {
	
	public static void register(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
	public static void register(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void addLangToObj(Object obj, String name) {
		LanguageRegistry.addName(obj, name);
	}

}
