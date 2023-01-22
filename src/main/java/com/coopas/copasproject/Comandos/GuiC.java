package com.coopas.copasproject.Comandos;

import com.coopas.copasproject.Main;
import com.coopas.copasproject.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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

        gui.setItem(Main.config.getConfig().getInt("Gui.Itens.Diamante.Slot"),
                new ItemBuilder(Material.getMaterial(Main.config.getConfig().getString("Gui.Itens.Diamante.Item")))
                        .build());

        p.openInventory(gui);
    }


        return false;
    }
}
