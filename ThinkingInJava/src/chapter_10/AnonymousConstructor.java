/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates creating a constructor 
 * for an anonymous inner class.
 */

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initialing constructor");
            }

            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

/**
 * output:
 * Base constructor, i = 47
 * Inside instance initialing constructor
 * In anonymous f()
 */