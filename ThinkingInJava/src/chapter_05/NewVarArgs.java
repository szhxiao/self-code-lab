import java.util.Arrays;

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using array syntax
 * to create variable argument lists.
 */

class A {}

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        printArray(new Object[] {
            new Integer(47),
            new Float(3.14),
            new Double(12.12)
        });

        printArray(new Object[] {
            "one", "two", "three"
        });

        printArray(new Object[] {
            new A(),
            new A(),
            new A()
        });

        printArray((Object[])new Integer[] {1, 2, 3, 4});
        printArray();
    }
}

/*
output:
47 3.14 12.12 
one two three 
A@7d4793a8 A@449b2d27 A@5479e3f 
1 2 3 4 

 */