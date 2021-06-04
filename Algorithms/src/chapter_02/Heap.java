/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Scanner;

/**
 * Provides static methods for sorting an array using heap sort.
 */
public class Heap {
    /**
     * Rearranges the array in ascending order, using the natural order.
     * 
     * @param a the array to be sorted.
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }
        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }
    
    /**
     * Restores the heap invariant.
     * 
     * @param pq
     * @param k
     * @param n
     */
    private static void sink(Comparable[] pq, int k, int n) {
        while (2*k <= n) {
            int j = 2 * k;
            if (j < n && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }

    /**
     * Returns true if pq[i] < pq[j].
     * 
     * @param pq
     * @param i the one index of pq
     * @param j the other index of pq
     * @return {@code true} if pq[i]<pq[j]
     *         {@code false} otherwise
     */
    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    /**
     * Exchanges a[i] and a[j].
     * 
     * @param a the array
     * @param i the index of one object
     * @param j the index of the other object
     */
    private static void exch(Object[] pq, int i, int j) {
        Object tmp = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = tmp;
    }

    /**
     * Prints array to standard output.
     * 
     * @param a the sorted array
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Returns true if the array is sorted.
     * 
     * @param a the array is sorted
     * @return {@code true} if the array is sorted
     *         {@code false} otherwise
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a, i, i-1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reads in a sequence of strings from standard input;
     * sorts them and prints them to standard output in ascending order.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // String[] a = In.readStrings();
        Scanner in = new Scanner(System.in);
        String[] a = in.nextLine().split(" ");
        sort(a);
        assert isSorted(a);
        show(a);
    }
}

/**
 * output:
 *
 */