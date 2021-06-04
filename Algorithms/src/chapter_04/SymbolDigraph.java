/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.NoSuchElementException;

/**
 * A directed graph of vertices names are arbitrary strings.
 */
public class SymbolDigraph {

    private ST<String, Integer> st; // string -> index
    private String[] keys; // index -> string
    private Digraph graph; // the underlying digraph
    

    /**
     * Initializes a digraph from a file using the specified delimiter.
     * 
     * @param filename the name of the file
     * @param delimiter the delimiter between fields
     */
    public SymbolDigraph(String filename, String delimiter) {
        st = new ST<>();

        // first pass builds the index by reading strings to associate
        // distinct strings with an index
        In in = new In(filename);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(delimiter);
            for (int i = 0; i < a.length; i++) {
                if (!st.contains(a[i])) {
                    st.put(a[i], st.size());
                }
            }
        }

        // inverted index to get string keys in an array
        keys = new String[st.size()];
        for (String name : st.keys()) {
            keys[st.get(name)] = name;
        }

        // second pas builds the digraph by connecting first vertex 
        // on each line to all others
        graph = new Digraph(st.size());
        in = new In(filename);
        while (in.hasNextLine()) {
            String[] a = in.readLine().split(delimiter);
            int v = st.get(a[0]);
            for (int i = 1; i < a.length; i++) {
                int w = st.get(a[i]);
                graph.addEdge(v, w);
            }
        }
    }

    /**
     * Does the digraph contain the vertex named {@code s}?
     * 
     * @param s the name of a vertex
     * @return {@code true} if {@code s} is the name of a vertex;
     *         {@code false} otherwise
     */
    public boolean contains(String s) {
        return st.contains(s);
    }

    /**
     * Returns the integer associated with the vertex named {@code s}.
     * 
     * @param s the name of a vertex
     * @return the integer associated with the vertex named {@code s}
     */
    public int indexOf(String s) {
        return st.get(s);
    }

    /**
     * Returns the name of the vertex associated with the integer {@code v}.
     * 
     * @param v the integer corresponding to a vertex
     * @return the name off the vertex associated with the integer {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public String nameOf(int v) {
        validateVertex(v);
        return keys[v];
    }

    /**
     * Returns the digraph associated with the symbol graph.
     * 
     * @return the digraph associated with the symbol digraph
     */
    public Digraph digraph() {
        return graph;
    }

    /**
     * throw an IllegalArgumentException unless {@code 0 <= v < V}
     */
    private void validateVertex(int v) {
        int V = graph.V();
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String filename = args[0];
        String delimiter = args[1];
        SymbolDigraph sg = new SymbolDigraph(filename, delimiter);
        Digraph graph = sg.digraph();
        while (!StdIn.isEmpty()) {
            String t = StdIn.readLine();
            for (int v : graph.adj(sg.indexOf(t))) {
                System.out.println("  " + sg.nameOf(v));
            }
        }
    }

}

/**
 * command:
 * javac Digraph
 * java Digraph tinyDG.txt 
 * 
 * output:
 * 13 vertices, 22 edges 
 * 0: 5 1 
 * 1: 
 * 2: 0 3 
 * 3: 5 2 
 * 4: 3 2 
 * 5: 4 
 * 6: 9 4 0 
 * 7: 6 8 
 * 8: 7 9 
 * 9: 11 10 
 * 10: 12 
 * 11: 4 12 
 * 12: 9 
 */