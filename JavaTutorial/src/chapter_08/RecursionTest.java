import java.util.Random;

/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试递归
 */

public class RecursionTest {
    public static int num = 10;

    public static void a() {
        num--;
        System.out.println("funcion in a() " + num);
        if (num > 0) {
            a();
        }
    }

    public static void b() {
        System.out.println("function in b()");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        a();
    }
}

/**
 * output:
 * 
 */