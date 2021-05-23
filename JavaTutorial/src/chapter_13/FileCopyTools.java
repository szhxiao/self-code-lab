/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTools {
    /**
     * 文件复制
     * 
     * @param args
     */
    public static void copyFile(String source, String destination) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        long start = 0;
        long end = 0;

        System.out.println("start copy...");
        start = System.currentTimeMillis();
        try {
            bis = new BufferedInputStream(new FileInputStream(source));
            bos = new BufferedOutputStream(new FileOutputStream(destination));

            int temp = 0;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bos.flush();

            end = System.currentTimeMillis();
            System.out.println("finish copy, totally costs " + (end-start)/1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }

                if (bos != null) {
                    bos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        copyFile("index.png", "index_copy.png");
    }
}
