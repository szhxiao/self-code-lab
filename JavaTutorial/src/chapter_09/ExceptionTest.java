
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Date;

/**
 * 测试Exception
 */

public class ExceptionTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // System.out.println("before exception");
        // int i = 1 / 0;
        // System.out.println("after exception");

        System.out.println("before exception");
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after exception");

    }
}

/**
 * output:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * ExceptionTest.main(ExceptionTest.java:24)
 */