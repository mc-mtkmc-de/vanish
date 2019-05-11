package de.vanish.command;
 
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

	public static List<Player> vanished = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player))
			return true;
		
		Player player = (Player) sender;
		
		if(!player.hasPermission("vanish.vanish")) return true;
		
		if(args.length == 0) {
			if(vanished.contains(player)) {
				vanished.remove(player);
				player.sendMessage("§cDu bist nun §b§lSichtbar §c!");
				for(Player all :Bukkit.getOnlinePlayers()) {
					all.showPlayer(player);
				}
			} else {
				vanished.add(player);
				player.sendMessage("§cDu bist jetzt §b§lUnsichtbar");
				for(Player all : Bukkit.getOnlinePlayers()) {
					
					if(!all.hasPermission("vanish.see")) {
						all.hidePlayer(player);
					}
				}
			}
		}
		
		
		return false;
	}

}
