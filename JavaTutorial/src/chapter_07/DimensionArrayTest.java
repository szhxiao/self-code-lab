/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Arrays;

/**
 * 测试多维数组
 */

public class DimensionArrayTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[] {40, 50};
        a[1] = new int[] {10, 15, 20};
        a[2] = new int[] {90, 100};

        System.out.println(a[1][2]);

        int[][] b = {
            {20, 30, 40},
            {50, 20},
            {100, 200, 500}
        };
        System.out.println(b[2][0]);
    }
}

