
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 字符串操作
 */
public class StringOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "abc";
        String s2 = "abcd";
        // compareTo()
        System.out.println("(abc).compareTo(abcd) = " + s1.compareTo(s2));

        // length()
        System.out.println(s2.length());

        // charAt()
        System.out.println(s1.charAt(2));

        // substring
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(0, 2));

        // toUpperCase
        System.out.println(s2.toUpperCase());

        String s3 = "0123A56389汉字";
        int loc = s3.indexOf('3');
        System.out.println(s3.indexOf('3', loc + 1));
    }
}

/**
 * output:
 *
 */