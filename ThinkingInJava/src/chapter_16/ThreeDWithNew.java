/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class ThreeDWithNew {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[][][] a = new int[2][2][4];
        System.out.println(Arrays.deepToString(a));
    }
}

/**
 * output:
 * [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
 */