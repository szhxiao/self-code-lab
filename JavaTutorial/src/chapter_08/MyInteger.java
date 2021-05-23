/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 定义一个包装类
 * 基本功能: 1.将基本数据转换成MyInteger对象
 *          2.将MyInteger对象转换成数字
 *          3.缓存处理
 */
public class MyInteger {

    private int value;
    private static MyInteger[] cache = new MyInteger[256];

    public static final int LOW = -128;
    public static final int HIGH = 127;

    static {
        // [-128~127]
        for(int i = LOW; i <= HIGH; i++) {
            cache[i+128] = new MyInteger(i);
        }
    }

    public static MyInteger valueOf(int i) {
        if(i >= LOW && i <= HIGH) {
            return cache[i+128];
        }
        return new MyInteger(i);
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    private MyInteger(int i) {
        this.value = i;
    }
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        MyInteger m = MyInteger.valueOf(30);
        System.out.println(m);
    }
}

/**
 * output:
 * 
 */