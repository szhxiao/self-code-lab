/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates the full process of initialization.
 */

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");
    
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

/**
 * output:
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * Beetle constructor
 * i = 9, j = 0
 * Beetle.k initialized
 * k = 47
 * j = 39
 */

