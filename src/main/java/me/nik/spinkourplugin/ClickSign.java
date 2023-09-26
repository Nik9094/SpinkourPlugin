package me.nik.spinkourplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickSign implements Listener {

    SpinkourPlugin plugin;

    public ClickSign(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onSignInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (event.getClickedBlock() != null) {
            if (event.getClickedBlock().getType().equals(Material.OAK_WALL_SIGN) || event.getClickedBlock().getType().equals(Material.OAK_SIGN)) {
                Sign clickedSign = (Sign) event.getClickedBlock().getState();
                if (clickedSign.getLine(0).contains("course")) {        //still a workaround
                    String courseFromSign = ChatColor.stripColor(clickedSign.getLine(2).replaceAll("\\s", ""));
                    String lowercaseCourse = courseFromSign.toLowerCase();
                    player.sendMessage(lowercaseCourse);
                    player.teleport(getCourseStart(lowercaseCourse));
                }
            }
        }

    }

    public Location getCourseStart(String courseName) {
        Location loc = SpinkourPlugin.courseLocations.get(courseName);
        Bukkit.getLogger().info(loc.getWorld().getName());
        return loc;
    }
}
