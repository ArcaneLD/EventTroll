package fr.arcane.eventadmin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class EventAdmin extends JavaPlugin {



    @Override
    public void onEnable() {
        System.out.println("[AdminTool] Ready.");
        Bukkit.getServer().getPluginManager().registerEvents(new EventadminListener(), (Plugin) this);

        getCommand("adminform").setExecutor(new AdminFormCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("pvp").setExecutor(new PvPCommand());
    }

    @Override
    public void onDisable() {

    }



}
