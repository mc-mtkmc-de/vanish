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
						if(player.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
							player.removePotionEffect(PotionEffectType.INVISIBILITY);
							
						} else {
							player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 99999999, 0));
						}
							
						}
						

				}
			
		}
		
		return false;
	}

}
