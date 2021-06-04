/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class MSD {
    private static final int BITS_PER_BYTE = 8;
    private static final int BITS_PER_INT = 32;
    private static final int R = 256; // extended ASCII alphabet size
    private static final int CUTOFF = 15; // cutoff to insertion sort

    private MSD() {
    }

    /**
     * Rearranges the array of ASCII strings in ascending order.
     * 
     * @param a the array to be sorted
     */
    public static void sort(String[] a) {
        int n = a.length;
        String[] aux = new String[n];
        sort(a, 0, n - 1, 0, aux);
    }

    /**
     * Return dth character of s, -1 if d = length of string
     */
    private static int charAt(String s, int d) {
        assert d >= 0 && d <= s.length();
        if (d == s.length()) {
            return -1;
        }
        return s.charAt(d);
    }

    /**
     * sort from a[lo] to a[hi], starting at the dth character
     */
    private static void sort(String[] a, int lo, int hi, int d, String[] aux) {
        // cutoff to insertion sort for small subarrays
        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi, d);
            return;
        }

        // compute frequency counts
        int[] count = new int[R + 2];
        for (int i = lo; i <= hi; i++) {
            int c = charAt(a[i], d);
            count[c + 2]++;
        }

        // transform counts to indicies
        for (int r = 0; r < R + 1; r++) {
            count[r + 1] += count[r];
        }

        // distribute
        for (int i = lo; i <= hi; i++) {
            int c = charAt(a[i], d);
            aux[count[c + 1]++] = a[i];
        }

        // copy back
        for (int i = lo; i <= hi; i++) {
            a[i] = aux[i - lo];
        }

        // recursively sort for each character
        for (int r = 0; r < R; r++) {
            sort(a, lo + count[r], lo + count[r + 1] - 1, d + 1, aux);
        }
    }
    
    /**
     * insertion sort a[lo..hi], starting at dth character
     */
    private static void insertion(String[] a, int lo, int hi, int d) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1], d); j--) {
                exch(a, j, j - 1);
            }
        }
    }
    
    /**
     * exchange a[i] and a[j]
     */
    private static void exch(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * is v less than w
     */
    private static boolean less(String v, String w, int d) {
        for (int i = d; i < Math.min(v.length(), w.length()); i++) {
            if (v.charAt(i) < w.charAt(i)) {
                return true;
            }
            if (v.charAt(i) > w.charAt(i)) {
                return false;
            }
        }
        return v.length() < w.length();
    }
    
    /**
     * Rearranges the array of 32-bit integers in ascending order.
     * 
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int n = a.length;
        int[] aux = new int[n];
        sort(a, 0, n - 1, 0, aux);
    }
    
    /**
     * MSD sort from a[lo] to a[hi], starting at the dth byte
     */
    private static void sort(int[] a, int lo, int hi, int d, int[] aux) {
        // cutoff to insertion sort for small subarrays
        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi, d);
            return;
        }

        // compute frequency counts
        int[] count = new int[R + 1];
        int mask = R - 1;
        int shift = BITS_PER_INT - BITS_PER_BYTE * d - BITS_PER_BYTE;
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            count[c + 1]++;
        }

        // transform counts to indicies
        for (int r = 0; r < R; r++) {
            count[r + 1] += count[r];
        }

        // distribute
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            aux[count[c++]] = a[i];
        }

        // copy back
        for (int i = lo; i <= hi; i++) {
            a[i] = aux[i - lo];
        }

        // no more bits
        if (d == 4) {
            return;
        }

        // recursively sort for each character
        if (count[0] > 0) {
            sort(a, lo, lo + count[0] - 1, d + 1, aux);
        }
        for (int r = 0; r < R; r++) {
            if (count[r + 1] > count[r]) {
                sort(a, lo + count[r], lo + count[r + 1] - 1, d + 1, aux);
            }
        }
    }
    
    private static void insertion(int[] a, int lo, int hi, int d) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && a[j] < a[j - 1]; j--) {
                exch(a, j, j - 1);
            }
        }
    }
    
    /**
     * exchange a[i] and a[j]
     */
    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    /**
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String[] a = StdIn.readStrings();
        int n = a.length;

        sort(a);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

/**
 * command:
 * javac MSD.java
 * java MSD < shells.txt 
 * 
 * output:
 * are
 * by
 * sea
 * sea
 * seashells
 * seashells
 * sells
 * sells
 * she
 * shore
 * surely
 * the
 * the
 */