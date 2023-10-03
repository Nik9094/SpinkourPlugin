package me.nik.spinkourplugin.classes;

import me.nik.spinkourplugin.SpinkourPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

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
        pages.add(0, "§1§L     :PARTIES:     \n" + "§2§L- §0When in a party,\n§Aeveryone §0follows the leader.\n" + "If the leader reaches a checkpoint, everyone can teleport to it.\n" + "The same goes for other actions.");
        pages.add(1, "§1§L     :COMMANDS:     \n\n" + "§A/party create [name] §0- Create a party.\n" + "§A/party disband [name] §0- Disband the party.\n" + "§A/party join [name] \n§0- Join a party.");
        pages.add(2, "§1§L      :SKIPS:      \n" + "§2§L- §0If you feel a checkpoint is too hard, use a skip. You are not timed, but you will be graded based on your skips used.\n" + "Use too many, and I will mock you for life.");
        pages.add(3, "Plugin made by nik9094. I hope this works...");

        bookMeta.setPages(pages);
        book.setItemMeta(bookMeta);
        return book;
    }

    public static ItemStack deathArrow() {
        ItemStack arrow = new ItemStack(Material.ARROW);
        ItemMeta arrowMeta = arrow.getItemMeta();

        ArrayList<String> arrowLore = new ArrayList<>();
        arrowLore.add("Right click to die instantly.");
        arrowMeta.setLore(arrowLore);
        arrowMeta.setDisplayName("§cInstant Death");

        arrow.setItemMeta(arrowMeta);
        return arrow;
    }

    public static ItemStack invisBone() {
        ItemStack bone = new ItemStack(Material.BONE);
        ItemMeta boneMeta = bone.getItemMeta();

        ArrayList<String> boneLore = new ArrayList<>();
        boneLore.add("Right click to have some peace.");
        boneMeta.setLore(boneLore);
        boneMeta.setDisplayName("§bTurn Players Invisible");

        bone.setItemMeta(boneMeta);
        return bone;
    }

    public static ItemStack beatBlock() {
        ItemStack noteBlock = new ItemStack(Material.NOTE_BLOCK);
        ItemMeta noteMeta = noteBlock.getItemMeta();

        ArrayList<String> noteLore = new ArrayList<>();
        noteLore.add("Right click to play real music.");
        noteMeta.setLore(noteLore);
        noteMeta.setDisplayName("§6Sick Beats");

        noteBlock.setItemMeta(noteMeta);
        return noteBlock;
    }

    public static ItemStack skipHoe() {
        ItemStack hoe = new ItemStack(Material.GOLDEN_HOE);
        ItemMeta hoeMeta = hoe.getItemMeta();

        ArrayList<String> hoeLore = new ArrayList<>();
        hoeLore.add("Right click to lose clout.");
        hoeMeta.setLore(hoeLore);
        hoeMeta.setDisplayName("§ESkip");

        hoe.setItemMeta(hoeMeta);
        return hoe;
    }

    public static ItemStack restartSword() {
        ItemStack sword = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();

        ArrayList<String> swordLore = new ArrayList<>();
        swordLore.add("Right click to go back to the start.");
        swordMeta.setLore(swordLore);
        swordMeta.setDisplayName("§DRestart Course");

        sword.setItemMeta(swordMeta);
        return sword;
    }

    public static ItemStack leaveLeaves() {
        ItemStack leaves = new ItemStack(Material.OAK_LEAVES);
        ItemMeta leavesMeta = leaves.getItemMeta();

        ArrayList<String> leavesLore = new ArrayList<>();
        leavesLore.add("Right click to be made fun of.");
        leavesMeta.setLore(leavesLore);
        leavesMeta.setDisplayName("§4Leave Course");

        leaves.setItemMeta(leavesMeta);
        return leaves;
    }
}
