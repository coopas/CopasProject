package com.coopas.copasproject.Eventos;

import com.coopas.copasproject.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiE implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

    if (e.getInventory().getTitle().equalsIgnoreCase(Main.config.getConfig().getString("Gui.Nome").replace("&", "§"))) {
        for (String itens : Main.config.getConfig().getConfigurationSection("Gui.Itens").getKeys(false)) {

            if(e.getSlot() == Main.config.getConfig().getInt("Gui.Itens." + itens +".Slot")) {
                e.setCancelled(true);

            }
        }
    }
    }
}
