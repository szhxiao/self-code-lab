/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class LazyPrimMST {
    private static final double FLOATING_POINT_EPSILON = 1E-12;

    private double weight; // total weight of MST
    private Queue<Edge> mst; // edges in the MST
    private boolean[] marked; // marked[v] = true iff v on tree
    private MinPQ<Edge> pq;

    /**
     * Compute a minimum spanning tree of an edge-weighted graph.
     * 
     * @param G the edge-weighted graph
     */
    public LazyPrimMST(EdgeWeightedGraph G) {
        mst = new Queue<>();
        pq = new MinPQ<>();
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                prim(G, v);
            }
        }
    }

    private void prim(EdgeWeightedGraph G, int s) {
        scan(G, s);
        while (!pq.isEmpty()) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);

            assert marked[v] || marked[w];

            if (marked[v] && marked[w]) {
                continue;
            }
            mst.enqueue(e);
            weight += e.weight();
            if (!marked[v]) {
                scan(G, v);
            }
            if (!marked[w]) {
                scan(G, w);
            }
        }
    }

    /**
     * Adds all edges e incident to v onto pq 
     * if the other endpoint has not yet been scanned
     */
    private void scan(EdgeWeightedGraph G, int v) {
        assert !marked[v];
        marked[v] = true;
        for (Edge edge : G.adj(v)) {
            if (!marked[edge.other(v)]) {
                pq.insert(edge);
            }
        }
    }

    /**
     * Returns the edges in a minimum spanning tree (or forest).
     * 
     * @return the edges in a minimum spanning tree (or forest) as an iterable of edges
     */
    public Iterable<Edge> edges() {
        return mst;
    }

    /**
     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
     * 
     * @return the sum of the edge weights in a minimum spanning tree (or forest)
     */
    public double weight() {
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
        LazyPrimMST mst = new LazyPrimMST(G);
        for (Edge edge : mst.edges()) {
            System.out.println(edge);
        }
        System.out.printf("%.5f\n", mst.weight());
    }
}

/**
 * command:
 * javac LazyPrimMST.java
 * java LazyPrimMST tinyEWG.txt 
 * 
 * output:
 * 0-7 0.16000
 * 1-7 0.19000
 * 0-2 0.26000
 * 2-3 0.17000
 * 5-7 0.28000
 * 4-5 0.35000
 * 6-2 0.40000
 * 1.81000
 */