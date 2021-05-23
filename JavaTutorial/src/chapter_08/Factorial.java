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

public class Factorial {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", d2 - d1);
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

/**
 * output:
 * 
 */