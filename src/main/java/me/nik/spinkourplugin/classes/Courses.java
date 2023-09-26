package me.nik.spinkourplugin.classes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.HashMap;

public class Courses {

    public static HashMap<String, Location> courseLocations = new HashMap<>();
    public static HashMap<String, ChatColor> courseColors = new HashMap<>();

    public void initCourses() {
        setLocations();
        setColors();
    }
    public void setLocations() {
        World world = Bukkit.getServer().getWorld("Spinkour 1_15_2");
        courseLocations.put("yellow", new Location(world, 16, 59, 10));
        courseLocations.put("blue", new Location(world, 16, 59, 14));
        courseLocations.put("red", new Location(world, 16, 59, 18));
    }

    public void setColors() {
        courseColors.put("yellow", ChatColor.YELLOW);
        courseColors.put("blue", ChatColor.BLUE);
        courseColors.put("red", ChatColor.RED);
    }

    public Location getCourseStart(String courseName) {
        return courseLocations.get(courseName);
    }
}
