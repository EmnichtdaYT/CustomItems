package de.emnichtda.customitems;

import org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_14_R1.NBTTagCompound;
import net.minecraft.server.v1_14_R1.NBTTagString;

public class CustomItemsUtils {
	
	public static ItemStack addNTBtag(ItemStack itemStack, String tagName, String value) {
		net.minecraft.server.v1_14_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
		NBTTagCompound comp = nmsStack.getOrCreateTag();
		NBTTagString string = new NBTTagString(value);		
		comp.set(tagName, string);
		return CraftItemStack.asBukkitCopy(nmsStack);
	}
	
	public static String getNTBtag(ItemStack itemStack, String key) {
		net.minecraft.server.v1_14_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
		NBTTagCompound comp = nmsStack.getTag();
		if(comp==null) {
			return null;
		}
		return comp.getString(key);
	}
}
