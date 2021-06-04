/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class LZW {
    private static final int R = 256; // number of input chars
    private static final int L = 4096; // number of codewords=2^W
    private static final int W = 12; // codeword widdth
    
    // Do not instantiate
    private LZW() {
    }
    
    /**
     * Reads a sequence of 8-bit bytes from standard input;
     * compresses them using LZW compression with 12-bit codewords;
     * and writes the results to standard output.
     */
    public static void compress() {
        String input = BinaryStdIn.readString();
        TST<Integer> st = new TST<>();
        for (int i = 0; i < R; i++) {
            st.put("" + (char) i, i);
        }
        int code = R + 1;

        while (input.length() > 0) {
            // find max prefix match s
            String s = st.longestPrefixOf(input);

            // print s's encoding
            BinaryStdOut.write(st.get(s), W);
            int t = s.length();
            if (t < input.length() && code < L) {
                st.put(input.substring(0, t + 1), code++);
            }
            input = input.substring(t);
        }
        BinaryStdOut.write(R, W);
        BinaryStdOut.close();
    }

    /**
     * Reads a sequence of bit encoded using LZW compression 
     * with 12-bit codewords from standard input;
     * expands them; and writes the results to standard output.
     */
    public static void expand() {
        String[] st = new String[L];
        int i;

        // initialize symbol table with all 1-character strings
        for (i = 0; i < R; i++) {
            st[i] = "" + (char) i;
        }
        st[i++] = "";

        int codeword = BinaryStdIn.readInt(W);
        if (codeword == R) {
            return;
        }
        String val = st[codeword];

        while (true) {
            BinaryStdOut.write(val);
            codeword = BinaryStdIn.readInt(W);
            if (codeword == R) {
                break;
            }
            String s = st[codeword];
            if (i == codeword) {
                s = val + val.charAt(0);
            }
            if (i < L) {
                st[i++] = val + s.charAt(0);
            }
            val = s;
        }
        BinaryStdOut.close();
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        if (args[0].equals("-")) {
            compress();
        } else if (args[0].equals("+")) {
            expand();
        } else {
            throw new IllegalArgumentException("Illegal command line argument");
        }
    }
}
