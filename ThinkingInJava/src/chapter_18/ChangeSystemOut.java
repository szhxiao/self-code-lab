/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.io.PrintWriter;

/**
 * Turns System.out into a PrintWriter
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("hello world");
    }
}

/**
 * output:
 * hello world
 */