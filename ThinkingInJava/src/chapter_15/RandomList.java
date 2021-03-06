/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * 
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s : ("The quick brown fox jumped over " + 
                    "the lazy brown dog").split(" ")) {
            rs.add(s)            ;
        }
        for(int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }
        System.out.println();
    }
}

/**
 * output:
 * brown over fox quick quick dog brown The brown lazy brown 
 */