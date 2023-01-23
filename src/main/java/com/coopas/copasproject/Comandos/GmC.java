package com.coopas.copasproject.Comandos;

import com.coopas.copasproject.Main;
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
            if (p.hasPermission(Main.permissoes.getConfig().getString("Permissoes.Gm"))) {

                if (args.length == 0) {
                    p.sendMessage(" ");
                    p.sendMessage("     §cVocê precisa especificar o modo de jogo!");
                    p.sendMessage("     §cUse /gm [ 0 , 1 , 2 , 3 ]");
                    p.sendMessage("     ");
                    p.sendMessage("     §c0 | Sobrevivência");
                    p.sendMessage("     §c1 | Criativo");
                    p.sendMessage("     §c2 | Aventura");
                    p.sendMessage("     §c3 | Espectador");
                    p.sendMessage(" ");


                } else {
                    if (args[0].equalsIgnoreCase("0")) {

                        p.sendMessage(Main.mensagens.getConfig().getString("Gm.0")
                                .replace("&", "§")
                                .replace("{player}", p.getName()));
                        p.setGameMode(GameMode.SURVIVAL);

                    } else {
                        if (args[0].equalsIgnoreCase("1")) {

                            p.sendMessage(Main.mensagens.getConfig().getString("Gm.1")
                                    .replace("&", "§")
                                    .replace("{player}", p.getName()));
                            p.setGameMode(GameMode.CREATIVE);

                        } else {
                            if (args[0].equalsIgnoreCase("2")) {

                                p.sendMessage(Main.mensagens.getConfig().getString("Gm.2")
                                        .replace("&", "§")
                                        .replace("{player}", p.getName()));
                                p.setGameMode(GameMode.ADVENTURE);

                            } else {
                                if (args[0].equalsIgnoreCase("3")) {

                                    p.sendMessage(Main.mensagens.getConfig().getString("Gm.3")
                                            .replace("&", "§")
                                            .replace("{player}", p.getName()));
                                    p.setGameMode(GameMode.SPECTATOR);

                                } else {
                                    if (args.length == 1) {
                                        p.sendMessage("     §cVocê precisa especificar o modo de jogo!");
                                        p.sendMessage("     §cUse /gm [ 0 , 1 , 2 , 3 ]");
                                        p.sendMessage("     ");
                                        p.sendMessage("     §c0 | Sobrevivência");
                                        p.sendMessage("     §c1 | Criativo");
                                        p.sendMessage("     §c2 | Aventura");
                                        p.sendMessage("     §c3 | Espectador");
                                    }
                                }
                            }
                        }
                    }


                }
            } else {
                p.sendMessage(Main.mensagens.getConfig().getString("Erros.SemPerm"));
            }
        }

        return false;
    }
}
