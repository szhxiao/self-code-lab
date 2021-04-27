/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates returning an instance of an anonymous inner class.
 */

public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }

}
