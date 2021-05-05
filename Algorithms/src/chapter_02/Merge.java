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
 * Provides static methods for sorting an array using a top-down,
 * recursive version of Merge sort.
 */
public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }
    
    /**
     * Merge sort
     * 
     * @param a the array to be sorted
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        // Sort left side
        sort(a, lo, mid);
        // Sort right side
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    /**
     * Stably merge array.
     * 
     * @param a the array to be sorted
     * @param lo
     * @param mid
     * @param hi
     */
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // Copy a[lo...hi] to aux[lo...hi]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        
        // merge back to a[]
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j>hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
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
    }
}

/**
 * output:
 *
 */