/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack;
        stack = new Stack<>();
        while (in.hasNextInt()) {
            stack.push(in.nextInt());
        }

        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/**
 * output:
 *
 */