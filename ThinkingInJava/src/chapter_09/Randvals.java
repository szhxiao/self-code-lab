/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Random;

/**
 * This program demonstrates initializing interface fields with
 * non-constant initializers.
 */

public interface Randvals {
    
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        RandomDoubles r = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.print(r.next() + " ");
        }
    }
}

