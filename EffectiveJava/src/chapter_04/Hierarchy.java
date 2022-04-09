/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see
 */

abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }
}

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Hierarchy {
    
}
