/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试this关键字
 */
public class ThisTest {
    // 类属性
    private int i;
    private double d;
    private String str;

    // 构造方法
    ThisTest() {
        System.out.println("Creating ThisTest Object");
    }
    ThisTest(int i, double d) {
        this.i = i;
        this.d = d;
        System.out.println("Using Constructor ThisTest(int i, double d)");
    }
    ThisTest(int i, double d, String str) {
        this(i, d);
        this.str = str;
        System.out.println("Using Constructor ThisTest(int i, double d, String str)");
    }

    public String toString() {
        return "This Test: i = " + i + ", d = " + d + ", str = " + str;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 创建对象
        ThisTest t1 = new ThisTest();
        System.out.println(t1);
        ThisTest t2 = new ThisTest(1, 2.0);
        System.out.println(t2);
        ThisTest t3 = new ThisTest(3, 4.0, "This");
    }
}

/**
 * output:
 * Creating ThisTest Object
 * This Test: i = 0, d = 0.0, str = null
 * Using Constructor ThisTest(int i, double d)
 * This Test: i = 1, d = 2.0, str = null
 * Using Constructor ThisTest(int i, double d)
 * Using Constructor ThisTest(int i, double d, String str)
 */