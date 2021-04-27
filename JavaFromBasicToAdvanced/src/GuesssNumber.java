
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 猜数游戏 由计算机来想一个数，用户来猜， 用户每输入一个数，告诉它大了还是小了，直到猜中为止
 */
public class GuesssNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // [0,1) --> [0,100) --> [1, 100]
        int number = (int) (Math.random() * 100 + 1);
        int a;
        int count = 0;
        do {
            a = in.nextInt();
            count++;
            if (a > number) {
                System.out.println("偏大");
            } else if (a < number) {
                System.out.println("偏小");
            }
        } while (a != number);
        System.out.println("恭喜你猜对，你猜了" + count + "次");
    }
}

/**
 * output:
 *
 */