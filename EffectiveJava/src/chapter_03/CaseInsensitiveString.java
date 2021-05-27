/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see http://java.sun.com/docs/books/effective
 */

public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    // 1st equals()
    // @Override
    // public boolean equals(Object o) {
    //     if (o instanceof CaseInsensitiveString) {
    //         return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
    //     }
    //     if (o instanceof String) {
    //         return s.equalsIgnoreCase((String) o);
    //     }
    //     return false;
    // }

    // 2nd equals()
    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    /**
     * Unit test
     * 
     * @param args the command-line
     */
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(cis + ".equals(" + s + ") = " + cis.equals(s));
        System.out.println(s + ".equals(" + cis + ") = " + s.equals(cis));

    }
}

/**
 * output:
 * 1st equals()
 * CaseInsensitiveString@2f92e0f4.equals(polish) = true
 * polish.equals(CaseInsensitiveString@2f92e0f4) = false
 * 
 * 2nd equals()
 * CaseInsensitiveString@2f92e0f4.equals(polish) = false
 * polish.equals(CaseInsensitiveString@2f92e0f4) = false
 */