/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates inheritance syntax & properties
 */

/**
 * base-class Cleanser
 */
class Cleanser {
    private String s = "Cleanser";

    /**
     * method append()
     * @param a the String to append
     */
    public void append(String a) {
        s += a;
    }

    /**
     * method dilute()
     */
    public void dilute() {
        append(" dilute()");
    }

    /**
     * method apply()
     */
    public void apply() {
        append(" apply()");
    }

    /**
     * method scrub()
     */
    public void scrub() {
        append(" scrub()");
    }

    /**
     * mthod toString
     *
     * @return 
     */
    public String toString() {
        return s;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

/**
 * child-class
 */
public class Detergent extends Cleanser {
    /**
     * change method scrub()
     */
    public void scrub() {
        append(" Detergent.scrub()");
        // call base-class version
        super.scrub();
    }

    /**
     * add method foam()
     */
    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

/**
 * output:
 * Cleanser dilute() apply() Detergent.scrub() scrub() foam()
 * Testing base class:
 * Cleanser dilute() apply() scrub()
 */
