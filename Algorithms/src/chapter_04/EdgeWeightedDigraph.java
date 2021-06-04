/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class EdgeWeightedDigraph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V; // number of vertices in the digraph
    private int E; // number of edges in the digraph
    private Bag<DirectedEdge>[] adj; // adj[v] = adjacency list for vertex v
    private int[] indegree; // indegree[] = indegree of vertex v

    /**
     * Initializes an empty-weighted graph with {@code V} vertices and 0 edges.
     * 
     * @param V the number of vertices
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public EdgeWeightedDigraph(int V) {
        if (V < 0) {
            throw new IllegalArgumentException("Number of vertices must be nonegative");
        }

        this.V = V;
        this.E = 0;
        this.indegree = new int[V];
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<>();
        }
    }

    /**
     * Initializes a random edge-weighted graph with {@code V} vertices and E edges.
     * 
     * @param V the number of vertices
     * @param E the number of edges
     * @throws IllegalArgumentException if {@code V < 0}
     * @throws IllegalArgumentException if {@code E < 0}
     */
    public EdgeWeightedDigraph(int V, int E) {
        this(V);

        if (E < 0) {
            throw new IllegalArgumentException("Number of edges must be nonnegative");
        }

        for (int i = 0; i < E; i++) {
            int v = StdRandom.uniform(V);
            int w = StdRandom.uniform(V);
            double weight = 0.01 * StdRandom.uniform(100);
            DirectedEdge e = new DirectedEdge(v, w, weight);
            addEdge(e);
        }
    }

    /**
     * Initializes a new edge-weighted digraph from the specified input stream.
     * 
     * @param in the input stream
     * @throws IllegalArgumentException if the endpoints of any edge are not in prescribed range
     * @throws IllegalArgumentException if the number of vertices or edges is negative
     */
    public EdgeWeightedDigraph(In in) {
        this(in.readInt());
        int E = in.readInt();

        if (E < 0) {
            throw new IllegalArgumentException("Number of edges must be nonnegative");
        }

        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            validateVertex(v);
            validateVertex(w);
            double weight = in.readDouble();
            addEdge(new DirectedEdge(v, w, weight));
        }
    }

    /**
     * Initializes a new edge-weighted digraph that is a deep copy of {@code G}.
     * 
     * @param G the edge-weighted digraph to copy
     */
    public EdgeWeightedDigraph(EdgeWeightedDigraph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            this.indegree[v] = G.indegree(v);
        }
        for (int v = 0; v < G.V(); v++) {
            Stack<DirectedEdge> reverse = new Stack<>();
            for (DirectedEdge edge : G.adj[v]) {
                reverse.push(edge);
            }
            for (DirectedEdge edge : reverse) {
                adj[v].add(edge);
            }
        }
    }

    /**
     * Returns the number of vertices in the edge-weighted digraph.
     * 
     * @return the number of vertices in the edge-weighted digraph
     */
    public int V() {
        return V;
    }

    /**
     * Returns the number of edges in the edge-weighted digraph.
     * 
     * @return the number of edges in the edge-weighted digraph
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
     * Adds the directed edge {@code e} to the edge-weighted digraph.
     * 
     * @param e the edge
     * @throws IllegalArgumentException unless endpoints of edge are 
     *         between {@code 0} and {@code V-1} 
     */
    public void addEdge(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        indegree[w]++;
        E++;
    }

    /**
     * Returns the directed edges incident from vertex {@code v}.
     * 
     * @param v the vertex
     * @return the directed edges incident from vertex {@code v} as an Iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<DirectedEdge> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Returns the number of directed edges incident from vertex {@code v}.
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
     * Returns the number of directed edges incident to vertex {@code v}.
     * 
     * @param v the vertex
     * @return the indegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int indegree(int v) {
        validateVertex(v);
        return indegree[v];
    }

    /**
     * Returns all directed edges in the edge-weighted digraph.
     * 
     * @return all edges in the edge-weighted digraph, as an iterable
     */
    public Iterable<DirectedEdge> edges() {
        Bag<DirectedEdge> list = new Bag<>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge edge : adj(v)) {
                list.add(edge);
            }
        }
        return list;
    }

    /**
     * Returns a string representation of the edge-weighted digraph.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " " + E + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (DirectedEdge edge : adj[v]) {
                s.append(edge + "  ");
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
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
        System.out.println(G);
    }
}

/**
 * command:
 * javac EdgeWeightedDigraph.java
 * java EdgeWeightedDigraph tinyEWD.txt
 * 
 * output:
 * 8 15
 * 0: 0->2  0.26  0->4  0.38  
 * 1: 1->3  0.29  
 * 2: 2->7  0.34  
 * 3: 3->6  0.52  
 * 4: 4->7  0.37  4->5  0.35  
 * 5: 5->1  0.32  5->7  0.28  5->4  0.35  
 * 6: 6->4  0.93  6->0  0.58  6->2  0.40  
 * 7: 7->3  0.39  7->5  0.28 
 */