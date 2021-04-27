
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 变量
 */
public class Variable {
    public static void main(String[] args) {
        System.out.println("中文");
        Scanner in = new Scanner(System.in);
        // Java是强类型语言，所有变量使用之前必须声明
        int amount;
        int price;
        amount = in.nextInt();
        price = in.nextInt();
        System.out.println(amount + " - " + price + " = " + (amount - price));
    }
}

/**
 * output: 中文 33 100 - 33 = 67
 */