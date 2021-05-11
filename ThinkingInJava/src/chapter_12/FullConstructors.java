/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

class MyException extends Exception {
    public MyException() {}
    
    public MyException(String msg) {
        super(msg);
    }
}
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            f();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
    }
}

/**
 * output:
 * Throwing MyException from f()
 * MyException
 * 	at FullConstructors.f(FullConstructors.java:23)
 * 	at FullConstructors.main(FullConstructors.java:38)
 * Throwing MyException from g()
 * MyException: Originated in g()
 * 	at FullConstructors.g(FullConstructors.java:28)
 * 	at FullConstructors.main(FullConstructors.java:44)
 */
