/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import static net.mindview.util.Print.*;

/**
 * {@code PrintTest}
 * This program demonstrates using 
 * the static printing methods in Print.java
 */
public class PrintTest {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        println("Available from now on!");
        println(100);
        println(100L);
        println(3.1415926);
    }
}

/**
 * output:
 * Available from now on!
 * 100
 * 100
 * 3.1415926
 */