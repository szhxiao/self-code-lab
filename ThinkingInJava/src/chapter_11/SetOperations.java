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

public class SetOperations {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println("H: " + set1.contains("H"));
        System.out.println("N: " + set1.contains("N"));

        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2, "H I J K L ".split(" "));
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1: " + set1);
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set2 removed from set1: " + set1);
        Collections.addAll(set1, "X Y X".split(" "));
        System.out.println("'X Y Z ' added to set1: " + set1);
    }
}

/**
 * output:
 * H: true
 * N: false
 * set2 in set1: true
 * set1: [A, B, C, D, E, F, G, I, J, K, L, M]
 * set2 in set1: false
 * set2 removed from set1: [A, B, C, D, E, F, G, M]
 * 'X Y Z ' added to set1: [A, B, C, D, E, F, G, M, X, Y]
 */
