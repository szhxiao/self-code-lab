
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 1. f(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n 2. f(n) = 1 - 1/2 + 1/3 - 1/4 + ...
 * + 1/n
 */
public class FSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            sum += sign * 1.0 / i;
            sign = -sign;
        }
        System.out.printf("fsum = %.2f", sum);
        System.out.println();
    }
}

/**
 * output:
 *
 */