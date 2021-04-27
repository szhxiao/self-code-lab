
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 数组
 */
public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int[] numbers = new int[10];
        x = in.nextInt();
        while (x != -1) {
            if (x >= 0 && x <= 9) {
                numbers[x]++;
            }
            x = in.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }
    }
}

/**
 * output:
 *
 */