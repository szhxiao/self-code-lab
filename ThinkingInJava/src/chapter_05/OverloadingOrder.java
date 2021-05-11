/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * Class {@code OverloadingOrder}
 * 重载方法区分示例
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        f("String first", 12);
        f(2019, "Int first");
    }
}

/*
output:
String: String first, int: 12
int: 2019, String: Int first
 */