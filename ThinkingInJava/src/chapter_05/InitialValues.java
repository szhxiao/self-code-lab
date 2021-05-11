/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates default initial values.
 */
public class InitialValues {
    boolean t;                  // 布尔类型
    char c;                     // 字符类型
    byte b;                     // byte
    short s;                    // short
    int i;                      // int
    long l;                     // long
    float f;                    // float
    double d;                   // double

    InitialValues reference;    // 引用类型

    /**
     * 显示不同类型的初始值
     *
     * method printInitialValues
     */

    void printInitialValues() {
        System.out.println("Data type          Initial value");
        System.out.println("boolean            " + t);
        System.out.println("char               [" + c + "]");
        System.out.println("byte               " + b);
        System.out.println("short              " + s);
        System.out.println("int                " + i);
        System.out.println("long               " + l);
        System.out.println("float              " + f);
        System.out.println("double             " + d);
        System.out.println("reference          " + reference);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }
}

/*
output:
Data type          Initial value
boolean            false
char               []
byte               0
short              0
int                0
long               0
float              0.0
double             0.0
reference          null
 */
