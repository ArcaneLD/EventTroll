package fr.arcane.eventadmin;

import org.bukkit.*;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class EventadminListener implements Listener {

    @EventHandler
    public void onHit (EntityDamageByEntityEvent e) {


                Player p = (Player) e.getDamager();
                Player pclicked = (Player) e.getEntity();


                if (p.isOp()) {
                    if (p.getInventory().getItemInMainHand().getType() == Material.STICK) {

                        pclicked.sendTitle(ChatColor.translateAlternateColorCodes('&', "&4Tu vas etre move"), null, 10, 100, 10);
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lMove : " + pclicked.getName()));
                        e.setCancelled(true);
                    }

                    if (p.getInventory().getItemInMainHand().getType() == Material.CREEPER_HEAD) {

                        pclicked.sendTitle(ChatColor.translateAlternateColorCodes('&', "&4&lBOOM"), null, 10, 100, 10);

                        int r = new Random().nextInt(16);
                        Location loc = pclicked.getLocation();
                        double x = loc.getX();
                        double y = loc.getY() - 2;
                        double z = loc.getZ();
                        pclicked.getWorld().createExplosion(x, y, z, r);
                        e.setCancelled(true);

                    }

                    if (p.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD) {
                        int r = new Random().nextInt(7);
                        e.setCancelled(true);

                        if (r == 0) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 25));
                            pclicked.sendMessage("[Admin] GET LAUNCHED !!!!!");

                        }

                        if (r == 1) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1800, 2));
                            pclicked.sendMessage("[Admin] Tu ne crains plus les brulures ");

                        }

                        if (r == 2) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 3));
                            pclicked.sendMessage("[Admin] Petite Nausée avec le soleil et tout la..");

                        }

                        if (r == 3) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 600, 1));
                            pclicked.sendMessage("[Admin] GET POISONED !!!!!");

                        }

                        if (r == 4) {
                            pclicked.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 3));
                            pclicked.sendMessage("[Admin] A gift from the sky");

                        }

                        if (r == 5) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1800, 2));
                            pclicked.sendMessage("[Admin] SPEED UP !");

                        }

                        if (r == 6) {
                            pclicked.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1));
                            pclicked.sendMessage("[Admin] Tu es plus résistant !");
                        }

                    }


                    if (p.getInventory().getItemInMainHand().getType() == Material.SPAWNER) {
                        e.setCancelled(true);


                        int r = new Random().nextInt(13);

                        if (r == 0) {
                            pclicked.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET, 1));
                            pclicked.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE, 1));
                            pclicked.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS, 1));
                            pclicked.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS, 1));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Ton Armure a ete remplacee"));

                        }

                        if (r == 1) {
                            pclicked.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 32));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Tu as recu des steaks"));
                        }

                        if (r == 2) {
                            pclicked.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Tu as recu une golden apple"));
                        }


                        if (r == 3) {
                            pclicked.getInventory().addItem(new ItemStack(Material.ENCHANTING_TABLE, 1));
                            pclicked.giveExpLevels(26);

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Tu peux enchanter ton stuff !"));
                        }

                        if (r == 4) {
                            pclicked.damage(10);

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&l&4[AdminEvent] Allez Hop -5 coeur"));

                        }

                        if (r == 5) {
                            ItemStack stone = new ItemStack(Material.STONE, 64);
                            pclicked.getInventory().setItem(0, stone);
                            pclicked.getInventory().setItem(1, stone);
                            pclicked.getInventory().setItem(2, stone);
                            pclicked.getInventory().setItem(3, stone);
                            pclicked.getInventory().setItem(4, stone);
                            pclicked.getInventory().setItem(5, stone);
                            pclicked.getInventory().setItem(6, stone);
                            pclicked.getInventory().setItem(7, stone);
                            pclicked.getInventory().setItem(8, stone);

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4[AdminEvent] Ta HotBar a ete clear !"));
                        }

                        if (r == 6) {

                            pclicked.getInventory().addItem(new ItemStack(Material.DIAMOND, 7));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Voici 7 Diamants"));

                        }

                        if (r == 7) {
                            pclicked.getInventory().addItem(new ItemStack(Material.BLAZE_ROD, 2));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Un pas de plus vers L'End !"));

                        }


                        if (r == 8) {
                            pclicked.getInventory().addItem(new ItemStack(Material.BLAZE_ROD, 5));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Une marche de plus vers L'End !"));

                        }

                        if (r == 9) {
                            pclicked.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 4));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Coucou les Enderman"));


                        }

                        if (r == 10) {
                            pclicked.getInventory().addItem(new ItemStack(Material.ENDER_EYE, 2));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Meme plus besoin du Nether !"));

                        }

                        if (r == 11) {
                            pclicked.getInventory().addItem(new ItemStack(Material.TNT, 3));
                            pclicked.getInventory().addItem(new ItemStack(Material.FLINT_AND_STEEL, 1));

                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] C'est plus ma guerre.."));


                        }

                        if (r == 12) {
                            pclicked.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[AdminEvent] Rien pour cette fois.."));
                        }
                        e.setCancelled(true);

                    }


                    if (p.getInventory().getItemInMainHand().getType() == Material.WATER_BUCKET) {
                        e.setCancelled(true);
                        Location wl = pclicked.getLocation();



                        int r = new Random().nextInt(3);

                        if (r == 0) {
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);
                        }

                        if (r == 1) {
                            p.getWorld().getBlockAt((int) wl.getX() + 1, wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() - 1, wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ() + 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ() - 1).setType(Material.WATER);
                        }

                        if (r == 2) {

                            p.getWorld().getBlockAt((int) wl.getX() + 1, wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() - 1, wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ() + 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ() - 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() + 1, wl.getBlockY(), wl.getBlockZ() + 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() - 1, wl.getBlockY(), wl.getBlockZ() - 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() + 1, wl.getBlockY(), wl.getBlockZ() - 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX() - 1, wl.getBlockY(), wl.getBlockZ() + 1).setType(Material.WATER);
                            p.getWorld().getBlockAt((int) wl.getX(), wl.getBlockY(), wl.getBlockZ()).setType(Material.WATER);

                        }

                    }



                    if (p.getInventory().getItemInMainHand().getType() == Material.MUSIC_DISC_PIGSTEP) {
                        if (p.isOp()) {
                            int r = new Random().nextInt(11);
                            if (r == 0) {
                                p.playSound(p.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 30, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 10, 1);
                            }

                            if (r == 1) {
                                p.playSound(p.getLocation(), Sound.BLOCK_COPPER_BREAK, 20, 1);

                                pclicked.playSound(p.getLocation(), Sound.BLOCK_COPPER_BREAK, 20, 1);

                            }

                            if (r == 2) {
                                p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 10, 1);
                            }

                            if (r == 3) {
                                p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 30, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 30, 1);
                            }

                            if (r == 4) {
                                p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 10, 1);
                            }

                            if (r == 5) {
                                p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SHOOT, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_GHAST_SHOOT, 10, 1);
                            }
                            if (r == 6) {
                                p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SKELETON_AMBIENT, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_WITHER_SKELETON_AMBIENT, 10, 1);
                            }
                            if (r == 7) {
                                p.playSound(p.getLocation(), Sound.ENTITY_WITCH_CELEBRATE, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_WITCH_CELEBRATE, 10, 1);
                            }
                            if (r == 8) {
                                p.playSound(p.getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 10, 1);
                            }
                            if (r == 9) {
                                p.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_AMBIENT, 10, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_SKELETON_AMBIENT, 10, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_SPIDER_AMBIENT, 10, 1);
                                p.playSound(p.getLocation(), Sound.ENTITY_WITCH_AMBIENT, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_ZOMBIE_AMBIENT, 10, 1);
                                pclicked.playSound(p.getLocation(), Sound.ENTITY_SKELETON_AMBIENT, 10, 1);
                                pclicked.playSound(p.getLocation(), Sound.ENTITY_SPIDER_AMBIENT, 10, 1);
                                pclicked.playSound(p.getLocation(), Sound.ENTITY_WITCH_AMBIENT, 10, 1);
                            }
                            if (r == 10) {
                                p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10, 1);

                                pclicked.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 10, 1);
                            }

                            e.setCancelled(true);


                        }


                    }


                    if (p.getInventory().getItemInMainHand().getType() == Material.BOOK) {
                        if (p.isOp()) {
                            Inventory inv = pclicked.getInventory();

                            p.openInventory(inv);
                            e.setCancelled(true);
                        }
                    }




                }

    }




    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {

            Player p = e.getPlayer();
            if(p.getInventory().getItemInMainHand().getType() == Material.FIRE_CHARGE) {
                if(p.isOp()) {
                    Location loc = p.getLocation();
                    Projectile proj = p.launchProjectile(Fireball.class, loc.getDirection().normalize());
                    proj.setVelocity(proj.getVelocity().multiply(2));

                    e.setCancelled(true);
                }
            }





        }

    }


    @EventHandler
    public void DeathBan(PlayerDeathEvent e) {
        Player p = e.getEntity();
        if (!p.isOp()) {

            Bukkit.getBanList(BanList.Type.NAME).addBan(p.getName(),"Tu es mort !", null, null);



            p.kickPlayer("Tu es Mort");

        }
    }


}
