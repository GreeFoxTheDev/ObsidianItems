package me.greefox.obsidianitems;

import me.greefox.obsidianitems.Commands.Give;
import me.greefox.obsidianitems.Items.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ObsidianItems extends JavaPlugin {

    @Override
    public void onEnable() {
        reloadConfig();

        FileConfiguration config = this.getConfig();

        config.addDefault("obsidian-items.enable-obsidian-boots", true);
        config.addDefault("obsidian-items.enable-obsidian-chestplate", true);
        config.addDefault("obsidian-items.enable-obsidian-helmet", true);
        config.addDefault("obsidian-items.enable-obsidian-leggings", true);
        config.addDefault("crying-obsidian-items.enable-crying-obsidian-boots", true);
        config.addDefault("crying-obsidian-items.enable-crying-obsidian-chestplate", true);
        config.addDefault("crying-obsidian-items.enable-crying-obsidian-helmet", true);
        config.addDefault("crying-obsidian-items.enable-crying-obsidian-leggings", true);
        saveDefaultConfig();
        if (config.getBoolean("obsidian-items.enable-obsidian-boots")) {
            ObsidianBoots.init();
        }
        if (config.getBoolean("obsidian-items.enable-obsidian-chestplate")) {
            ObsidianChestplate.init();
        }
        if (config.getBoolean("obsidian-items.enable-obsidian-helmet")) {
            ObsidianHelmet.init();
        }
        if (config.getBoolean("obsidian-items.enable-obsidian-leggings")) {
            ObsidianLeggings.init();
        }
        if (config.getBoolean("crying-obsidian-items.enable-crying-obsidian-boots")) {
            CryingObsidianBoots.init();
        }
        if (config.getBoolean("crying-obsidian-items.enable-crying-obsidian-chestplate")) {
            CryingObsidianChestplate.init();
        }
        if (config.getBoolean("crying-obsidian-items.enable-crying-obsidian-helmet")) {
            CryingObsidianHelmet.init();
        }
        if (config.getBoolean("crying-obsidian-items.enable-crying-obsidian-leggings")) {
            CryingObsidianLeggings.init();
        }
        config.options().copyDefaults(true);
        saveConfig();

        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.AQUA + "************************************");
        console.sendMessage(ChatColor.AQUA + "| ObsidianItems have been enabled! |");
        console.sendMessage(ChatColor.AQUA + "************************************");

        Objects.requireNonNull(this.getCommand("giveobsidianitem")).setExecutor(new Give(this));
        Objects.requireNonNull(this.getCommand("giveobsidianitem")).setTabCompleter(new Give(this));
    }

    @Override
    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(ChatColor.DARK_RED + "*************************************");
        console.sendMessage(ChatColor.DARK_RED + "| ObsidianItems have been disabled! |");
        console.sendMessage(ChatColor.DARK_RED + "************************************");
    }
}
