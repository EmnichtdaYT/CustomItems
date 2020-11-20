package de.emnichtda.customitems.entity;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

public interface SpawnAble {
	public ArmorStand spawn(Location l, boolean visible, boolean small, boolean hasGravity);
}
