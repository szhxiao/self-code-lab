
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 字符串
 */
public class StringTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String("hello ");
        System.out.println(s + "world");

        String str;
        str = in.nextLine();
        System.out.println(str);
        System.out.println(str.equals("bye"));
    }
}

/**
 * output:
 *
 */