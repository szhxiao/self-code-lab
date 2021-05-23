/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTools2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        long start = 0;
        long end = 0;

        System.out.println("start copy...");
        start = System.currentTimeMillis();

        try {
            fr = new FileReader("data.txt");
            fw = new FileWriter("data_copy.txt");

            // 定义缓冲区
            char[] buffer = new char[1024];

            int temp = 0;

            while ((temp = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, temp);
            }
            fw.flush();

            end = System.currentTimeMillis();
            System.out.println("finish copy, costs " + (end-start)/1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }

                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
