package de.emnichtda.customitems.entity;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class GeneralSpawnableItem extends CustomItem implements SpawnAble{
	
	public GeneralSpawnableItem(ItemStack item) {
		super(item);
	}

	@Override
	public ArmorStand spawn(Location l, boolean visible, boolean small, boolean gravity) {
		ArmorStand s = (ArmorStand) l.getWorld().spawnEntity(l, EntityType.ARMOR_STAND);
		
		s.setVisible(visible);
		s.setSmall(small);
		s.setGravity(gravity);
		
		s.setHelmet(getItem());
		
		return s;		
	}
	
}
