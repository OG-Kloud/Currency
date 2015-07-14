package net.kloudspace.currency;

import net.kloudspace.currency.blocks.CBlocks;
import net.kloudspace.currency.crafting.CCraftingHandler;
import net.kloudspace.currency.items.CItems;
import net.kloudspace.currency.tabs.CTab;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="currencemod_kloud", name="Currency Mod by Kloud", version="1.1.0")

public class _Mod {
	
	public static final String MODID = "currency";
	
	public static CreativeTabs currencyTab = new CTab("CurrencyTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		CItems.reg();
		CBlocks.reg();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		CCraftingHandler.registerCraftingRecipies();
	}
	
	

}
