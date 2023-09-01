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

public class ObsidianLeggings extends JavaPlugin {
    public static void init() {
        createObsidianLeggings();
    }
    public static ItemStack obsidianLeggings;

    private static void createObsidianLeggings() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fObsidian Leggings");
        im.setLocalizedName("obsidian_leggings");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_BLUE + "Made of a really hard stone!");
        im.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "generic.armor_toughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, modifier1);
        im.setCustomModelData(3987644);
        item.setItemMeta(im);
        obsidianLeggings = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("obsidian_leggings"), item);
        sr.shape("XXX", "X X", "X X");
        sr.setIngredient('X', Material.OBSIDIAN);
        try {
            Bukkit.addRecipe(sr);
        } catch (IllegalStateException ignored) {
        }
    }
}