/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class AssemblingMultidimensionalArrays {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer[3];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}

/**
 * output:
 * [[0, 0, 0], [0, 1, 2], [0, 2, 4]]
 */