package fr.arcane.eventadmin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class VanishCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (sender instanceof Player) {
        if (args[0].equalsIgnoreCase("on")) {

            Player p = (Player) sender;
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999, 3, false, false, false));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Vanish On"));


        }

        if (args[0].equalsIgnoreCase("off")) {

            Player p = (Player) sender;
            p.getActivePotionEffects().clear();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Vanish Off"));


        }

    }

        return false;
    }
}
