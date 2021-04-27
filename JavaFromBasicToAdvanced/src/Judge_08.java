/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 判断
 */

public class Judge_08 {
    public static void main(String[] args) {
        final int MINOR = 35;

        System.out.print("请输入你的年龄: ");
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        System.out.println("你的年龄是" + age + "岁");

        if (age < MINOR) {
            System.out.println("年轻是美好的，");
        }
        System.out.println("年龄决定了你的精神世界，好好珍惜吧。");
    }
}

/**
 * output:
 *
 */