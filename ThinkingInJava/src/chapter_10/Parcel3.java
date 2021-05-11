/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using .new to create instances of inner classes.
 */

public class Parcel3 {
    class Contents {
        private int i = 11;
        
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Contents c = p.new Contents();
        Parcle3.Destination d = p.new Destination("Tasmania");
    }
}

/**
 * output:
 * 
 */