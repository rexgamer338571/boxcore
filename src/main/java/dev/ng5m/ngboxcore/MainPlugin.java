
package dev.ng5m.ngboxcore;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;

public class MainPlugin extends JavaPlugin {
	public static MainPlugin instance;
	public static String serverPackage = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
	@Override
	public void onEnable() {
		instance = this;

		getLogger().info(serverPackage);
	}
}
