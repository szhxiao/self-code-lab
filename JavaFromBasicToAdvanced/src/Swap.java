
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 
 */
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 5;
        int b = 6;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(5, 6);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void swap(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;
    }

    public static int factor(int i) {
        if (i == 1) {
            return i;
        }
        return i * factor(i - 1);
    }
}

/**
 * output:
 *
 */