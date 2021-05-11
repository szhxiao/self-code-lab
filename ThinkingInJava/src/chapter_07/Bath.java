/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * Constructor initialization with composition
 */

class Soap {
    private String s;

    /**
     * Soap Constructor
     */
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    // Initializing at point of definition
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    /**
     * Bath Constructor
     */
    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    // Instance initialization
    {i = 47;}

    /**
     * method toString
     *
     * @return 
     */
    public String toString() {
        // Delayed initialization
        if (s4 == null) {
            s4 = "Joy";
        }
        return
            "s1 = " + s1 + "\n" +
            "s2 = " + s2 + "\n" +
            "s3 = " + s3 + "\n" +
            "s4 = " + s4 + "\n" +
            "i = " + i + "\n" +
            "toy = " + toy + "\n" +
            "castille = " + castille;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

/**
 * Inside Bath()
 * Soap()
 * s1 = Happy
 * s2 = Happy
 * s3 = Joy
 * s4 = Joy
 * i = 47
 * toy = 3.14
 * castille = Constructed
 */
