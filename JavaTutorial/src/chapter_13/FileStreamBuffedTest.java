/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileStreamBuffedTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        long start = 0;
        long end = 0;

        try {
            // 创建文件字节输入流
            fis = new FileInputStream("index.png");
            // 创建文件字节输出流
            fos = new FileOutputStream("test_buff.jpg");
            // 创建缓冲区
            byte[] buff = new byte[1024];
            int temp = 0;
            start = System.currentTimeMillis();
            while ((temp = fis.read(buff)) != -1) {
                fos.write(buff, 0, temp);
                System.out.println(temp);
            }
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

        System.out.println("read&write costs " + (end-start)/1000.0 + "s");
    }
}
