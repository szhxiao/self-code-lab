
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Date;

/**
 * 测试Date类
 */

public class DateTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        long a = Long.MAX_VALUE / (1000L * 3600 * 24 * 365);
        System.out.println(a);

        // 当前时刻的毫秒数
        long nowNum = System.currentTimeMillis();
        System.out.println(nowNum);

        // 没有传入参数代表当前时刻
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());

        // 传入参数代表特定时刻
        Date d2 = new Date(1000L * 3600 * 24 * 365 * 250);
        System.out.println(d2);
    }
}

/**
 * output:
 * 
 */