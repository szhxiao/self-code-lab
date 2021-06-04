/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class LookupIndex {
    private LookupIndex() {
    }

    public static void main(String[] args) {
        String filename = args[0];
        String separator = args[1];

        In in = new In(filename);

        RedBlackBST<String, Queue<String>> st = new RedBlackBST<>();
        RedBlackBST<String, Queue<String>> ts = new RedBlackBST<>();

        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] fields = line.split(separator);
            String key = fields[0];
            for (int i = 1; i < fields.length; i++) {
                String value = fields[i];
                if (!st.contains(key)) {
                    st.put(key, new Queue<String>());
                }
                if (!ts.contains(value)) {
                    ts.put(value, new Queue<String>());
                }
                st.get(key).enqueue(value);
                ts.get(value).enqueue(key);
            }
        }

        System.out.println("Done indexing");

        // read queries from standard input one per line
        while (!StdIn.isEmpty()) {
            String query = StdIn.readLine();
            if (st.contains(query)) {
                for (String vals : st.get(query)) {
                    System.out.println(" " + vals);
                }
            }
            if (ts.contains(query)) {
                for (String keys : ts.get(query)) {
                    System.out.println(" " + keys);
                }
            }
        }
    }
}

/**
 * output:
 * 
 */