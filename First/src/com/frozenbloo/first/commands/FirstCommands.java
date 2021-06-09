package com.frozenbloo.first.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class FirstCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command!");
            return true; }
        Player player = (Player) sender;


        // /heal
        if (cmd.getName().equalsIgnoreCase("heal")) {
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage("§e§l(!) §eYou have been healed!");
            return true;
        }

        if (cmd.getName().equalsIgnoreCase("feed")) {
            player.setFoodLevel(20);
            player.sendMessage("§e§l(!) §eYou have been fed!");
        }

        if (cmd.getName().equalsIgnoreCase("op")) {
            player.getWorld().strikeLightning(player.getLocation());
            player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER);
            player.sendMessage("§e§l(!) §4Only CircusCow can use this command!");
        }



        return true;
    }
}
