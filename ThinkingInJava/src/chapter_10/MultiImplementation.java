/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using concrete or abstract classes,
 * inner classes ar the only way to produce the effect of 
 * "multiple implementation inheritance."
 */

class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

/**
 * output:
 * 
 */
