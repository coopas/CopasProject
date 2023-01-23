package com.coopas.copasproject.Comandos;

import com.coopas.copasproject.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("Fly")) {
            if (p.hasPermission(Main.permissoes.getConfig().getString("Permissoes.Fly"))){
                if (p.getAllowFlight() == true) {
                p.setAllowFlight(false);
                p.sendMessage(Main.mensagens.getConfig().getString("Fly.Desativado")
                        .replace("&", "§")
                        .replace("{player}", p.getName()));
                } else {
                        if (p.getAllowFlight() == false) {
                        p.setAllowFlight(true);
                        p.sendMessage(Main.mensagens.getConfig().getString("Fly.Ativado")
                                .replace("&", "§")
                                .replace("{player}", p.getName()));
                    }
                }

            } else {
                p.sendMessage(Main.mensagens.getConfig().getString("Erros.SemPerm"));
            }
        }



        return false;
    }
}
