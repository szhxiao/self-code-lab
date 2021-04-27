/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Random;

/**
 * This program demonstrates 
 */

public class TestRandvals {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println(Randvals.RANDOM_INT);
        System.out.println(Randvals.RANDOM_LONG);
        System.out.println(Randvals.RANDOM_FLOAT);
        System.out.println(Randvals.RANDOM_DOUBLE);
    }
}

/**
 * output:
 * 8
 * -32032247016559954
 * 0.534122
 * 1.6020656493302599
 */