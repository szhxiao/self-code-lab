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

public class WithFinally {
    static Switch sw = new Switch();

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}

/**
 * output:
 * on
 * off
 */