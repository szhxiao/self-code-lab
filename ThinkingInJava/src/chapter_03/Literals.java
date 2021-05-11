/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code Literals}
 * This program demonstrates 
 */
public class Literals {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177;
        System.out.println("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff;
        System.out.println("c: " + Integer.toBinaryString(i3));

        byte b = 0x7f;
        System.out.println("b: " + Integer.toBinaryString(b));

        short s = 0x7fff;
        System.out.println("s: " + Integer.toBinaryString(s));

        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
    }
}

/**
 * output:
 * i1: 101111
 * i2: 101111
 * i3: 1111111
 * c: 1111111
 * b: 1111111
 * s: 111111111111111
 */