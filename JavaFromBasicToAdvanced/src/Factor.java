
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 整数分解
 */
public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int i = 1;
        int factor = 1;
        // while (i <= n) {
        // factor *= i;
        // i++;
        // }
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        System.out.println(n + "! = " + factor);
    }
}

/**
 * output:
 *
 */