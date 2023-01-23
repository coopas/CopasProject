package com.coopas.copasproject.Comandos;

import com.coopas.copasproject.Main;
import com.coopas.copasproject.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GuiC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

    if (cmd.getName().equalsIgnoreCase("gui")) {

        Player p = (Player)sender;

        Inventory gui = Bukkit.createInventory(null,
                9*Main.config.getConfig().getInt("Gui.Tamanho"),
                Main.config.getConfig().getString("Gui.Nome").replace("&", "§"));

            for(String itens : Main.config.getConfig().getConfigurationSection("Gui.Itens")
                    .getKeys(false)) {

                itens = itens.replaceAll("&", "§");

                for (String lore : Main.config.getConfig().getStringList("Gui.Itens." + itens +".Lore")) {

                    lore = lore.replaceAll("&", "§");


                    gui.setItem(Main.config.getConfig().getInt("Gui.Itens." + itens +".Slot"), //Slot do Item
                            new ItemBuilder(Material.getMaterial(Main.config.getConfig().getString("Gui.Itens." + itens +".Material")), //Material do Item
                                    Main.config.getConfig().getInt("Gui.Itens." + itens +".Quantidade"), //Quantia de Item
                                    (short) Main.config.getConfig().getInt("Gui.Itens." + itens +".Data")) //Data do item
                                    .setName(Main.config.getConfig().getString("Gui.Itens." + itens +".Nome").replace("&", "§")) // Nome do Item
                                    .setLore(lore)//Lore do item
                                    .addEnchant(Enchantment.getByName(Main.config.getConfig().getString("Gui.Itens." + itens +".Encantamento.Efeito")), // O encantamento
                                            Main.config.getConfig().getInt("Gui.Itens." + itens +".Encantamento.Nivel")) //Nivel do Encatamento
                                    .build());

                    p.openInventory(gui);
                }
            }
    }


        return false;
    }
}
