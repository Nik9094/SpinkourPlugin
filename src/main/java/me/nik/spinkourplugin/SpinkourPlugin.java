package me.nik.spinkourplugin;

import me.nik.spinkourplugin.classes.Courses;
import me.nik.spinkourplugin.classes.Messages;
import me.nik.spinkourplugin.commands.GiveItems;
import me.nik.spinkourplugin.commands.InfoCommand;
import me.nik.spinkourplugin.listeners.SignInteraction;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpinkourPlugin extends JavaPlugin {

    public Courses courses = new Courses();
    public Messages messages = new Messages(this);
    @Override
    public void onEnable() {
        getLogger().info("Enabled §eSpin§9kour §fplugin...");
        getServer().getPluginManager().registerEvents(new SignInteraction(this), this);
        getServer().getPluginManager().registerEvents(new PlayerConnection(this), this);
        getCommand("info").setExecutor(new InfoCommand());
        getCommand("items").setExecutor(new GiveItems());
        courses.initCourses();
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled Spinkour plugin.");
    }

}
