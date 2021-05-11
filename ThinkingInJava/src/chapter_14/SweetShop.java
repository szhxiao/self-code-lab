/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum") ;
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");

        try {
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find Gum'");
        }
        System.out.println("After Class.forName(\"Gum\")");

        new Cookie();
        System.out.println("After creating Cookie");
    }
}

/**
 * output:
 * inside main
 * Loading Candy
 * After creating Candy
 * Loading Gum
 * After Class.forName("Gum")
 * Loading Cookie
 * After creating Cookie
 */