package fr.arcane.eventadmin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PvPCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args[0].equalsIgnoreCase("true")) {

            Bukkit.getWorld("world").setPVP(true);
            Bukkit.getWorld("world_nether").setPVP(true);
            Bukkit.getWorld("world_the_end").setPVP(true);

            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] PvP On"));

        }

        if (args[0].equalsIgnoreCase("false")) {

            Bukkit.getWorld("world").setPVP(false);
            Bukkit.getWorld("world_nether").setPVP(false);
            Bukkit.getWorld("world_the_end").setPVP(false);

            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] PvP Off"));

        }



        return false;
    }
}
