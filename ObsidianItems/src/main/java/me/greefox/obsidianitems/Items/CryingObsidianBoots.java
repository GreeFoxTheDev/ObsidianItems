package me.greefox.obsidianitems.Items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CryingObsidianBoots extends JavaPlugin {
    public static void init(){
        createCryingObsidianBoots();
    }
    public static ItemStack cryingObsidianBoots;
    private static void createCryingObsidianBoots(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCrying Obsidian Boots");
        im.setLocalizedName("crying_obsidian_boots");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_BLUE + "Made of a really hard stone!");
        im.setLore(lore);
        im.setCustomModelData(3987631);
        item.setItemMeta(im);
        cryingObsidianBoots = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("crying_obsidian_boots"), item);
        sr.shape("   ", "X X", "X X");
        sr.setIngredient('X', Material.CRYING_OBSIDIAN);
        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("crying_obsidian_boots2"), item);
        sr2.shape("X X", "X X", "   ");
        sr2.setIngredient('X', Material.CRYING_OBSIDIAN);
        try {
            Bukkit.addRecipe(sr);
            Bukkit.addRecipe(sr2);
        } catch (IllegalStateException ignored) {
        }
    }
}