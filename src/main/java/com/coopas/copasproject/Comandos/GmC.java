package com.coopas.copasproject.Comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmC implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("Gm")) {
            if (p.hasPermission("cp.gm")) {

                if (args.length == 0) {
                    p.sendMessage("     §cVocê precisa especificar o modo de jogo!");
                    p.sendMessage("     §cUse /gm [ 0 , 1 , 2 , 3 ]");
                    p.sendMessage("     ");
                    p.sendMessage("     §c0 | Sobrevivência");
                    p.sendMessage("     §c1 | Criativo");
                    p.sendMessage("     §c2 | Aventura");
                    p.sendMessage("     §c3 | Espectador");

                } else {
                    if (args[0].equalsIgnoreCase("0")) {

                        p.sendMessage("     §a O seu modo de jogo foi definido para Sobrevivência");
                        p.setGameMode(GameMode.SURVIVAL);

                    }
                    if (args[0].equalsIgnoreCase("1")) {

                        p.sendMessage("     §a O seu modo de jogo foi definido para Criativo");
                        p.setGameMode(GameMode.CREATIVE);

                    }
                    if (args[0].equalsIgnoreCase("2")) {

                        p.sendMessage("     §a O seu modo de jogo foi definido para Aventura");
                        p.setGameMode(GameMode.ADVENTURE);

                    }
                    if (args[0].equalsIgnoreCase("3")) {

                        p.sendMessage("     §a O seu modo de jogo foi definido para Espectador");
                        p.setGameMode(GameMode.SPECTATOR);

                    }

                }
            } else {
                p.sendMessage(" - §cVocê não possui permissão suficiente para usar o comando!");
            }
        }

        return false;
    }
}
