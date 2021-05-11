/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


/**
 * This program demonstrates constroctor.
 * 构造器示例
 */
public class Rock {

    Rock() {
        System.out.println("Rock ");
    }

    Rock(int i) {
        System.out.print("Rock " + i + " ");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Rock rock = new Rock();
        for (int i = 0; i < 5; i++) {
            new Rock(i);
        }
    }
}

/*
output:
Rock 
Rock 0 Rock 1 Rock 2 Rock 3 Rock 4
 */