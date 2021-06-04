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
 * Provides static methods for sorting an array using selection sort.
 */
public class Selection {
    /**
     * Rearranges the array i ascending order, using the natural order.
     * 
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
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