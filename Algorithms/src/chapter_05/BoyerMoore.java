/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class BoyerMoore {
    private final int R; // the radix
    private int[] right; // the bad-character skip array
    
    private char[] pattern; // store the pattern as a character array
    private String pat; // or as a string

    /**
     * Preproceses the pattern string.
     * 
     * @param pat the pattern string
     */
    public BoyerMoore(String pat) {
        this.R = 256;
        this.pat = pat;

        // position of rightmost occurrence of c in the pattern
        right = new int[R];
        for (int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < pat.length(); j++) {
            right[pat.charAt(j)] = j;
        }
    }

    /**
     * Preprocesses the pattern string.
     * 
     * @param pattern the pattern string
     * @param R the alphabet size
     */
    public BoyerMoore(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for (int j = 0; j < pattern.length; j++) {
            this.pattern[j] = pattern[j];
        }

        // position of rightmost occurrence of c in the pattern
        right = new int[R];
        for (int c = 0; c < R; c++) {
            right[c] = -1;
        }
        for (int j = 0; j < pattern.length; j++) {
            right[pattern[j]] = j;
        }
    }

    /**
     * Returns the index of the first occurrence of the pattern string in the txt string.
     * 
     * @param txt the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; n if no such match
     */
    public int search(String txt) {
        int m = pat.length();
        int n = txt.length();
        int skip;

        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                return i; // found
            }
        }
        return n; // not found
    }

    /**
     * Returns the index of the first occurrence of the pattern string in the text string.
     * 
     * @param text the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; n if no such match
     */
    public int search(char[] text) {
        int m = pattern.length;
        int n = text.length;
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m - 1; j >= 0; j--) {
                skip = Math.max(1, j - right[text[i + j]]);
                break;
            }
            if (skip == 0) {
                return i; // found
            }
        }
        return n; // not found
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String pat = args[0];
        String txt = args[1];
        char[] pattern = pat.toCharArray();
        char[] text = txt.toCharArray();

        BoyerMoore boyerMoore1 = new BoyerMoore(pat);
        BoyerMoore boyerMoore2 = new BoyerMoore(pattern, 256);
        int offset1 = boyerMoore1.search(txt);
        int offset2 = boyerMoore2.search(text);

        // print
        System.out.println("text:     " + txt);

        System.out.print("pattern: ");
        for (int i = 0; i < offset1; i++) {
            System.out.print(" ");
        }
        System.out.println(pat);

        System.out.print("pattern: ");
        for (int i = 0; i < offset2; i++) {
            System.out.print(" ");
        }
        System.out.println(pat);
    }
}

/**
 * command:
 * javac BoyerMoore.java
 * java BoyerMoore rab abacadabrabracabracadabrabrabracad
 * 
 * output:
 * text:     abacadabrabracabracadabrabrabracad
 * pattern:         rab
 * pattern:                                   rab
 */