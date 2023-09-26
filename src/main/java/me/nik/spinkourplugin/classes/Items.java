package me.nik.spinkourplugin.classes;

import me.nik.spinkourplugin.SpinkourPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;

public class Items {

    SpinkourPlugin plugin;

    public Items(SpinkourPlugin instance) {
        this.plugin = instance;
    }

    public static ItemStack infoBook() {
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta = (BookMeta) book.getItemMeta();

        bookMeta.setAuthor("nik9094");
        bookMeta.setTitle("§ESpin§9kour §AInfo");

        ArrayList<String> pages = new ArrayList<>();
        pages.add(0, "Placeholder info");
        pages.add(1, "Placeholder info 2");
        pages.add(2, "Plugin made by nik9094");

        bookMeta.setPages(pages);
        book.setItemMeta(bookMeta);
        return book;
    }
}
