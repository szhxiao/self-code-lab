/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Things we can do with all Collections.
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello world");
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        // Make an array from the List:
        Object[] array = c.toArray();

        // Make a String array from the List:
        String[] str = c.toArray(new String[0]);

        // Find max elements
        System.out.println("Collections.max(c) = " + Collections.max(c));

        // Find min elements
        System.out.println("Collections.min(c) = " + Collections.min(c));

        // Add a Collection to another Collection
        Collection<String> c2 = new ArrayList<>();
        c2.add("thinking in java");
        c.addAll(c2);
        System.out.println(c);

        // Remove elements
        c.remove(c2);
        System.out.println(c);

        // Is an element in this Collection?
        String val = "hello";
        System.out.println("c.contains(" + val + ") = " + c.contains(val));
        
        // Is a Collection in this Collection?
        System.out.println("c.containsAll(c2) = " + c.containsAll(c2));

    }
}

/**
 * output:
 * [hello world, ten, eleven]
 * Collections.max(c) = ten
 * Collections.min(c) = eleven
 * [hello world, ten, eleven, thinking in java]
 * [hello world, ten, eleven, thinking in java]
 * c.contains(hello) = false
 * c.containsAll(c2) = true
 */