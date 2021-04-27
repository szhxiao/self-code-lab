/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates the finally clause.
 */

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2) {
                    break;
                }
            }
        }
    }
}

/**
 * output:
 * ThreeException
 * In finally clause
 * No exception
 * In finally clause
 */