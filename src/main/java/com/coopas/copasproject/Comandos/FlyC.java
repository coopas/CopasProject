package com.coopas.copasproject.Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("Fly")) {
            if (p.hasPermission("cp.fly")){
                if (p.getAllowFlight() == true) {
                p.setAllowFlight(false);
                p.sendMessage(" §c - O seu modo de voo foi desativado!");
                } else {
                        if (p.getAllowFlight() == false) {
                        p.setAllowFlight(true);
                        p.sendMessage(" §a - O seu modo de voo foi ativado!");
                    }
                }

            } else {
                p.sendMessage(" - §cVocê não possui permissão suficiente para usar o comando!");
            }
        }



        return false;
    }
}
