/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates programmatic access to tack trace information.
 */

public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        h();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        f();
        System.out.println("------------------");
        g();
        System.out.println("------------------");
        h();

    }
}

/**
 * output:
 * f
 * main
 * ------------------
 * f
 * g
 * main
 * ------------------
 * Exception in thread "main" java.lang.StackOverflowError
 * 	at WhoCalled.h(WhoCalled.java:29)
 */
