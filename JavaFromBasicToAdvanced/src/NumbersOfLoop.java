
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 循环执行次数
 */
public class NumbersOfLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 100;
        while (count > 0) {

            System.out.println(count);
            count = count - 1;
        }

        System.out.println(count);
        System.out.println("发射！");
    }
}

/**
 * output:
 *
 */