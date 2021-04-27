
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 文件流
 */
public class FileOutput {
    public static void main(String[] args) throws IOException {
        System.out.println("File Input/Output");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) i;
        }

        FileOutputStream out = new FileOutputStream("out.dat");
        out.write(buf);
        out.close();
    }
}

/**
 * output:
 *
 */