
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 分段函数
 */
public class PiecewiseFunction {
    public static void main(String[] args) {
        int x;
        int f;

        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x < 0) {
            f = -1;
        } else if (x == 0) {
            f = 0;
        } else {
            f = 2 * x;
        }
        System.out.println("f = " + f);
    }
}

/**
 * output:
 *
 */