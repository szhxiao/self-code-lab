/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * Class Tree
 * 构造器重载示例
 */
class Tree {
    int height;                 // the height of tree

    /**
     * 无参构造器
     */
    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    /**
     * 重载构造器
     * 
     * @param initialHeight 初始化高度
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * 显示Tree类信息
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * 重载方法
     * 
     * @param s 信息
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * 方法重载示例
 */
public class Overloading {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloading method ");
            System.out.println();
        }
        new Tree();
    }
}

/*
output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
Overloading method : Tree is 0 feet tall

Creating new Tree that is 1 feet tall
Tree is 1 feet tall
Overloading method : Tree is 1 feet tall

Creating new Tree that is 2 feet tall
Tree is 2 feet tall
Overloading method : Tree is 2 feet tall

Creating new Tree that is 3 feet tall
Tree is 3 feet tall
Overloading method : Tree is 3 feet tall

Creating new Tree that is 4 feet tall
Tree is 4 feet tall
Overloading method : Tree is 4 feet tall

Planting a seeding
 */
