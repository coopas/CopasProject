package com.coopas.copasproject;

import com.coopas.copasproject.Comandos.AjudaC;
import com.coopas.copasproject.Comandos.FlyC;
import com.coopas.copasproject.Comandos.GmC;
import com.coopas.copasproject.Utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    public static Main plugin;
    public static Config config;
    public static Config mensagens;
    public static Config permissoes;



    public void onEnable() {

        plugin = this;

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Copas Project ] Iniciando!");
        Bukkit.getConsoleSender().sendMessage(" ");
        comandos();
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Comandos ] Iniciados com sucesso!");
        arquivos();
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Arquivos ] Iniciados com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a>>> [ Copas Project ] Iniciado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");
    }


    public void comandos() {

        getCommand("ajuda").setExecutor(new AjudaC());
        getCommand("fly").setExecutor(new FlyC());
        getCommand("gm").setExecutor(new GmC());
    }

    public void arquivos() {

        config = new Config(this, "config.yml");
        mensagens = new Config(this, "Opcoes/mensagens.yml");
        permissoes = new Config(this, "Opcoes/permissoes.yml");

        config.saveDefaultConfig();
        mensagens.saveDefaultConfig();
        permissoes.saveDefaultConfig();

        createFile(this, "Opcoes/", false);

    }

    public void createFile(Main main, String fileName, boolean isFile) {
        try {
            File file = new File(main.getDataFolder() + File.separator + fileName);
            if (isFile) file.createNewFile();
            else if (!file.exists()) file.mkdirs();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }


    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§c>>> [ Copas Project ] Finalizado com sucesso!");
        Bukkit.getConsoleSender().sendMessage(" ");

    }
}
