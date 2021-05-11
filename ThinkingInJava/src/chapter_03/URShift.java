/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


/**
 * {@code URShift}
 * This program demonstrates unsigned right shift.
 */
public class URShift {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1L;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(Integer.toBinaryString(s));

        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));
    }
}

/**
 * output:
 * 11111111111111111111111111111111
 * 1111111111111111111111
 * 1111111111111111111111111111111111111111111111111111111111111111
 * 111111111111111111111111111111111111111111111111111111
 * 11111111111111111111111111111111
 * 11111111111111111111111111111111
 * 11111111111111111111111111111111
 * 11111111111111111111111111111111
 * 11111111111111111111111111111111
 * 1111111111111111111111
 */