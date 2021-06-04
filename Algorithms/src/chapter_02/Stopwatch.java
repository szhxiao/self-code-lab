/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Random;

public class Stopwatch {
    private final long start;
    
    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    // public static void main(String[] args) {
        
    //     int N = Integer.parseInt(args[0]);
    //     int[] a = new int[N];
    //     for (int i = 0; i < N; i++) {
    //         a[i] = StdRandom.uniform(-1000000, 1000000);
    //     }
    //     Stopwatch timer = new Stopwatch();
    //     int cnt = ThreeSum.count(a);
    //     double time = timer.elapsedTime();
    //     System.out.println(cnt + " triples " + time + " seconds");
    // }
}

/**
 * output:
 * java Stopwatch 1000
 * 63 triples 0.354 seconds
 * 
 * java Stopwatch 2000
 * 529 triples 2.751 seconds
 */