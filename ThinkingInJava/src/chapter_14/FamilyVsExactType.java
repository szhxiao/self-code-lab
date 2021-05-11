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

class Base {}
class Derived extends Base {}

public class FamilyVsExactType {
    static void test(Object x) {
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Derived " + (x instanceof Derived));
        System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " + (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class) " + (x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class) " + (x.getClass().equals(Derived.class)));
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        test(new Base());
        System.out.println();
        test(new Derived());
    }
}

/**
 * output:
 * Testing x of type class Base
 * x instanceof Base true
 * x instanceof Derived false
 * Base.isInstance(x) true
 * Derived.isInstance(x) false
 * x.getClass() == Base.class true
 * x.getClass() == Derived.class false
 * x.getClass().equals(Base.class) true
 * x.getClass().equals(Derived.class) false
 * 
 * Testing x of type class Derived
 * x instanceof Base true
 * x instanceof Derived true
 * Base.isInstance(x) true
 * Derived.isInstance(x) true
 * x.getClass() == Base.class false
 * x.getClass() == Derived.class true
 * x.getClass().equals(Base.class) false
 * x.getClass().equals(Derived.class) true
 */