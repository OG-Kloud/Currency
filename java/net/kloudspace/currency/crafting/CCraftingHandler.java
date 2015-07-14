package net.kloudspace.currency.crafting;

import net.kloudspace.currency.blocks.CBlocks;
import net.kloudspace.currency.items.CItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CCraftingHandler {
	
	public static void registerCraftingRecipies() {
		GameRegistry.addRecipe(new ItemStack(CItems.currencyIngot), new Object[]{ "xxx", "xxx", "xxx", 'x', CItems.currencyNug});
		GameRegistry.addRecipe(new ItemStack(CBlocks.currencyStorage), new Object[]{ "xxx", "xxx", "xxx", 'x', CItems.currencyIngot});
		GameRegistry.addRecipe(new ItemStack(CItems.coin), new Object[]{"xxx", "x x", "xxx", 'x', CItems.currencyNug});
		GameRegistry.addRecipe(new ItemStack(CItems.currencyNug, 9), new Object[]{"x", 'x', CItems.currencyIngot});
		GameRegistry.addRecipe(new ItemStack(CItems.currencyIngot, 9), new Object[]{ "x", 'x', CBlocks.currencyStorage});
	}

}
