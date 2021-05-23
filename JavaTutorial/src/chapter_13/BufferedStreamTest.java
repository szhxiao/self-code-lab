/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        // 测试时间
        long start = 0;
        long end = 0;

        try {
            fis = new FileInputStream("index.png");
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream("test_stream.jpg");
            bos = new BufferedOutputStream(fos);

            // byte数组默认长度是8192

            int temp = 0;

            start = System.currentTimeMillis();

            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bos.flush();
            
            end = System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭流顺序，后开的先关闭
                if (bis != null) {
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("read and write costs " + (end-start)/1000.0 + "s");
    }
}
