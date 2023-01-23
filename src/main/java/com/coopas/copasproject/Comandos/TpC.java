package com.coopas.copasproject.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("t")) {
            if(args.length == 0) {
                p.sendMessage("§c    - Especifique o Jogador!");
                return false;
            } else {
                if ( args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    if (target == null) {
                        p.sendMessage("     §c" + args[0] + " Não é um jogador valido!");
                        return false;
                    } else {
                        if (p == target) {
                            p.sendMessage("§c    - Você não pode teleportar pra si mesmo!");
                            return false;
                        }
                    }
                p.teleport(target);
                    p.sendMessage("&a   - Você foi teleportado para" + target);


                }
            }
        }


        return false;
    }
}
