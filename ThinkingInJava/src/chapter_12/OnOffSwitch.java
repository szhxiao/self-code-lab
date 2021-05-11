/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates .
 */

class OnOffException1 extends Exception {}

class OnOffException2 extends Exception {}

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() 
        throws  OnOffException1, OnOffException2 {}

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}

/**
 * output:
 * on
 * off
 */