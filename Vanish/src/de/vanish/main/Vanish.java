package de.vanish.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.vanish.listener.VanishJoinListener;
import de.vanish.listener.VanishQuitListener;
import de.vanish.command.VanishCommand;

public class Vanish extends JavaPlugin {
	
	private static Vanish plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("v").setExecutor(new VanishCommand());
		
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new VanishJoinListener(), this);
		pluginManager.registerEvents(new VanishQuitListener(), this);
		
	}
	
	public static Vanish getplugin() {
		return plugin;
	}

}
