package me.greefox.obsidianitems.Commands;

import me.greefox.obsidianitems.Items.*;
import me.greefox.obsidianitems.ObsidianItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Give implements CommandExecutor, TabCompleter {
    private static final String[] ARGS = {"obsidian_boots", "obsidian_chestplate", "obsidian_helmet", "obsidian_leggings", "crying_obsidian_boots", "crying_obsidian_chestplate", "crying_obsidian_helmet", "crying_obsidian_leggings"};
    ObsidianItems plugin;

    public Give(ObsidianItems plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("giveobsidianitem")) {
            if (args.length == 1) {
                if (sender instanceof BlockCommandSender) {
                    Location loc = ((BlockCommandSender) sender).getBlock().getLocation();
                    Entity closestEntity = null;
                    double lowestDistSoFar = Double.MAX_VALUE;
                    for (Entity entity : Objects.requireNonNull(loc.getWorld()).getNearbyEntities(loc, 100, 100, 100)) {
                        if (entity instanceof Player) {
                            double distance = entity.getLocation().distance(loc);
                            if (distance < lowestDistSoFar) {
                                lowestDistSoFar = distance;
                                closestEntity = entity;

                            }
                        }
                    }
                    if (closestEntity != null) {
                        if (args[0].equalsIgnoreCase("obsidian_boots")) {
                            ((Player) closestEntity).getInventory().addItem(ObsidianBoots.obsidianBoots);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                            ((Player) closestEntity).getInventory().addItem(ObsidianChestplate.obsidianChestplate);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                            ((Player) closestEntity).getInventory().addItem(ObsidianHelmet.obsidianHelmet);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                            ((Player) closestEntity).getInventory().addItem(ObsidianLeggings.obsidianLeggings);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                            ((Player) closestEntity).getInventory().addItem(CryingObsidianBoots.cryingObsidianBoots);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                            ((Player) closestEntity).getInventory().addItem(CryingObsidianChestplate.cryingObsidianChestplate);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                            ((Player) closestEntity).getInventory().addItem(CryingObsidianHelmet.cryingObsidianHelmet);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                            ((Player) closestEntity).getInventory().addItem(CryingObsidianLeggings.cryingObsidianLeggings);
                        }
                    }
                } else if (sender instanceof Player) {
                    Player player = (Player) sender;
                    if (player.isOp()) {
                        sender.sendMessage("Gave 1 [" + args[0] + "] to player " + sender.getName());
                        if (args[0].equalsIgnoreCase("obsidian_boots")) {
                            player.getInventory().addItem(ObsidianBoots.obsidianBoots);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                            player.getInventory().addItem(ObsidianChestplate.obsidianChestplate);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                            player.getInventory().addItem(ObsidianHelmet.obsidianHelmet);
                        }
                        if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                            player.getInventory().addItem(ObsidianLeggings.obsidianLeggings);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                            player.getInventory().addItem(CryingObsidianBoots.cryingObsidianBoots);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                            player.getInventory().addItem(CryingObsidianChestplate.cryingObsidianChestplate);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                            player.getInventory().addItem(CryingObsidianHelmet.cryingObsidianHelmet);
                        }
                        if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                            player.getInventory().addItem(CryingObsidianLeggings.cryingObsidianLeggings);
                        }
                    } else sender.sendMessage(ChatColor.RED + "You don't have permission to do that!");
                }
            } else if (args.length == 2) {
                String playerName = args[1];
                Player chosenPlayer = Bukkit.getPlayer(playerName);
                assert chosenPlayer != null;
                if (Arrays.toString(Bukkit.getOnlinePlayers().toArray()).contains(playerName)) {
                    if (sender instanceof Player || sender instanceof BlockCommandSender) {
                        if (sender.isOp()) {
                            sender.sendMessage("Gave 1 [" + args[0] + "] to player " + args[1]);
                            if (!(chosenPlayer.getInventory().firstEmpty() == -1)) {
                                if (args[0].equalsIgnoreCase("obsidian_boots")) {
                                    chosenPlayer.getInventory().addItem(ObsidianBoots.obsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                                    chosenPlayer.getInventory().addItem(ObsidianChestplate.obsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                                    chosenPlayer.getInventory().addItem(ObsidianHelmet.obsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                                    chosenPlayer.getInventory().addItem(ObsidianLeggings.obsidianLeggings);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                                    chosenPlayer.getInventory().addItem(ObsidianBoots.obsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                                    chosenPlayer.getInventory().addItem(CryingObsidianChestplate.cryingObsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                                    chosenPlayer.getInventory().addItem(CryingObsidianHelmet.cryingObsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                                    chosenPlayer.getInventory().addItem(CryingObsidianLeggings.cryingObsidianLeggings);
                                }
                            } else if (chosenPlayer.getInventory().firstEmpty() == -1) {
                                if (args[0].equalsIgnoreCase("obsidian_boots")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), ObsidianBoots.obsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), ObsidianChestplate.obsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), ObsidianHelmet.obsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), ObsidianLeggings.obsidianLeggings);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), CryingObsidianBoots.cryingObsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), CryingObsidianChestplate.cryingObsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), CryingObsidianHelmet.cryingObsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                                    chosenPlayer.getWorld().dropItemNaturally(chosenPlayer.getLocation(), CryingObsidianLeggings.cryingObsidianLeggings);
                                }
                            }
                        } else sender.sendMessage(ChatColor.RED + "You don't have permission to do that!");
                    } else if (sender instanceof ConsoleCommandSender) {
                        sender.sendMessage("Player only command!");
                    }
                } else if (!(args[1].equals("@a"))) {
                    sender.sendMessage(ChatColor.RED + "Unable to find player " + args[1]);
                }
                if ((sender instanceof Player || sender instanceof BlockCommandSender) && args[1].equalsIgnoreCase("@a")) {
                    if (sender.isOp()) {
                        sender.sendMessage("Gave [" + args[0] + "] to all players.");
                        for (Player allOnlinePlayers : Bukkit.getOnlinePlayers()) {
                            if (!(allOnlinePlayers.getInventory().firstEmpty() == -1)) {
                                if (args[0].equalsIgnoreCase("obsidian_boots")) {
                                    allOnlinePlayers.getInventory().addItem(ObsidianBoots.obsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                                    allOnlinePlayers.getInventory().addItem(ObsidianChestplate.obsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                                    allOnlinePlayers.getInventory().addItem(ObsidianHelmet.obsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                                    allOnlinePlayers.getInventory().addItem(ObsidianLeggings.obsidianLeggings);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                                    allOnlinePlayers.getInventory().addItem(CryingObsidianBoots.cryingObsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                                    allOnlinePlayers.getInventory().addItem(CryingObsidianChestplate.cryingObsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                                    allOnlinePlayers.getInventory().addItem(CryingObsidianHelmet.cryingObsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                                    allOnlinePlayers.getInventory().addItem(CryingObsidianLeggings.cryingObsidianLeggings);
                                }
                            } else if (allOnlinePlayers.getInventory().firstEmpty() == -1) {

                                if (args[0].equalsIgnoreCase("obsidian_boots")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), ObsidianBoots.obsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_chestplate")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), ObsidianChestplate.obsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_helmet")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), ObsidianHelmet.obsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("obsidian_leggings")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), ObsidianLeggings.obsidianLeggings);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_boots")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), CryingObsidianBoots.cryingObsidianBoots);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_chestplate")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), CryingObsidianChestplate.cryingObsidianChestplate);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_helmet")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), CryingObsidianHelmet.cryingObsidianHelmet);
                                }
                                if (args[0].equalsIgnoreCase("crying_obsidian_leggings")) {
                                    allOnlinePlayers.getWorld().dropItemNaturally(allOnlinePlayers.getLocation(), CryingObsidianLeggings.cryingObsidianLeggings);
                                }
                            }
                        }
                    } else sender.sendMessage(ChatColor.RED + "You don't have permission to do that!");
                }
            }
        }
        return true;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        final List<String> items = new ArrayList<>();
        StringUtil.copyPartialMatches(args[0], Arrays.asList(ARGS), items);
        Collections.sort(items);
        if (args.length == 1) {
            return items;
        }

        final ArrayList<String> finalNames = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("@a");

        String[] ARGS1 = new String[names.size()];
        for (Player p : Bukkit.getOnlinePlayers()) {
            String name = p.getName();
            names.add(name);
        }
        ARGS1 = names.toArray(ARGS1);
        StringUtil.copyPartialMatches(args[1], Arrays.asList(ARGS1), finalNames);
        if (args.length == 2) {
            return finalNames;
        }
        return new ArrayList<>();
    }
}
