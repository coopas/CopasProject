package com.coopas.copasproject.Eventos;

import com.coopas.copasproject.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EntradaE implements Listener {

    @EventHandler
    public void aoEntrar(PlayerJoinEvent e) {

        Player p = e.getPlayer();
        e.setJoinMessage(Main.mensagens.getConfig().getString("Avisos.Entrada")
                .replace("&", "§")
                .replace("{player}", p.getName()));

    }



    @EventHandler
    public void aoSair(PlayerQuitEvent e) {

        Player p = e.getPlayer();
        e.setQuitMessage(Main.mensagens.getConfig().getString("Avisos.Saida")
                .replace("&", "§")
                .replace("{player}", p.getName()));

    }

}
