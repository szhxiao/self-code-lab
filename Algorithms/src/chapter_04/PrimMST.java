/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class PrimMST {
    private static final double FLOATING_POINT_EPSILON = 1E-12;

    private Edge[] edgeTo; // edgeTo[v] = shortest edge from tree vertex to non-tree vertex
    private double[] distTo; // distTo[v] = weight of shortest such edge
    private boolean[] marked; // marked[v] = true iff v on tree
    private IndexMinPQ<Double> pq;

    /**
     * Compute a minimum spanning tree of an edge-weighted graph.
     * 
     * @param G the edge-weighted graph
     */
    public PrimMST(EdgeWeightedGraph G) {
        edgeTo = new Edge[G.V()];
        distTo = new double[G.V()];
        marked = new boolean[G.V()];
        pq = new IndexMinPQ<>(G.V());
        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        // run from each vertex to find
        for (int v = 0; v < G.V(); v++) {
            // minimum spanning forest
            if (!marked[v]) {
                prim(G, v);
            }
        }
    }

    /**
     * run Prim's algorithm in graph G, starting from vertex s
     */
    private void prim(EdgeWeightedGraph G, int s) {
        distTo[s] = 0.0;
        pq.insert(s, distTo[s]);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            scan(G, v);
        }
    }

    /**
     * Adds all edges e incident to v onto pq 
     * if the other endpoint has not yet been scanned
     */
    private void scan(EdgeWeightedGraph G, int v) {
        // assert !marked[v];
        marked[v] = true;
        for (Edge edge : G.adj(v)) {
            int w = edge.other(v);
            if (marked[w]) {
                continue;
            }
            if (edge.weight() < distTo[w]) {
                distTo[w] = edge.weight();
                edgeTo[w] = edge;
                if (pq.contains(w)) {
                    pq.decreaseKey(w, distTo[w]);
                } else {
                    pq.insert(w, distTo[w]);
                }
            }
        }
    }

    /**
     * Returns the edges in a minimum spanning tree (or forest).
     * 
     * @return the edges in a minimum spanning tree (or forest) as an iterable of edges
     */
    public Iterable<Edge> edges() {
        Queue<Edge> mst = new Queue<>();
        for (int v = 0; v < edgeTo.length; v++) {
            Edge e = edgeTo[v];
            if (e != null) {
                mst.enqueue(e);
            }
        }
        return mst;
    }

    /**
     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
     * 
     * @return the sum of the edge weights in a minimum spanning tree (or forest)
     */
    public double weight() {
        double weight = 0.0;
        for (Edge edge : edges()) {
            weight += edge.weight();
        }
        return weight;
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        PrimMST mst = new PrimMST(G);
        for (Edge edge : mst.edges()) {
            System.out.println(edge);
        }
        System.out.printf("%.5f\n", mst.weight());
    }
}

/**
 * command:
 * javac PrimMST.java
 * java PrimMST tinyEWG.txt 
 * 
 * output:
 * 1-7 0.19000
 * 0-2 0.26000
 * 2-3 0.17000
 * 4-5 0.35000
 * 5-7 0.28000
 * 6-2 0.40000
 * 0-7 0.16000
 * 1.81000
 */