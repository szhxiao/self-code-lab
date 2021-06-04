/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

/**
 * Provides a client for reading in a sequence of words 
 * and printing a word that occurs most frequently. 
 */

public class FrequencyCounter {
    /**
     * Reads in a command-line integer and sequence of words from standard input 
     * and prints out a word that occurs most frequently to stand output.
     * @param args
     */
    public static void main(String[] args) {
        int minlen = Integer.parseInt(args);
        ST<String, Integer> st = new ST<>();
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (word.length() < minlen) {
                continue;
            }
            if (!st.contains(word)) {
                st.put(word, 1);
            } else {
                st.put(word, st.get(word) + 1);
            }
        }

        String max = " ";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max)) {
                max = word;
            }
        }
        System.out.println(max + " " + st.get(max));
    }
}