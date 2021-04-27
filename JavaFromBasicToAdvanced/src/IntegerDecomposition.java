
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
public class IntegerDecomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int digit;
        int result = 0;
        number = in.nextInt();
        do {
            digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        } while (number > 0);
        System.out.println(result);
    }
}

/**
 * output:
 *
 */