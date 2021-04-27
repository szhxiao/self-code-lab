/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates the Exception methods.
 */

public class ExceptionMethods {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace(): " );
            e.printStackTrace(System.out);
        }
    }
}

/**
 * output:
 * Caught Exception
 * getMessage(): My Exception
 * getLocalizedMessage(): My Exception
 * toString(): java.lang.Exception: My Exception
 * printStackTrace(): 
 * java.lang.Exception: My Exception
 * 	at ExceptionMethods.main(ExceptionMethods.java:21)
 */
