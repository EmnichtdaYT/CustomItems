package de.emnichtda.customitems.entity;

import org.bukkit.inventory.ItemStack;

public class CustomItem{
	
	private ItemStack item;
	
	public CustomItem(ItemStack item) {
		this.item = item;
	}

	public ItemStack getItem() {
		return item;
	}
	
}
