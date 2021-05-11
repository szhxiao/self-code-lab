/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code Precedence} 
 * This program demonstrates operators.
 */
public class Precedence {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y -2)/(2 + z);
        System.out.println("a = " + a + ", b = " + b);
    }
}

/**
 * output:
 * a = 5, b = 1
 */