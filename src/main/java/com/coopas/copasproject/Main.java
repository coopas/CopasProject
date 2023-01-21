package com.coopas.copasproject;

import com.coopas.copasproject.Comandos.AjudaC;
import com.coopas.copasproject.Comandos.FlyC;
import com.coopas.copasproject.Comandos.GmC;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Copas Project ] Iniciando!");
        Bukkit.getConsoleSender().sendMessage(" ");
        comandos();
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Comandos ] Iniciados com sucesso!");
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Copas Project ] Iniciado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");
    }

    public void comandos() {

        getCommand("ajuda").setExecutor(new AjudaC());
        getCommand("fly").setExecutor(new FlyC());
        getCommand("gm").setExecutor(new GmC());
    }


    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§c>>> [ Copas Project ] Finalizado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");

    }
}
