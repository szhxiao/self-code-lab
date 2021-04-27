/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates "Blank" final fields.
 */

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
        System.out.println("Poppet " + i + " constructor");
    }
}

public class BlankFinal {
    
    private final int i = 0;            // initialized final
    private final int j;                // blank final
    private final Poppet p;             // blank final reference

    // Blank finals must be initialized in the constructor
    public BlankFinal() {
        j = 1;                          // initialize blank final
        p = new Poppet(1);              // initialized blank final reference
        System.out.println("Blank Final " + j + " constructor");
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
        System.out.println("Blank Final " + j + " constructor");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

/*
output:
Poppet 1 constructor
Blank Final 1 constructor
Poppet 47 constructor
Blank Final 47 constructor
*/
