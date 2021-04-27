
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 异常
 */
public class ArrayIndex {
    public static void f() {
        int[] b = new int[10];
        b[10] = 10;
        System.out.println("hello in f()");
    }

    public static void main(String[] args) {
        // int[] a = new int[10];
        // int index;
        // Scanner in = new Scanner(System.in);
        // index = in.nextInt();
        try {
            // a[index] = 10;
            f();
            System.out.println("hello");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main()");
    }
}

/**
 * output:
 *
 */