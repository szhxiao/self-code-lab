/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamBuffed2Test {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        long start = 0;
        long end = 0;

        try {
            // 创建文件字节输入流
            fis = new FileInputStream("index.png");
            // 创建文件字节输出流
            fos = new FileOutputStream("test_buff2.jpg");
            // 创建缓冲区
            byte[] buff = new byte[fis.available()];

            start = System.currentTimeMillis();

            fis.read(buff);
            fos.write(buff);
            // 将数据从内存写入到磁盘
            fos.flush();

            end = System.currentTimeMillis();
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
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("read and write costs " + (end-start)/1000.0 + "s");
    }
}
