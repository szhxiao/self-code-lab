/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * Class Bowl
 */
class Bowl {
    /**
     * Bowl Constructor
     * 
     * @param marker 标记
     */
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    /**
     * 显示信息
     *
     * @param marker 标记
     */
    void f1(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

/**
 * Class Table
 */
class Table {
    static Bowl bowl1 = new Bowl(1);

    /**
     * Table Constructor
     */
    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    /**
     * 显示信息
     * @param marker 标记
     */
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

/**
 * Class Cupboard
 */
class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    /**
     * Cupboard Constructor
     */
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    /**
     * 显示信息
     * @param marker 标记
     */
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}


public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();

        table.f2(1);

        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

/*
output:
Bowl(1)
Bowl(2)
Table()
f(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f(2)
f2(1)
f3(1)
 */
