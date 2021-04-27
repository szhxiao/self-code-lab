
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 正整数的位数
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        do {
            number = number / 10;
            count += 1;
            System.out.println("number = " + number + ", count = " + count);
        } while (number > 0);

        System.out.println(count);
    }
}

/**
 * test: 变量表格 | number | count | |--------|-------| | 352 | 0 | | 35 | 1 | | 3 |
 * 2 | | 0 | 3 |
 *
 * output:
 *
 */