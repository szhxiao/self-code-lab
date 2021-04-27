
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 方法(函数)
 */
public class Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (m == 1) {
            m = 2;
        }
        int cnt = 0;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                cnt++;
                sum += i;
            }
        }
        System.out.println("在" + m + "和" + n + "之间有" + cnt + "个素数，总和为：" + sum);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

/**
 * output:
 *
 */