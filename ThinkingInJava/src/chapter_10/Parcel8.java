/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates calling the base-class constructor.
 */

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

}
