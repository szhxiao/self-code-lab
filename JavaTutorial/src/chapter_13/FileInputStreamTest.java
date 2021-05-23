/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建字节输入流
            fis = new FileInputStream("data.txt");
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while ((temp = fis.read()) != -1) {
                System.out.print(temp + " ");
                sb.append((char) temp);
            }
            System.out.println();
            System.out.println(sb.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}