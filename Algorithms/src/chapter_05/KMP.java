/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

/**
 * Finds the first occurrence of a pattern string in a text string.
 */
public class KMP {
    private final int R; // the radix
    private int[][] dfa; // the KMP automoton
    
    private char[] pattern; // either the character array for the pattern
    private String pat; // or the pattern string

    /**
     * Preprocesses the pattern string.
     * 
     * @param pat the pattern string
     */
    public KMP(String pat) {
        this.R = 256;
        this.pat = pat;

        // build DFA from pattern
        int m = pat.length();
        dfa = new int[R][m];
        dfa[pat.charAt(0)][0] = 1;
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][x]; // copy mismatch cases
            }
            dfa[pat.charAt(j)][j] = j + 1; // set match case
            x = dfa[pat.charAt(j)][x]; // update restart state
        }
    }

    /**
     * Preprocesses the pattern string.
     * 
     * @param pattern the pattern string
     * @param R the alphabet size
     */
    public KMP(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for (int j = 0; j < pattern.length; j++) {
            this.pattern[j] = pattern[j];
        }

        // build DFA from pattern
        int m = pattern.length;
        dfa = new int[R][m];
        dfa[pattern[0]][0] = 1;
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][x]; // copy mismatch cases
            }
            dfa[pattern[j]][j] = j + 1; // set match case
            x = dfa[pattern[j]][x]; // update restart state
        }
    }

    /**
     * Returns the index of the first occurrence of the pattern string.
     * 
     * @param txt the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; N if no such match
     */
    public int search(String txt) {
        // simulate operation of DFA on text
        int m = pat.length();
        int n = txt.length();
        int i;
        int j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if (j == m) {
            return i - m; // found
        }
        return n; // not found
    }

    /**
     * Returns the index of the first occurrence of the pattern string.
     * 
     * @param text the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; N if no such match
     */
    public int search(char[] text) {
        // simulate operation of DFA on text
        int m = pattern.length;
        int n = text.length;
        int i;
        int j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[text[i]][j];
        }
        if (j == m) {
            return i - m; // found
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

        KMP kmp1 = new KMP(pat);
        int offset1 = kmp1.search(txt);

        KMP kmp2 = new KMP(pattern, 256);
        int offset2 = kmp2.search(text);

        // print results
        System.out.println("text:    " + txt);

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
 * javac KMP.java
 * java KMP rab abacadabrabracabracadabrabrabracad
 * 
 * output:
 * text:    abacadabrabracabracadabrabrabracad
 * pattern:         rab
 * pattern:         rab
 */