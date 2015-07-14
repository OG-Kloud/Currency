package net.kloudspace.currency.items;

import net.kloudspace.currency._Mod;
import net.kloudspace.currency.utils.Ref;
import net.kloudspace.currency.utils.RegistryHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CItems {
	
	public static Item currencyNug;
	public static Item currencyIngot;
	public static Item coin;
	
	public static CreativeTabs c = _Mod.currencyTab;
	
	public static void reg() {
	currencyNug = new Item().setUnlocalizedName("currencyNug").setTextureName(Ref.folder + "currencyNug").setCreativeTab(c);
	RegistryHelper.register(currencyNug);
	RegistryHelper.addLangToObj(currencyNug, "Currency Nugget");
	currencyIngot = new Item().setUnlocalizedName("currencyIngot").setTextureName(Ref.folder + "currencyIngot").setCreativeTab(c);
	RegistryHelper.register(currencyIngot);
	RegistryHelper.addLangToObj(currencyIngot, "Currency Ingot");
	coin = new Item().setUnlocalizedName("coin").setTextureName(Ref.folder + "coin").setCreativeTab(c);
	RegistryHelper.register(coin);
	RegistryHelper.addLangToObj(coin, "Coin");
	}

}