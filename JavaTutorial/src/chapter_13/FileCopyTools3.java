/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyTools3 {
    /**
     * 基于字符缓冲流实现文件复制
     * 
     * @param source 源文件
     * @param destination 目标文件
     */
    public static void copyFile(String source, String destination) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        long start = 0;
        long end = 0;

        System.out.println("start copy...");
        start = System.currentTimeMillis();

        try {
            br = new BufferedReader(new FileReader(source));
            bw = new BufferedWriter(new FileWriter(destination));

            String temp = "";

            while ((temp = br.readLine()) != null) {
                bw.write(temp);
                bw.newLine();
            }
            bw.flush();

            end = System.currentTimeMillis();
            System.out.println("finish copy, totally cost " + (end-start)/1000.0 + "s");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        copyFile("FileCopyTools3.java", "test_copy.txt");
    }
}
