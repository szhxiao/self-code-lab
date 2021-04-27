/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code AutoInc}
 * This program demonstrates the ++ and -- operators.
 */
public class AutoInc {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("++i = " + ++i);
        System.out.println("i++ = " + i++);

        System.out.println("i = " + i);
        System.out.println("--i = " + --i);
        System.out.println("i-- = " + i--);

        System.out.println("i = " + i);
    }
}

/**
 * output:
 * i = 1
 * ++i = 2
 * i++ = 2
 * i = 3
 * --i = 2
 * i-- = 2
 * i = 1
 */