/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.HashSet;

/**
 * Provides a client for reading in a sequence of words 
 * from standard input and printing each word,
 * removing any duplicates.
 */
public class Dedup {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (!set.contains(key)) {
                set.add(key);
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }
}

/**
 * command:
 * javac Dedup.java
 * java Dedup < tinyTale.txt
 * 
 * output:
 * it was the best of times worst age wisdom foolishness 
 * epoch belief incredulity season light darkness spring 
 * hope winter despair 
 */