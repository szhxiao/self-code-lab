/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */


public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();

        // Insertion sort
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }

        // Selection sort
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }

        // Shell sort
        if (alg.equals("Shell")) {
            Shell.sort(a);
        }

        return timer.elapsedTime();
    }
    
    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.printf("For %d random Double\n    %s is", N, alg1);
        System.out.printf(" %.2f times faster than %s\n", t2/t1, alg2);
    }
    
}

/**
 * output:
 * $ java SortCompare Insertion Selection 1000 100
 * For 1000 random Double
 *     Insertion is 0.59 times faster than Selection
 * 
 * $ java SortCompare Insertion Selection 10000 1000
 * For 10000 random Double
 *     Insertion is 0.67 times faster than Selection
 * 
 * $ java SortCompare Shell Insertion 100000 100
 * For 100000 random Double
 *     Shell is 111800.47 times faster than Insertion
 */