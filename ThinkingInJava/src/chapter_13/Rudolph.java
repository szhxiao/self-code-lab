/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Arrays;

/**
 *
 */
public class Rudolph {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for (String pattern : new String[] {"Rudolph",
            "[rR]udolph", "[rR][aeiou][a-z]ol.*","R.*"}) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}

/**
 * output:
 * true
 * true
 * true
 * true
 */