

import java.util.Arrays;

public class SuffixArray {
    private Suffix[] suffixes;

    /**
     * Initializes a suffix array for the given {@code text} string.
     * 
     * @param text the input string
     */
    public SuffixArray(String text) {
        int n = text.length();
        this.suffixes = new Suffix[n];
        for (int i = 0; i < n; i++)
            suffixes[i] = new Suffix(text, i);
        Arrays.sort(suffixes);
    }

    private static class Suffix implements Comparable<Suffix> {
        private final String text;
        private final int index;

        private Suffix(String text, int index) {
            this.text = text;
            this.index = index;
        }
        private int length() {
            return text.length() - index;
        }
        private char charAt(int i) {
            return text.charAt(index + i);
        }

        public int compareTo(Suffix that) {
            if (this == that) return 0;  // optimization
            int n = Math.min(this.length(), that.length());
            for (int i = 0; i < n; i++) {
                if (this.charAt(i) < that.charAt(i)) return -1;
                if (this.charAt(i) > that.charAt(i)) return +1;
            }
            return this.length() - that.length();
        }

        public String toString() {
            return text.substring(index);
        }
    }

    /**
     * Returns the length of the input string.
     * 
     * @return the length of the input string
     */
    public int length() {
        return suffixes.length;
    }


    /**
     * Returns the index into the original string of the ith smallest suffix.
     * 
     * @param i an integer between 0 and n-1
     * @return the index into the original string of the ith smallest suffix
     * @throws IllegalArgumentException unless {@code 0 <= i < n}
     */
    public int index(int i) {
        if (i < 0 || i >= suffixes.length) throw new IllegalArgumentException();
        return suffixes[i].index;
    }


    /**
     * Returns the length of the longest common prefix of the ith
     * smallest suffix and the i-1st smallest suffix.
     * 
     * @param i an integer between 1 and n-1
     * @return the length of the longest common prefix of the ith
     * smallest suffix and the i-1st smallest suffix.
     * @throws IllegalArgumentException unless {@code 1 <= i < n}
     */
    public int lcp(int i) {
        if (i < 1 || i >= suffixes.length) throw new IllegalArgumentException();
        return lcpSuffix(suffixes[i], suffixes[i-1]);
    }

    // longest common prefix of s and t
    private static int lcpSuffix(Suffix s, Suffix t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) return i;
        }
        return n;
    }

    /**
     * Returns the ith smallest suffix as a string.
     * 
     * @param i the index
     * @return the i smallest suffix as a string
     * @throws IllegalArgumentException unless {@code 0 <= i < n}
     */
    public String select(int i) {
        if (i < 0 || i >= suffixes.length) throw new IllegalArgumentException();
        return suffixes[i].toString();
    }

    /**
     * Returns the number of suffixes strictly less than the {@code query} string.
     * 
     * @param query the query string
     * @return the number of suffixes strictly less than {@code query}
     */
    public int rank(String query) {
        int lo = 0, hi = suffixes.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = compare(query, suffixes[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }

    // compare query string to suffix
    private static int compare(String query, Suffix suffix) {
        int n = Math.min(query.length(), suffix.length());
        for (int i = 0; i < n; i++) {
            if (query.charAt(i) < suffix.charAt(i)) return -1;
            if (query.charAt(i) > suffix.charAt(i)) return +1;
        }
        return query.length() - suffix.length();
    }

    /**
     * Unit tests
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String s = StdIn.readAll().replaceAll("\\s+", " ").trim();
        SuffixArray suffix = new SuffixArray(s);

        System.out.println("  i ind lcp rnk select");
        System.out.println("---------------------------");

        for (int i = 0; i < s.length(); i++) {
            int index = suffix.index(i);
            String ith = "\"" + s.substring(index, Math.min(index + 50, s.length())) + "\"";
            assert s.substring(index).equals(suffix.select(i));
            int rank = suffix.rank(s.substring(index));
            if (i == 0) {
                System.out.printf("%3d %3d %3s %3d %s\n", i, index, "-", rank, ith);
            }
            else {
                int lcp = suffix.lcp(i);
                System.out.printf("%3d %3d %3d %3d %s\n", i, index, lcp, rank, ith);
            }
        }
    }
}