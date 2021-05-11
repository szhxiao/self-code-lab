/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates composition for code reuse.
 */

class WaterSource {
    private String s;
    /**
     * WaterSource constructor
     */
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    /**
     * method toString()
     * @return  s
     */
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    /**
     * method toString()
     * @return 
     */
    public String toString() {
        return
            "valve1 = " + valve1 + "  " +
            "valve2 = " + valve2 + "  " +
            "valve3 = " + valve3 + "  " +
            "valve4 = " + valve4 + "\n" +
            "i = " + i + "  " + "f = " + f + "  " +
            "source = " + source;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

/**
 * output:
 * WaterSource()
 * valve1 = null  valve2 = null  valve3 = null  valve4 = null
 * i = 0  f = 0.0  source = Constructed
 */