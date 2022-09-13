package fr.arcane.eventadmin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminFormCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        ItemStack endrod = new ItemStack(Material.STICK, 1);
        ItemMeta Mendrod = endrod.getItemMeta();
        Mendrod.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lMover Tool"));
        Mendrod.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mendrod.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        endrod.setItemMeta(Mendrod);

        p.getInventory().setItem(0, endrod);

        ItemStack blazerod = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta Mblazerod = blazerod.getItemMeta();
        Mblazerod.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lBaton des dieux"));
        Mblazerod.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mblazerod.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blazerod.setItemMeta(Mblazerod);

        p.getInventory().setItem(1, blazerod);


        ItemStack fireball = new ItemStack(Material.FIRE_CHARGE, 1);
        ItemMeta Mfireball = fireball.getItemMeta();
        Mfireball.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lCanon a Ghast"));
        Mfireball.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mfireball.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fireball.setItemMeta(Mfireball);

        p.getInventory().setItem(2, fireball);


        ItemStack disc = new ItemStack(Material.MUSIC_DISC_PIGSTEP, 1);
        ItemMeta Mdisc = disc.getItemMeta();
        Mdisc.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&lSons Random"));
        Mdisc.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mdisc.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        disc.setItemMeta(Mdisc);

        p.getInventory().setItem(3, disc);


        ItemStack spawner = new ItemStack(Material.SPAWNER, 1);
        ItemMeta Mspawner = spawner.getItemMeta();
        Mspawner.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lRoulette Russe"));
        Mspawner.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mspawner.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        spawner.setItemMeta(Mspawner);

        p.getInventory().setItem(4, spawner);


        ItemStack tnt = new ItemStack(Material.CREEPER_HEAD, 1);
        ItemMeta Mtnt = tnt.getItemMeta();
        Mtnt.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&4Explosion"));
        Mtnt.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mtnt.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        tnt.setItemMeta(Mtnt);

        p.getInventory().setItem(5, tnt);


        ItemStack w = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta Mw = w.getItemMeta();
        Mw.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&1Noyade"));
        Mw.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mw.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        w.setItemMeta(Mw);

        p.getInventory().setItem(6, w);


        ItemStack b = new ItemStack(Material.BOOK, 1);
        ItemMeta Mb = b.getItemMeta();
        Mb.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&l&cInvSee"));
        Mb.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        Mb.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        b.setItemMeta(Mb);

        p.getInventory().setItem(7, b);


        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Vous passez en mode admin"));


        return false;
    }
}