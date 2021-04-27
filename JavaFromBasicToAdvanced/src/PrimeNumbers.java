
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
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        for (int n = 2; n < 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

    }
}

/**
 * output:
 *
 */