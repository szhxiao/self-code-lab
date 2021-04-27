/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates creating my own exceptions.
 */

class SimpleException extends Exception{

}
public class InheritingExceptions {
    public void f()throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch(SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}

/**
 * output:
 * Throw SimpleException from f()
 * Caught it!
 */