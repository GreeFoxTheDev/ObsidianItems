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

public class CryingObsidianHelmet extends JavaPlugin {
    public static void init(){
        createCryingObsidianHelmet();
    }
    public static ItemStack cryingObsidianHelmet;
    private static void createCryingObsidianHelmet(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName("§fCrying Obsidian Helmet");
        im.setLocalizedName("crying_obsidian_helmet");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_BLUE + "Made of a really hard stone!");
        im.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 3, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "generic.armor_toughness", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        im.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, modifier1);
        im.setCustomModelData(3987633);
        item.setItemMeta(im);
        cryingObsidianHelmet = item;
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("crying_obsidian_helmet"), item);
        sr.shape("XXX", "X X", "   ");
        sr.setIngredient('X', Material.CRYING_OBSIDIAN);
        ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("crying_obsidian_helmet2"), item);
        sr2.shape("   ", "XXX", "X X");
        sr2.setIngredient('X', Material.CRYING_OBSIDIAN);
        try {
            Bukkit.addRecipe(sr);
            Bukkit.addRecipe(sr2);
        } catch (IllegalStateException ignored) {
        }
    }
}