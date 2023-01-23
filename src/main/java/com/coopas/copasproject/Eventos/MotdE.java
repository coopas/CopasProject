package com.coopas.copasproject.Eventos;

import com.coopas.copasproject.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MotdE implements Listener {

    @EventHandler
    public void onMotd(ServerListPingEvent e) {

        if (Bukkit.hasWhitelist()) {

            e.setMotd(Main.config.getConfig().getString("MOTD.Manutencao")
                    .replace("&", "§"));
            e.setMaxPlayers(e.getNumPlayers() + 1);

        } else {

            e.setMotd(Main.config.getConfig().getString("MOTD.Aberto")
                    .replace("&", "§"));

            e.setMaxPlayers(Main.config.getConfig().getInt("MOTD.MaxPlayers"));

        }

    }

}
