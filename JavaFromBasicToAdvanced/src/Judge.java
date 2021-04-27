
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 自动售票机 判断
 */

public class Judge {
    public static void main(String[] args) {
        // 初始化
        Scanner in = new Scanner(System.in);
        // 读入投币金额
        System.out.print("请投币: ");
        int amount = in.nextInt();
        if (amount >= 10) {
            // 打印车票
            System.out.println("******************");
            System.out.println("* Java城际铁路专线 *");
            System.out.println("*   无指定座位票   *");
            System.out.println("*   票价: 10元    *");
            System.out.println("******************");

            // 计算并打印找零
            System.out.println("找零: " + (amount - 10));
        }
    }
}

/**
 * output:
 *
 */