/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试String类
 */

public class StringTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 获取系统剩余内存空间
        long memory1 = Runtime.getRuntime().freeMemory();
        // 获取系统当前时间
        long time1 = System.currentTimeMillis();

        String str1 = "core java";
        String str2 = "Core Java";

        /**
         * charAt()
         * 提取指定位置的字符
         */
        System.out.println(str1.charAt(3));

        /**
         * length()
         * 返回字符串长度
         */
        System.out.println(str2.length());

        /**
         * indexOf(str)
         * 字符串中是否包含str
         */
        System.out.println(str1.indexOf("Java"));
        System.out.println(str2.indexOf("Java"));

        /**
         * replace()
         * 替换
         */
        System.out.println(str1.replace(" ", "&"));

        /**
         * substring()
         * 截取字符串
         */
        System.out.println(str2.substring(4));

        /**
         * trim()
         * 去除字符串中的空格
         */
        System.out.println(" Hello World ".trim());


        // 获取系统剩余内存空间
        long memory2 = Runtime.getRuntime().freeMemory();
        // 获取系统当前时间
        long time2 = System.currentTimeMillis();

        System.out.println("程序占用内存：" + (memory1 - memory2));
        System.out.println("程序运行时间：" + (time2 - time1));
    }
}

/**
 * output:
 * 
 */