package net.md_5;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EmeraldSword extends JavaPlugin
{

    @Override
    public void onEnable()
  {
    ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta im = sword.getItemMeta();
    sword.setItemMeta(im);
    im.setDisplayName("Emerald Sword");
    sword.setItemMeta(im);
    sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 7);
    ShapedRecipe recipe = new ShapedRecipe(sword);
    recipe.shape(new String[] { " E ", " E ", " S " });
    recipe.setIngredient('E', Material.EMERALD);
    recipe.setIngredient('S', Material.STICK);
    getServer().addRecipe(recipe);
  }
}
