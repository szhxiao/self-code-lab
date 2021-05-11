/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates direct field access
 * is determined at compile time.
 */

class Super {
    public int field = 0;
    
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + 
            ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + 
            ", sub.getField() = " + sub.getField() 
            + ", sub.getSuperField = " + sub.getSuperField());
    }
}

/**
 * output:
 * sup.field = 0, sup.getField() = 1
 * sub.field = 1, sub.getField() = 1, sub.getSuperField = 0
 */