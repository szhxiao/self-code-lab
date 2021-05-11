/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code Equivalence}
 * This program demonstrates the == and != operators.
 */
public class Equivalence {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println("n1 == n2 : " + (n1 == n2));
        System.out.println("n1 != n2 : " + (n1 != n2));
        System.out.println("n1.equals(n2) : " + n1.equals(n2));
    }
}

/**
 * output:
 * n1 == n2 : false
 * n1 != n2 : true
 * n1.equals(n2) : true
 */