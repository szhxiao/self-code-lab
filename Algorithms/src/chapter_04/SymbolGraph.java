/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class SymbolGraph {
    private ST<String, Integer> st; // string -> index
    private String[] keys; // index -> string
    private Graph graph; // the underlying graph
    
    /**
     * Initializes a graph from a file using the specified delimiter.
     * 
     * @param filename the name of the file
     * @param delimiter the delimiter between fields
     */
    public SymbolGraph(String filename, String delimiter) {
        st = new ST<>();

        // First pass builds the index by reading strings to associate
        In in = new In(filename);
        // while (in.hasNextLine())
        while (!in.isEmpty()) {
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

        // second pass builds the graph by connecting first vertex on each
        graph = new Graph(st.size());
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
     * Does the graph contain the vertex named {@code s}?
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
     * @param v the integer corresponding to a vertex.
     * @return the name of the vertex associated with the integer {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public String nameOf(int v) {
        validateVertex(v);
        return keys[v];
    }

    /**
     * Returns the graph associated with the symbol graph.
     * 
     * @return the graph associated with the symbol graph
     */
    public Graph graph() {
        return graph;
    }

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
        SymbolGraph sg = new SymbolGraph(filename, delimiter);
        Graph graph = sg.graph();

        while (StdIn.hasNextLine()) {
            String source = StdIn.readLine();
            if (sg.contains(source)) {
                int s = sg.indexOf(source);
                for (int v : graph.adj(s)) {
                    System.out.println(" " + sg.nameOf(v));
                }
            } else {
                System.out.println("input not contain '" + source + "'");
            }
        }
    }
}

/**
 * command:
 * javac SymbolGraph.java
 * java SymbolGraph routes.txt " "
 * JFK
 *  ORD
 *  ATL
 *  MCO
 * LAX
 *  LAS
 *  PHX
 * HOU
 *  MCO
 *  DFW
 *  ORD
 */