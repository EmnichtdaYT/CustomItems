package de.emnichtda.customitems;

import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

import de.emnichtda.customitems.listener.CustomItemsMCListener;

public class CustomItemsMain extends JavaPlugin {

	private CustomItemsMCListener mcListener;

	@Override
	public void onEnable() {
		mcListener = new CustomItemsMCListener(this);
	}

	@Override
	public boolean onCommand(org.bukkit.command.CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		return true;
	}

	public CustomItemsMCListener getMcListener() {
		return mcListener;
	}

}
