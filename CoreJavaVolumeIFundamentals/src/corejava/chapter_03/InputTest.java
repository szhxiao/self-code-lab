/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Scanner;

/**
 * This program demonstrates system input 
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.println("What is your name?");
        String name = in.nextLine();

        // get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        // display output
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
