
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 */
public class Database {

    // private ArrayList<CD> listCD = new ArrayList<>();
    // private ArrayList<DVD> listDVD = new ArrayList<>();
    private ArrayList<Item> listItem = new ArrayList<>();

    // public void add(CD cd) {
    // listCD.add(cd);
    // }

    // public void add(DVD dvd) {
    // listDVD.add(dvd);
    // }
    public void add(Item item) {
        listItem.add(item);
    }

    // public void list() {
    // for(CD cd : listCD) {
    // cd.print();
    // }
    // }

    // public void list() {
    // for(DVD dvd : listDVD) {
    // dvd.print();
    // }
    // }

    public void list() {
        for (Item item : listItem) {
            item.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("abc", "abc", 4, 60, "..."));
        db.add(new CD("def", "def", 4, 60, "..."));
        db.add(new DVD("yyy ", "def", 60, "..."));
        db.add(new DVD("xxx", "def", 60, "..."));
        db.add(new VideoGame("ddd", 10, true, "...", 5));
        db.list();
    }
}

/**
 * output:
 *
 */