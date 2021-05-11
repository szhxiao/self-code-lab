/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates all collections work with foreach.
 */

import java.util.*;

public class ForEachCollection {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for(String s : cs) {
            System.out.print("'" + s + "', ");
        }
        System.out.println();
    }
}

/**
 * output:
 * 'Take', 'the', 'long', 'way', 'home', 
 */
