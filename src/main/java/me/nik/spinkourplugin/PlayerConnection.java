package me.nik.spinkourplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerConnection implements Listener {

    SpinkourPlugin plugin;

    public PlayerConnection(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {
            event.setJoinMessage("§4A new prey has arrived... §E" + player.getName());
            plugin.messages.sendFirstJoinMessage(player);
        } else {
            event.setJoinMessage("§E" + player.getName() + " §4likes to suffer...");
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        for (Player players : Bukkit.getOnlinePlayers()) {
            players.sendMessage("§E" + player + "§Fdecided they had enough and left.");
        }
    }
}
