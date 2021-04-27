/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Arrays;

/**
 * 测试冒泡排序
 */

public class BubbleSortTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
        int temp = 0;

        for (int j = 0; j < values.length-1; j++) {
            for (int i = 0; i < values.length-1-j; i++) {
                if (values[i] > values[i+1]) {
                    temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                }
                System.out.println(Arrays.toString(values));
            }
            System.out.println("**********");
        }

        
    }
}

