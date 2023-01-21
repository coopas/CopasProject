package com.coopas.copasproject;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a>>> Plugin [ Copas Project ] Iniciado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");

    }

    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§c>>> Plugin [ Copas Project ] Finalizado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");

    }
}
