package de.vanish.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VanishCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
				if(player.hasPermission("vanish.vanish")) {
					if(args.length == 0) {
						
						player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 99999999, 0));
						
						player.sendMessage("§cDu befindest dich jetzt im §b§lVanish§c!");
						player.canSee((Player) PotionEffectType.INVISIBILITY);
					} else if(args.length == 1) {
						player.removePotionEffect(PotionEffectType.INVISIBILITY);
						
					}
				}
			
		}
		
		return false;
	}

}
