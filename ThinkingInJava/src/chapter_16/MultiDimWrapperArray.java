/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * Multidimensional arrays of "Wrapper" objects.
 */
public class MultiDimWrapperArray {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Integer[][] a1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        Double[][][] a2 = {
            { {1.1, 2.2}, {3.3, 4.4} },
            { {5.5, 6.6}, {7.7, 8.8} },
            { {9.9, 1.2}, {2.3, 3.4} }
        };

        String[][] a3 = {
            { "The", "Quick", "Sly", "Fox"},
            { "Jumped", "Over"},
            { "The", "Lazy", "Brown", "Dog", "and", "friend"}
        };

        System.out.println("a1: " + Arrays.deepToString(a1));
        System.out.println("a2: " + Arrays.deepToString(a2));
        System.out.println("a3: " + Arrays.deepToString(a3));
    }
}

/**
 * output:
 * a1: [[1, 2, 3], [4, 5, 6]]
 * a2: [[[1.1, 2.2], [3.3, 4.4]], [[5.5, 6.6], [7.7, 8.8]], [[9.9, 1.2], [2.3, 3.4]]]
 * a3: [[The, Quick, Sly, Fox], [Jumped, Over], [The, Lazy, Brown, Dog, and, friend]]
 */