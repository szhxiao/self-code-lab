
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 文件流
 */
public class DataOutput {
    public static void main(String[] args) {
        System.out.println("Data Input/Output");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte) i;
        }

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
            int i = 123456;
            out.writeInt(i);
            // out.write(buf);
            out.close();

            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j = in.readInt();
            System.out.println(j);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/**
 * output:
 *
 */