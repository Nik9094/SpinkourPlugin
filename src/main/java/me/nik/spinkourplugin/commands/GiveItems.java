package me.nik.spinkourplugin.commands;

import me.nik.spinkourplugin.classes.Items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveItems implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(Items.deathArrow());
            player.getInventory().addItem(Items.invisBone());
            player.getInventory().addItem(Items.beatBlock());
            player.getInventory().addItem(Items.skipHoe());
            player.getInventory().addItem(Items.restartSword());
            player.getInventory().addItem(Items.leaveLeaves());
        }
        return true;
    }
}
