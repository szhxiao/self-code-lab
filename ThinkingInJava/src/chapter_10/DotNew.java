
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 *
 */

public class DotNew {
    public class Inner {
        Inner() {
            System.out.println("Inner constructor");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

/*
output:
Inner constructor
*/
