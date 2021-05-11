/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates constructor calling during inheritance.
 */

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

/**
 * output:
 * Art constructor
 * Drawing constructor
 * Cartoon constructor
 */