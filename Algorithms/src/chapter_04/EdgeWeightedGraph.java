/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class EdgeWeightedGraph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;
    private int E;
    private Bag<Edge>[] adj;

    /**
     * Initializes an empty edge-weighted graph with {@code V} vertices and 0 edges.
     * 
     * @param V the number of vertices
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public EdgeWeightedGraph(int V) {
        if (V < 0) {
            throw new IllegalArgumentException("Number of vertices must be nonnegative");
        }

        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
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
    public EdgeWeightedGraph(int V, int E) {
        this(V);

        if (E < 0) {
            throw new IllegalArgumentException("Number of edges must be onoegative");
        }

        for (int i = 0; i < E; i++) {
            int v = StdRandom.uniform(V);
            int w = StdRandom.uniform(V);
            double weight = Math.round(100 * StdRandom.uniform()) / 100.0;
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        }
    }
    
    /**
     * Initializes an edge-weighted graph from an input stream.
     * 
     * @param in the input stream
     * @throws IllegalArgumentException if the endpoints of any edge are not in prescribed range
     * @throws IllegalArgumentException if the number of vertices or edges is negative
     */
    public EdgeWeightedGraph(In in) {
        this(in.readInt());

        int E = in.readInt();
        if (E < 0) {
            throw new IllegalArgumentException("Number of edges must be nonegative");
        }

        for (int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            validateVertex(v);
            validateVertex(w);

            double weight = in.readDouble();
            Edge e = new Edge(v, w, weight);
            addEdge(e);
        }
    }

    /**
     * Initializes a new edge-weighted graph that is a deep copy of {@code G}.
     * 
     * @param G the edge-weighted graph to copy
     */
    public EdgeWeightedGraph(EdgeWeightedGraph G) {
        this(G.V());
        this.E = G.E();
        for (int v = 0; v < G.V(); v++) {
            Stack<Edge> reverse = new Stack<Edge>();
            for (Edge edge : G.adj[v]) {
                reverse.push(edge);
            }
            for (Edge edge : reverse) {
                adj[v].add(edge);
            }
        }
    }

    /**
     * Returns the number of vertices in the edge-weighted graph.
     * 
     * @return the number of vertices in the edge-weighted graph
     */
    public int V() {
        return V;
    }

    /**
     * Returns the number of edges in the edge-weighted graph.
     * 
     * @return the number of edges in the edge-weighted graph
     */
    public int E() {
        return E;
    }

    private void validateVertex(int v) {
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }

    /**
     * Adds the undirected edge {@code e} to the edge-weighted graph.
     * 
     * @param e the edge
     * @throws IllegalArgumentException unless both endpoints 
     *         are between {@code 0} and {@code V-1}
     */
    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    /**
     * Return the edges incident on vertex {@code v}.
     * 
     * @param v the vertex
     * @return the edges incident on vertex {@code v} as an Iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Edge> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Returns the degree of vertex {@code v}.
     * 
     * @param v the vertex
     * @return the degree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    /**
     * Returns all edges in the edge-weighted graph.
     * 
     * @return all edges in the edge-weighted graph, as an iterable
     */
    public Iterable<Edge> edges() {
        Bag<Edge> list = new Bag<>();
        for (int v = 0; v < V; v++) {
            int selfLoops = 0;
            for (Edge edge : adj(v)) {
                if (edge.other(v) > v) {
                    list.add(edge);
                } else if (edge.other(v) == v) {
                    if (selfLoops % 2 == 0) {
                        list.add(edge);
                    }
                    selfLoops++;
                }
            }
        }
        return list;
    }

    /**
     * Returns a string representation of the edge-weighted graph.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " " + E + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (Edge edge : adj[v]) {
                s.append(edge + " ");
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
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        System.out.println(G);
    }
}

/**
 * command:
 * javac EdgeWeightedGraph.java
 * java EdgeWeightedGraph tinyEWG.txt 
 * 
 * output：
 * 8 16
 * 0: 6-0 0.58000 0-2 0.26000 0-4 0.38000 0-7 0.16000 
 * 1: 1-3 0.29000 1-2 0.36000 1-7 0.19000 1-5 0.32000 
 * 2: 6-2 0.40000 2-7 0.34000 1-2 0.36000 0-2 0.26000 2-3 0.17000 
 * 3: 3-6 0.52000 1-3 0.29000 2-3 0.17000 
 * 4: 6-4 0.93000 0-4 0.38000 4-7 0.37000 4-5 0.35000 
 * 5: 1-5 0.32000 5-7 0.28000 4-5 0.35000 
 * 6: 6-4 0.93000 6-0 0.58000 3-6 0.52000 6-2 0.40000 
 * 7: 2-7 0.34000 1-7 0.19000 0-7 0.16000 5-7 0.28000 4-7 0.37000 
 */