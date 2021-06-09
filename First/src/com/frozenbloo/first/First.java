package com.frozenbloo.first;

import com.frozenbloo.first.commands.FirstCommands;
import com.frozenbloo.first.events.FirstEvents;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class First extends JavaPlugin {

    @Override
    public void onEnable() {
        FirstCommands commands = new FirstCommands();
        getServer().getPluginManager().registerEvents(new FirstEvents(), this);
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getCommand("op").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[First]: Plugin is Enabled!");
    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[First]: Plugin is Disabled!");
    }

}
