/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates anything Iterable works with foreach.
 */

import java.util.*;

public class IterableClass implements Iterable<String> {
    protected String[]words = ("And that is how we know the Earth to be banana-shaped.".split(" "));

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            
            public boolean hasNext() {
                return index < words.length;
            }

            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(String s : new IterableClass()) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

/**
 * output:
 * And that is how we know the Earth to be banana-shaped. 
 */
