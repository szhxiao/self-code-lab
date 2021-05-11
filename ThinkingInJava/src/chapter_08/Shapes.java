/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates polymorphism in Java.
 */

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for(Shape shp : s) {
            shp.draw();
        }
    }
}

/**
 * output:
 * Triangle.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Square.draw()
 * Triangle.draw()
 * Circle.draw()
 */