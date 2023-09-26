package me.nik.spinkourplugin;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class SpinkourPlugin extends JavaPlugin {

    public static HashMap<String, Location> courseLocations = new HashMap<>();
    @Override
    public void onEnable() {
        getLogger().info("Enabled Spinkour plugin...");
        getServer().getPluginManager().registerEvents(new ClickSign(this), this);
        setLocations(getServer().getWorld("Spinkour 1_15_2"));
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled Spinkour plugin.");
    }

    public void setLocations(World world) {
        Location yellow = new Location(world, 16, 59, 10);
        courseLocations.put("yellow", yellow);
        //courseLocations.put("blue", new Location(world, 16, 59, 14));
        //courseLocations.put("red", new Location(world, 16, 59, 18));
    }
}
