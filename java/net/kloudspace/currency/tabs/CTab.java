package net.kloudspace.currency.tabs;

import net.kloudspace.currency.items.CItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTab extends CreativeTabs {

	public CTab(String lable) {
		super(getNextID(), lable);
	}

	@Override
	public Item getTabIconItem() {
		return CItems.coin;
	}

}
