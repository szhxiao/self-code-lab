/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * Class Window
 */
class Window {
    /**
     * Window类构造器
     *
     * @param marker 标记
     */
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

/**
 * Class House
 */
class House {
    // 在构造器之前初始化
    Window w1 = new Window(1);

    /**
     * House类构造器
     */
    House() {
        System.out.println("House()");
        // 重新初始化w3
        w3 = new Window(33);
    }

    // 在构造器之后初始化
    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}

/**
 * This program demonstrates initialization order.
 */
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}

/*
output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
 */
