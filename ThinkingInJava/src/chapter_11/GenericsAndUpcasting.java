/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;

/**
 * This program demonstrates 
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class GrannySmith extends Apple {}

class Gala extends Apple {}

class Fuji extends Apple {}

class Braeburn extends Apple {}

public class GenericsAndUpcasting {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}

/**
 * output:
 * GrannySmith@3cd1a2f1
 * Gala@2f0e140b
 * Fuji@7440e464
 * Braeburn@49476842
 */
