/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class LSD {
    private static final int BITS_PER_BYTE = 8;

    private LSD() {
    }

    /**
     * Rearranges the array of w-character strings in ascending order.
     * 
     * @param a the array to be sorted
     * @param w the number of characters per string
     */
    public static void sort(String[] a, int w) {
        int n = a.length;
        int R = 256;
        String[] aux = new String[n];

        for (int d = w - 1; d >= 0; d--) {
            // compute frequency counts
            int[] count = new int[R + 1];
            for (int i = 0; i < n; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            // move data
            for (int i = 0; i < n; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
    }
    
    /**
     * Rearranges the array of 32-bit integers in ascending order.
     * 
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        final int BITS = 32; // each int is 32 bits
        final int R = 1 << BITS_PER_BYTE; // each bytes is between 0 and 255
        final int MASK = R - 1; // oxFF
        final int w = BITS / BITS_PER_BYTE; // each int is 4 bytes

        int n = a.length;
        int[] aux = new int[n];

        for (int d = 0; d < w; d++) {
            // compute frequency counts
            int[] count = new int[R + 1];
            for (int i = 0; i < n; i++) {
                int c = (a[i] >> BITS_PER_BYTE * d) & MASK;
                count[c + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            // for most significant byte, 0x80-0xFF comes before 0x00-0x7F
            if (d == w - 1) {
                int shift1 = count[R] - count[R >> 1];
                int shift2 = count[R >> 1];
                for (int r = 0; r < R >> 1; r++) {
                    count[r] += shift1;
                }
                for (int r = R >> 1; r < R; r++) {
                    count[r] -= shift2;
                }
            }

            // move data
            for (int i = 0; i < n; i++) {
                int c = (a[i] >> BITS_PER_BYTE * d) & MASK;
                aux[count[c]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
    }
    
    /**
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String[] a = StdIn.readStrings();
        int n = a.length;

        // check that strings have fixed length
        int w = a[0].length();
        for (int i = 0; i < n; i++) {
            assert a[i].length() == w;
        }

        sort(a, w);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
