/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates {@code this} key word.
 */
public class Leaf {
    int i =0;
    /**
     * 通过this关键字返回当前对象的引用
     * @return 
     */
    Leaf increment() {
        i++;
        return this;
    }
    
    void print() {
        System.out.println("i = " + i);
    }
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}

/*
output:
i = 3
 */