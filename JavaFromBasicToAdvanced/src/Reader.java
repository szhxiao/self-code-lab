
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 文件流
 */
public class Reader {
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
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("Reader.java")));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
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