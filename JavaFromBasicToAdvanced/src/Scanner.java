
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 输入Scanner
 */
public class Scanner {
    public static void main(String[] args) {
        System.out.println("中文");
        Scanner in = new Scanner(System.in);
        System.out.println("echo: " + in.nextLine());
    }
}

/**
 * output: 中文 hello 你好 echo: hello 你好
 */