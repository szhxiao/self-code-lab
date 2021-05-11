/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates rethrowing a different object
 * from the one that was caught.
 */

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (Exception e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }

    }
}

/**
 * output:
 * originating the exception in f()
 * Caught in inner try, e.printStackTrace()
 * OneException: thrown from f()
 * 	at RethrowNew.f(RethrowNew.java:28)
 * 	at RethrowNew.main(RethrowNew.java:39)
 * Caught in outer try, e.printStackTrace()
 * TwoException: from inner try
 * 	at RethrowNew.main(RethrowNew.java:43)
 */
