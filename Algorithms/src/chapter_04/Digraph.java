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
 * A directed graph of vertices named 0 through V
 */
public class Digraph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;    // number of vertices in the digraph
    private int E = 0;          // number of edges in the digraph
    private Bag<Integer>[] adj; // adj[v] = adjacency list for vertex v
    private int[] indegree; // indegree[v] = indegree of vertex v

    /**
     * Initializes an empty digraph with V vertices.
     * 
     * @param V the number of vertices
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public Digraph(int V) {
        if (V < 0) {
            throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
        }

        this.V = V;
        this.E = 0;
        indegree = new int[V];
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<>();
        }
    }
    
    /**
     * Initializes a digraph from the specified input stream.
     * The format is the number of vertices V,
     * followed by the number of edges E,
     * followed by E pairs of vertices, with each entry separated by whitespace.
     * 
     * @param in the input stream
     * @throws IllegalArgumentException if the endpoints of any edges are not in prescribed range
     * @throws IllegalArgumentException if the number of vertices or edges is negative
     * @throws IllegalArgumentException if the input stream is in the wrong format
     */
    public Digraph(In in) {
        try {
            this.V = in.readInt();
            if (V < 0) {
                throw new IllegalArgumentException("number of vertices in a Digraph must be nonnegative");
            }

            indegree = new int[V];
            adj = (Bag<Integer>[]) new Bag[V];
            for (int v = 0; v < V; v++) {
                adj[v] = new Bag<>();
            }

            int E = in.readInt();
            if (E < 0) {
                throw new IllegalArgumentException("number of eges in a Diigraph must be nonnegative");
            }

            for (int i = 0; i < E; i++) {
                int v = in.readInt();
                int w = in.readInt();
                addEdge(v, w);
            }
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException("invalid input format in Digraph constructor", e);
        }
    }
    
    /**
     * Initializes a new digraph that is a deep copy of the specified digraph.
     * 
     * @param G the digraph to copy
     */
    public Digraph(Digraph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            this.indegree[v] = G.indegree[v];
        }

        for (int v = 0; v < G.V(); v++) {
            Stack<Integer> reverse = new Stack<>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }
            for (int w : reverse) {
                adj[v].add(w);
            }
        }
    }

    /**
     * Returns the number of vertices in the digraph.
     * 
     * @return the number of vertices in the digraph
     */
    public int V() {
        return V;
    }

    /**
     * Returns the number of edges in the digraph.
     * 
     * @return the number of edges in the digraph
     */
    public int E() {
        return E;
    }

    /**
     * throw an IllegalArgumentException unless {@code 0 <= v < V}
     */
    private void validateVertex(int v) {
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }

    /**
     * Adds the directed edge v->w to the graph.
     * 
     * @param v the tail vertex
     * @param w the head vertex
     * @throws IllegalArgumentException unless both {@code 0 <= v <V} and {@code 0 <= w < V}
     */
    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);

        adj[v].add(w);
        indegree[w]++;
        E++;
    }

    /**
     * Returns the vertices adjacent from vertex {@code v} in the digraph.
     * 
     * @param v the vertex
     * @return the vertices adjacent from vertex {@code v} in the digraph, as an iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Returns the number directed edges incident from vertex {@code v}.
     * 
     * @param v the vertex
     * @return the outdegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int outdegree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    /**
     * Returns the reverse of the digraph.
     * 
     * @return the reverse of the digraph
     */
    public Digraph reverse() {
        Digraph reverse = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                reverse.addEdge(w, v);
            }
        }
        return reverse;
    }

    /**
     * Returns a string representation of the graph.
     * 
     * @return the number of vertices, followed by the number of edges E
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(String.format("%d: ", v));
            for (int w : adj[v]) {
                s.append(String.format("%d ", w));
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        Digraph G = new Digraph(in);
        System.out.println(G);
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