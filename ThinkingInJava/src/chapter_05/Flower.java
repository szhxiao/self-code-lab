/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates call constructor 
 * by {@code this} key word.
 */
public class Flower {
    private int petalCount = 0;
    private String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " 
            + petalCount);
    }

    Flower(String str) {
        System.out.println("Constructor w/ String arg only, s = " +str);
        s = str;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hello", 12);
        System.out.println("default constructor (no args)");
    }

    public void printPetalCount() {
        System.out.println("petalCount = " + petalCount 
            + " s = " + s);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Flower f = new Flower();
        f.printPetalCount();
    }
}

/*
output:
Constructor w/ int arg only, petalCount = 12
String & int args
default constructor (no args)
petalCount = 12 s = hello
 */