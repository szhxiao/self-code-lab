/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code PassObject}
 * This program demonstrates passing objects to methods.
 */

class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1--> x.c: " + x.c);
        f(x);
        System.out.println("2--> x.c: " + x.c);
    }
}

/**
 * output:
 * 1--> x.c: a
 * 2--> x.c: z
 */