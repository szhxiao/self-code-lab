/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.HashSet;

public class WhiteFilter {
    private WhiteFilter() {
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        In in = new In(args[0]);
        while (!in.isEmpty()) {
            set.add(in.readString());
        }
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (set.contains(word)) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
    
}

/**
 * command:
 * javac WhiteFilter.java
 * java WhiteFilter list.txt < tinyTale.txt
 * 
 * output:
 * it was the of it was the of 
 * it was the of it was the of 
 * it was the of it was the of 
 * it was the of it was the of 
 * it was the of it was the of
 */