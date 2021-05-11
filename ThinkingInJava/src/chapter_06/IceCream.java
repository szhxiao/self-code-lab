/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code IceCream}
 * This program demonstrates "private" key words.
 */
class Sundae {
    private Sundae() {}

    static Sundae makeSundae() {
        System.out.println("Make Sundae");
        return new Sundae();
    }
}

public class IceCream {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // don't work
        // Sundae x = new Sundae();
        Sundae x = Sundae.makeSundae();
    }
}