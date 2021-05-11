/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Random;

/**
 * {@code Bool}
 * This program demonstrates relational and logical operators.
 */
public class Bool {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }
}

/**
 * output:
 * i = 58
 * j = 55
 * i > j is true
 * i < j is false
 * i >= j is true
 * i <= j is false
 * i == j is false
 * i != j is true
 * (i < 10) && (j < 10) is false
 * (i < 10) || (j < 10) is false
 */