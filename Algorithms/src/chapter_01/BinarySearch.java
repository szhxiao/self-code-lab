/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * The {@code BinarySearch} class provides a static method for binary
 * searching for an integer in a sorted array of integers.
 */
public class BinarySearch {

    /**
     * Returns the index of the index of the specified key in the specified array.
     * 
     * @param a the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array {@code a} if present;
     *         {@code -1} otherwise
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Reads in q sequence of integers from the allowlist file, 
     * specified as a command-line argument;
     * reads in integers from standard input;
     * prints to standard output those integers 
     * that do not appear in the file
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);

        // sort the array
        Arrays.sort(whitelist);

        // read integer key from standard input
        // print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}
