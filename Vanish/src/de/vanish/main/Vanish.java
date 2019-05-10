package de.vanish.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.vanish.command.VanishCommand;

public class Vanish extends JavaPlugin {
	
	private static Vanish plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("v").setExecutor(new VanishCommand());
		
	}
	
	public static Vanish getplugin() {
		return plugin;
	}

}
