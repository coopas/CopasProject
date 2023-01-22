package com.coopas.copasproject.Comandos;

import com.coopas.copasproject.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MotdC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("Manutencao")) {
            if (sender.hasPermission(Main.permissoes.getConfig().getString("Permissoes.Manutencao"))) {

                if(args.length == 0) {
                    sender.sendMessage(Main.mensagens.getConfig().getString("Manutencao.Erro1")
                            .replace("&", "§"));
                } else {
                    if(args[0].equalsIgnoreCase("on")) {
                        Bukkit.setWhitelist(true);
                        sender.sendMessage(Main.mensagens.getConfig().getString("Manutencao.Ativado")
                                .replace("&", "§"));
                    } else {
                        if(args[0].equalsIgnoreCase("off")) {
                            Bukkit.setWhitelist(false);
                            sender.sendMessage(Main.mensagens.getConfig().getString("Manutencao.Desativado")
                                    .replace("&", "§"));
                        }
                    }
                }

            } else {
                sender.sendMessage(Main.mensagens.getConfig().getString("Erros.SemPerm"));
            }
        }

        return false;
    }
}
