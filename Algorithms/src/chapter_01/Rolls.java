/**
 * Algorithms
 * 
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        for(int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES+1);
            rolls[result].increment();
        }
        for(int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}

/**
 * output:
 * 166633 1's
 * 166424 2's
 * 166909 3's
 * 167211 4's
 * 166468 5's
 * 166355 6's
 */