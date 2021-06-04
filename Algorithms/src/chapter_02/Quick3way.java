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
 * Provides static methods for sorting an array using quick sort.
 */
public class Quick3way {
    private static long start;
    private static long end;

    /**
     * Rearranges the array in ascending order, using the natural order.
     * 
     * @param a the array to be sorted.
     */
    public static void sort(Comparable[] a) {
        start = System.currentTimeMillis();
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
        end = System.currentTimeMillis();
    }
    
    /**
     * Quicksort the subarray from a[lo] to a[hi]
     * 
     * @param a the array bo be sorted
     * @param lo the low index
     * @param hi the high index
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int lt = lo;
        int i = lo + 1;
        int gt = hi;

        Comparable v = a[lo];

        while (i <= gt) {
            int cmp = a[i].compareTo(v);

            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        }
        
        sort(a, lo, lt - 1);
        sort(a, gt+1, hi);
    }

    /**
     * Partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
     * 
     * @param a the array to be sorted
     * @param lo the low index
     * @param hi the high index
     * @return the index j
     */
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }

            // find item on hi to swap
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            // check if pointers cross
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        // put partitioning item v at a[j]
        exch(a, lo, j);
        // now a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }

    /**
     * Returns true if v < w
     * 
     * @param v the object
     * @param w the other object
     * @return {@code true} if v < w
     *         {@code false} otherwise
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Exchanges a[i] and a[j].
     * 
     * @param a the array
     * @param i the index of one object
     * @param j the index of the other object
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
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
            if (less(a[i], a[i - 1])) {
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
        System.out.println("Cost " + (end-start)/1000.0 + "s.");
    }
}

/**
 * output:
 *
 */