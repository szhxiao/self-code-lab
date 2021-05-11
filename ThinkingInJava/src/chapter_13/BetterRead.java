/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Scanner;

/**
 *
 */
public class BetterRead {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What's your name");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What is your favorite double?");
        System.out.println("input: <age> <double>");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("My favorite double is %f.", favorite / 2);
    }
}

/**
 * output:
 * What is your name?
 * Sir Robin of Camelot
 * How old are you? What is your favorite double?
 * input: <age> <double>
 * 22 
 * 1.61803
 * Hi Sir Robin of Camelot.
 * In 5 years you will be 27.
 * My favorite double is 0.809015.
 */