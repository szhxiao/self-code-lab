/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Unsupported operations in Java containers.
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(subList);

        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll(): " + e);
        }

        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll(): " + e);
        }

        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear(): " + e);
        }

        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add(): " + e);
        }

        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll(): " + e);
        }

        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove(): " + e);
        }

        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<>(list));
        test("Array.asList()", list);
        test("unmodifiableList()", 
            Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}

/**
 * output:
 * --- Modifiable Copy ---
 * --- Array.asList() ---
 * retainAll(): java.lang.UnsupportedOperationException: remove
 * removeAll(): java.lang.UnsupportedOperationException: remove
 * clear(): java.lang.UnsupportedOperationException
 * add(): java.lang.UnsupportedOperationException
 * addAll(): java.lang.UnsupportedOperationException
 * remove(): java.lang.UnsupportedOperationException: remove
 * --- unmodifiableList() ---
 * retainAll(): java.lang.UnsupportedOperationException
 * removeAll(): java.lang.UnsupportedOperationException
 * clear(): java.lang.UnsupportedOperationException
 * add(): java.lang.UnsupportedOperationException
 * addAll(): java.lang.UnsupportedOperationException
 * remove(): java.lang.UnsupportedOperationException
 * List.set(): java.lang.UnsupportedOperationException
 */