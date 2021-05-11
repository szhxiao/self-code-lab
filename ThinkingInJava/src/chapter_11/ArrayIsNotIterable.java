/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

import java.util.*;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strs = {"A", "B", "C"};
        test(Arrays.asList(strs));
    }
}

/**
 * output:
 * 1 2 3 A B C
 */
