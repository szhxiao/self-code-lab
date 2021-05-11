/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class MultidimensionalPrimitiveArray {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));
    }
}

/**
 * output:
 * [[1, 2, 3], [4, 5, 6]]
 */