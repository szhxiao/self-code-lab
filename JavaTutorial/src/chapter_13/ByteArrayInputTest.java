/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.ByteArrayInputStream;

public class ByteArrayInputTest {
    public static void main(String[] args) {
        byte[] arr = "abcdefg".getBytes();
        ByteArrayInputStream bis = null;
        StringBuilder sb = new StringBuilder();

        try {
            // 构造方法参数为字节数组，即为数据源
            bis = new ByteArrayInputStream(arr);

            int temp = 0;
            while ((temp = bis.read()) != -1) {
                sb.append((char) temp);
            }
            System.out.println(sb.toString());
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
