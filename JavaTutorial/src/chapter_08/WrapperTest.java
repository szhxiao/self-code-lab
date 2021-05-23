/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试包装类
 */

public class WrapperTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 基本数据类型转换为对象
        Integer i = new Integer(4);     // 不建议使用
        Integer i2 = Integer.valueOf(20);

        // 包装类对象转为基本数据类型
        double d = i2.doubleValue();

        // 字符串转化成Integer对象
        Integer i3 = Integer.valueOf("234");
        Integer i4 = Integer.parseInt("345");

        // 包装类对象轩为对象
        String str = i4.toString();

        // 一些常用的常量
        System.out.println(Integer.MAX_VALUE);

        // 自动装箱
        Integer i5 = 300;   // Integer i5 = Integer.valueOf(300)

        // 自动拆箱
        int b = i5;         // i5.intValue();


        // 包装类的缓存问题
        Integer d1 = 4000;
        Integer d2 = 4000;
        // 当数字在[-128~127]之间时，返回缓存数组中的某个元素
        Integer d3 = 123;
        Integer d4 = 123;
        System.out.println(d1 == d2);
        System.out.println(d3 == d4);
        System.out.println(d1.equals(d2));
    }
}

/**
 * output:
 * 
 */