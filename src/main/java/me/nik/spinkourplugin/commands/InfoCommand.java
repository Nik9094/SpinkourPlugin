package me.nik.spinkourplugin.commands;

import me.nik.spinkourplugin.classes.Items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack infoBook = Items.infoBook();
            player.openBook(infoBook);
        }
        return true;
    }
}
