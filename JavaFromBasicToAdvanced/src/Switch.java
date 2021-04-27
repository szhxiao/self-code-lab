
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * switch-case语句
 */
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();

        switch (type) {
        case 1:
        case 2:
            System.out.println("你好");
            break;
        case 3:
            System.out.println("晚上好");
        case 4:
            System.out.println("再见");
            break;
        default:
            System.out.println("啊，什么啊？");
            break;
        }
    }
}

/**
 * output:
 *
 */