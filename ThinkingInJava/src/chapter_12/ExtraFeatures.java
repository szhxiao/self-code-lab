/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates further embellishment of exception classes.
 */

import java.util.logging.*;
import java.io.*;

class MyException2 extends Exception {
    private int x;

    public MyException2() {}

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated in h()", 27);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            f();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch(MyException2 e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
}

/**
 * output:
 * Throwing MyException2 from f()
 * MyException2: Detail Message: 0 null
 * 	at ExtraFeatures.f(ExtraFeatures.java:42)
 * 	at ExtraFeatures.main(ExtraFeatures.java:62)
 * Throwing MyException2 from g()
 * MyException2: Detail Message: 0 Originated in g()
 * 	at ExtraFeatures.g(ExtraFeatures.java:47)
 * 	at ExtraFeatures.main(ExtraFeatures.java:68)
 * Throwing MyException2 from h()
 * MyException2: Detail Message: 27 Originated in h()
 * 	at ExtraFeatures.h(ExtraFeatures.java:52)
 * 	at ExtraFeatures.main(ExtraFeatures.java:74)
 * e.val() = 27
 */
