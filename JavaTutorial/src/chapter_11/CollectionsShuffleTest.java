/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsShuffleTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("javascript");
        list.add("python");
        list.add("c");

        for (String str : list) {
            System.out.println(str);
        }

        Collections.shuffle(list);
        System.out.println("------ After shuffle -----");
        System.out.println(list);
    }
}
