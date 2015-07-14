package net.kloudspace.currency.blocks;

import net.kloudspace.currency._Mod;
import net.kloudspace.currency.utils.Ref;
import net.kloudspace.currency.utils.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CBlocks {
	
	public static Block currencyStorage;
	
	public static void reg() {
		currencyStorage = new CBlock(Material.iron).setBlockName("currencyStorageBlock").setBlockTextureName(Ref.folder + "currencyStorage").setCreativeTab(_Mod.currencyTab);
		RegistryHelper.register(currencyStorage);
		RegistryHelper.addLangToObj(currencyStorage, "Block of Currency");
	}

}
