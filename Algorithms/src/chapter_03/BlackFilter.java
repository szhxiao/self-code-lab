/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.HashSet;

public class BlackFilter {
    private BlackFilter() {
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        In in = new In(args[0]);
        while (!in.isEmpty()) {
            String word = in.readString();
            set.add(word);
        }

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (!set.contains(word)) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}

/**
 * command:
 * javac BlackFilter.java
 * java BlackFilter list.txt < tinyTale.txt
 * 
 * output:
 * best times worst times 
 * age wisdom age foolishness 
 * epoch belief epoch incredulity 
 * season light season darkness 
 * spring hope winter despair 
 */