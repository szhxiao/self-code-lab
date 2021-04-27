import java.util.Arrays;

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates Array initialization.
 */
public class ArrayInit {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Integer[] a = {
            new Integer(5),
            new Integer(2),
            3,
        };
        Integer[] b = new Integer[] {
            new Integer(8),
            new Integer(9),
            10
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

/*
output:
[5, 2, 3]
[8, 9, 10]
 */