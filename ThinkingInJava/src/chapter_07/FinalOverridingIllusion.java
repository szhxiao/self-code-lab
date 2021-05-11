/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates "final" and "private" key words.
 * It only looks like you can override a private or private final method.
 */

class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}


public class FinalOverridingIllusion {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
    }
}

/**
 * output:
 * OverridingPrivate2.f()
 * OverridingPrivate2.g()
 */
