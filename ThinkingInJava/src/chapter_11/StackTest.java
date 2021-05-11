/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

import java.util.Stack;

public class StackTest {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" ")){
            stack.push(s);
        }

        while(!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
        System.out.println();
    }
}

/**
 * output:
 * fleas 
 * has 
 * dog 
 * My
 */
