
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.IOException;
import java.util.Scanner;

/**
 * 流
 */
public class Read {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        byte[] buffer = new byte[1024];
        int len = System.in.read(buffer);
        String s = new String(buffer, 0, len);
        System.out.println("Get " + len + " bytes");
        System.out.println(s);
        System.out.println("s.length() = " + s.length());
    }
}

/**
 * output:
 *
 */