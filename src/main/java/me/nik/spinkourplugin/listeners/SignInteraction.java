package me.nik.spinkourplugin.listeners;

import me.nik.spinkourplugin.classes.Courses;
import me.nik.spinkourplugin.SpinkourPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignInteraction implements Listener {

    SpinkourPlugin plugin;
    Courses courses = new Courses();


    public SignInteraction(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getClickedBlock() != null) {
                if (event.getClickedBlock().getType().equals(Material.OAK_WALL_SIGN) || event.getClickedBlock().getType().equals(Material.OAK_SIGN)) {
                    Sign clickedSign = (Sign) event.getClickedBlock().getState();
                    if (clickedSign.getLine(0).contains("course")) {        //still a workaround
                        String courseFromSign = ChatColor.stripColor(clickedSign.getLine(2).replaceAll("\\s", "")).toLowerCase();
                        courseStart(player, courseFromSign);
                    }
                }
            }
        }
    }

    public void courseStart(Player player, String courseName) {
        plugin.messages.sendStartMessage(player, courseName);
        player.teleport(courses.getCourseStart(courseName));
    }
}
