/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 *
 */

public class SimpleCollection {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i< 10; i++) {
            c.add(i);
        }

        for(Integer i : c) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

/**
 * output:
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 */
