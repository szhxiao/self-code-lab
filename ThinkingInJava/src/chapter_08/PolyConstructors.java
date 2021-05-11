/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates constructors and polymorphism.
 */

class Glyph {
    void draw() {
        System.out.println("Glyph.draw*");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()") ;
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors extends Glyph {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

/**
 * output:
 * Glyph() before draw()
 * RoundGlyph.draw(), radius = 0
 * Glyph() after draw()
 * RoundGlyph.RoundGlyph(), radius = 5
 */
