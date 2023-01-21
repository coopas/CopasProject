package com.coopas.copasproject.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AjudaC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("Ajuda")) {

            sender.sendMessage(" ");
            sender.sendMessage("    §l§aCopasProject | Comandos do Plugin.");
            sender.sendMessage("");
            sender.sendMessage("    §a- Fly §r| Ativar ou desativar o modo de voo.");
            sender.sendMessage(" ");

        }

        return false;
    }
}
