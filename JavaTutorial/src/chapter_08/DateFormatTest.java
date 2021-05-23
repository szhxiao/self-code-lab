/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 测试时间对象和字符串互相转化
 * DateFormat
 * SimpleDateFormat
 */

public class DateFormatTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        // 将字符串转为Date对象
        Date d1 = df.parse("19771-3-10 10:40:52");
        System.out.println(d1.getTime());

        // 将Date对象转成字符串
        Date d2 = new Date(1000L * 3600 * 23);
        String str = df.format(d2);
        System.out.println(str);

        DateFormat df2 = new SimpleDateFormat("今年第w周");
        System.out.println(df2.format(d2));
    }
}

/**
 * output:
 * 
 */