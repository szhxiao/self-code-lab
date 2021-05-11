/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using "instance initialization"
 * to perform construction on an anonymous inner class.
 */

public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget");
                }
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tismania", 101.395F);
    }

}

/**
 * output:
 * Over budget
 */