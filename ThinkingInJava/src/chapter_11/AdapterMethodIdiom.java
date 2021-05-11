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

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    
                    public boolean hasNext() {
                        return current > -1;
                    }
        
                    public T next() {
                        return get(current--);
                    }
        
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList(
            Arrays.asList("To be or not to be".split(" "))
        );

        for (String string : ral) {
            System.out.print(string + " ");
        }

        System.out.println();

        for (String string : ral.reversed()) {
            System.out.print(string + " ");
        }
    }
}

/**
 * output:
 * To be or not to be 
 * be to not or be To 
 */
