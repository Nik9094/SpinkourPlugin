package me.nik.spinkourplugin.classes;

import me.nik.spinkourplugin.SpinkourPlugin;
import me.nik.spinkourplugin.classes.Courses;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Messages {

    SpinkourPlugin plugin;
    public String prefix = "§0§L[§ESPIN§9KOUR§0§L] §F";

    public Messages(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    public void sendStartMessage(Player player, String courseName) {
        ChatColor courseColor = Courses.courseColors.get(courseName);
        player.sendMessage(prefix + player.getName() + " joined " + courseColor + courseName + "§F.");
    }
}