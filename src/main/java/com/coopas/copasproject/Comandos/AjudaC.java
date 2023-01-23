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
            sender.sendMessage("    §a- Gm §r| Alterar modo de jogo.");
            sender.sendMessage("    §a- Gui §r| Abre um menu.");
            sender.sendMessage("    §a- Manutenção §r| Ativar ou desativar a manutenção.");
            sender.sendMessage(" ");

        }
        return false;
    }
}
