/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


/**
 * This program demonstrates inheriting an inner class.
 */

class WithInner {
    class Inner {}
}

public class InheritInner extends WithInner.Inner {
    
    InheritInner(WithInner wi) {
        wi.super();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

/**
 * output:
 * 
 */
