package com.coopas.copasproject.Eventos;

import com.coopas.copasproject.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PuloE implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
    Player p = e.getPlayer();
    if (p.getLocation().add(0, -1, 0).getBlock().getType().equals(Material.getMaterial(Main.config.getConfig().getString("Boost.Bloco")))) {

        p.setVelocity(p.getVelocity().multiply(2).setY(Main.config.getConfig().getInt("Boost.Quantia")));

    }


    }

}
