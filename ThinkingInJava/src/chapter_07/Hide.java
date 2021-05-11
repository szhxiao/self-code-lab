/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates overloading a base-class method name
 * in a derived class does not hide the base-class versions.
 */

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0F;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(2.0F);
        b.doh(new Milhouse());
    }
}

/**
 * output:
 * doh(float)
 * doh(char)
 * doh(float)
 * doh(Milhouse)
 */
