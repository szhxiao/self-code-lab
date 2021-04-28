/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Random;

public class TestAccumulator {

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        Random random = new Random();
        for (int t = 0; t < T; t++) {
            a.addDataValue(random.nextDouble());
        }
        System.out.println(a);
    }
}

/**
 * output:
 * java TestAccumulator 1000
 * Mean (1000 values): 0.48453
 */