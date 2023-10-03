package me.nik.spinkourplugin.classes;

import me.nik.spinkourplugin.SpinkourPlugin;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class Messages {

    SpinkourPlugin plugin;
    public String prefix = "§0§L[§ESPIN§9KOUR§0§L] §F";     //[SPINKOUR}

    public Messages(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    public void sendFirstJoinMessage(Player player) {
        player.sendMessage(prefix + "Welcome to §ESpintown§F... er... I mean §ESpin§9kour§F.\n" +
                            "This server has solo & CoOp courses with varying degrees of difficulty.\n" +
                            "Since this is your first time here, I'll explain some things about the server.\n");
        BukkitRunnable message2Runnable = new BukkitRunnable() {
            @Override
            public void run() {
                player.sendMessage(prefix + "Use §A/info §Fto know more about the courses and server.\n" +
                                    "Play at your own risk... This won't be easy.");
            }
        };
        BukkitRunnable message1Runnable = new BukkitRunnable() {

            @Override
            public void run() {
                player.sendMessage(prefix + "Use §A/party create [name] §Fto make a party with a given name.\n" +
                        "You can join a party with §A/party join [name] §Fand disband it with §A/party disband [name]§F.\n" +
                        "The party leader controls everything. Skips, checkpoints, leaving. Once the leader reaches a checkpoint, everyone else does.\n" +
                        "While in a party, you cannot join CoOp courses.");
                message2Runnable.runTaskLater(plugin, 20*5);
            }
        };
        message1Runnable.runTaskLater(plugin, 20*5);

    }

    public void sendStartMessage(Player player, String courseName) {
        ChatColor courseColor = Courses.courseColors.get(courseName);
        player.sendMessage(prefix + player.getName() + " joined " + courseColor + courseName + "§F.");      //Flubber joined Yellow.
    }
}