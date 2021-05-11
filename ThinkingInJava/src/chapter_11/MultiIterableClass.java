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

public class MultiIterableClass extends IterableClass {

    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
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

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collection.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
    
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
