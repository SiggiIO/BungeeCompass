package uk.asheiou.bungeecompass;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CompassComparison {
    public static boolean compare(ItemStack itemToCompare) {
        ItemMeta itemMetaToCompare = itemToCompare.getItemMeta();
        if (itemMetaToCompare == null) return false; // ignore items with no metadata
        ItemMeta compass = CompassItemStack.getCompass().getItemMeta();
        return itemMetaToCompare.getDisplayName().equals(compass.getDisplayName()); // compare names
    }
}
