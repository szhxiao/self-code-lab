/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Arrays;

/**
 * 测试Arrays工具类
 */

public class ArraysTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int[] a = {100, 30, 45, 60, 90};
        System.out.println(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

