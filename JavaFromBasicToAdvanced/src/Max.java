
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 判断两个数中较大的
 */

public class Max {
    public static void main(String[] args) {
        int max;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x > y) {
            if (x > z) {
                max = x;
            } else {
                max = z;
            }
        } else {
            if (y > z) {
                max = y;
            } else {
                max = z;
            }
        }

        System.out.println(max);
    }
}

/**
 * output:
 *
 */