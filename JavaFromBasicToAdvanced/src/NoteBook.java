
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.ArrayList;

/**
 * 记事本
 */
public class NoteBook {
    private ArrayList<String> notes = new ArrayList<>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        String[] a = new String[notes.size()];
        // for(int i = 0; i < notes.size(); i++) {
        // a[i] = notes.get(i);
        // }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.add("first");
        nb.add("second");
        nb.add("third", 1);
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(0));
        System.out.println(nb.getNote(1));
        nb.removeNote(1);
        String[] a = nb.list();
        for (String s : a) {
            System.out.println(s);
        }
    }
}

/**
 * output:
 *
 */