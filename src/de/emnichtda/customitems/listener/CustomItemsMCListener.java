package de.emnichtda.customitems.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import de.emnichtda.customitems.CustomItemsMain;

public class CustomItemsMCListener implements Listener{
	CustomItemsMain pl;
	
	public CustomItemsMCListener(CustomItemsMain pl) throws IllegalStateException{
		if(pl.getMcListener()==null) {
			this.pl = pl;
			pl.getServer().getPluginManager().registerEvents(this, pl);
		}else {
			throw new IllegalStateException("There is already a listener. Get it using CustomItemsMain.getMcListener()");
		}
	}
	
	private boolean clicked = false; //to fix the minecraft glitch, PlayerInteractEvent gets called twice.
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if(clicked) { //fix minecraft double click bug (event called twice)
			clicked = false;
			return;
		}
		
		if(e.getAction()!=Action.RIGHT_CLICK_BLOCK) { //If player didnt right click - leave
			return;
		}
		
		if(e.getItem()==null) { //If player has no item in hand - leave
			return;
		}
		
		//TODO spawn item if item is spawnable
	}
}
