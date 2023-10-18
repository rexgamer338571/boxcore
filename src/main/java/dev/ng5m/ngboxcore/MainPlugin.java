
package dev.ng5m.ngboxcore;

import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {
	public static MainPlugin instance;
	public static String serverPackage = instance.getServer().getClass().getPackage().getName().split("\\.")[3];

	@Override
	public void onEnable() {
		instance = this;

		getLogger().info(serverPackage);
	}
}
