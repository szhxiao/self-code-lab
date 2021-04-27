
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 素数
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.println(n + "不是素数, i = " + i);
                break;
            }
        }

        if (isPrime == true) {
            System.out.println(n + "是素数");
        } else {
            System.out.println(n + "不是素数");
        }
    }
}

/**
 * output:
 *
 */