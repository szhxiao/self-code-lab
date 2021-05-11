/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code StringOperators}
 * This program demonstrates + and += operators.
 */
public class StringOperators {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println("" + x);
    }
}

/**
 * output:
 * x, y, z 012
 * 0 x, y, z 
 * x, y, z (summed) = 3
 * 0
 */