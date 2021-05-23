/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("javascript");
        list.add("python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // String value = iterator.next();
            // System.out.println(value);
            System.out.println(iterator.next());
        }
    }
}
