/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates an anonymous inner class 
 * that performs initialization.
 */

public class Parcel9 {
    // Argument must be final to use inside anonymous inner class
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            
            public String readLabel() {
                return label;
            }
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tismania");
    }

}
