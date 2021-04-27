/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code Circle} extends from {@code Shape}
 */

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()") ;
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.erase();
    }
}

/**
 * output:
 * Circle.draw()
 * Circle.erase()
 */