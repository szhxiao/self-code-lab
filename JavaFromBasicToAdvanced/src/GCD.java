
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 最大公约数 辗转相除法 1.如果b=0，计算结束，a就是最大公约数 2.否则，计算a除以b的余数，让a等于b，b等于余数 3.回到第一步
 */
public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int oa = a;
        int ob = b;
        while (b != 0) {
            int r = a % b;
            System.out.println("a = " + a + ", b = " + b + ", r = " + r);
            a = b;
            b = r;
        }
        System.out.println(oa + "和" + ob + "的最大公约数为：" + a);
    }
}

/**
 * output:
 *
 */