/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;

/**
 * This program demonstrates simple container example 
 * (produces compiler warnings)
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple a : apples) {
            System.out.println(a.id());
        }
    }
}

/**
 * output:
 * 0
 * 1
 * 2
 * 0
 * 1
 * 2
 */
