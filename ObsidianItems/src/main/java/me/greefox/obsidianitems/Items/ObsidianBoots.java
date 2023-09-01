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

public class ObsidianBoots extends JavaPlugin {
    public static void init(){
        createObsidianBoots();
    }
    public static ItemStack obsidianBoots;
    private static void createObsidianBoots(){
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fObsidian Boots");
        im.setLocalizedName("obsidian_boots");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_BLUE + "Made of a really hard stone!");
        im.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "generic.armor_toughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, modifier1);
        im.setCustomModelData(3987641);
        item.setItemMeta(im);
        obsidianBoots = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("obsidian_boots"), item);
        sr.shape("   ", "X X", "X X");
        sr.setIngredient('X', Material.OBSIDIAN);
        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("obsidian_boots2"), item);
        sr2.shape("X X", "X X", "   ");
        sr2.setIngredient('X', Material.OBSIDIAN);
        try {
            Bukkit.addRecipe(sr);
            Bukkit.addRecipe(sr2);
        } catch (IllegalStateException ignored) {
        }
    }
}