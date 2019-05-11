package de.vanish.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.vanish.command.VanishCommand;

public class VanishJoinListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		for(Player vanish : VanishCommand.vanished) {
			
			if(!event.getPlayer().hasPermission("vanish.see")){
				event.getPlayer().hidePlayer(vanish);
			}
		}
	}

}
