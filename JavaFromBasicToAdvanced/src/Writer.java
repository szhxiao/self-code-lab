
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 文件流
 */
public class Writer {
    public static void main(String[] args) {
        System.out.println("Data Input/Output");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) i;
        }

        try {
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"))));
            int i = 123456;
            out.println(i);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

/**
 * output:
 *
 */