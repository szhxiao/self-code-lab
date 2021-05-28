/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class DijkstraSP {
    private double[] distTo; // distTo[v] = distance of shortest s->v path
    private DirectedEdge[] edgeTo; // edgeTo[v] = last edge on shortest s->v path
    private IndexMinPQ<Double> pq; // priority queue of vertices
    
    /**
     * Computes a shortest-paths tree from the source vertex {@code s} 
     * to every other vertex in the edge-weighted digraph {@code G}.
     * 
     * @param G the edge-weighted digraph
     * @param s the source vertex
     * @throws IllegalArgumentException if an edge weight is negative
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public DijkstraSP(EdgeWeightedDigraph G, int s) {
        for (DirectedEdge edge : G.edges()) {
            if (edge.weight() < 0) {
                throw new IllegalArgumentException("edge " + edge + " has negative weight");
            }
        }

        distTo = new double[G.V()];
        edgeTo = new DirectedEdge[G.V()];

        validateVertex(s);

        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;

        // relax vertices in order of distance from s
        pq = new IndexMinPQ<>(G.V());
        pq.insert(s, distTo[s]);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            for (DirectedEdge edge : G.adj(v)) {
                relax(edge);
            }
        }
    }

    /**
     * Relax edge and update pq if changed
     */
    private void relax(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        if (distTo[w] > distTo[v] + e.weight()) {
            distTo[w] = distTo[v] + e.weight();
            edgeTo[w] = e;
            if (pq.contains(w)) {
                pq.decreaseKey(w, distTo[w]);
            } else {
                pq.insert(w, distTo[w]);
            }
        }
    }

    /**
     * Returns the length of a shortest path from 
     * the source vertex {@code s} to vertex {@code v}.
     * 
     * @param v the destination vertex
     * @return the length of a shortest path from the source vertex {@code s} to vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public double distTo(int v) {
        validateVertex(v);
        return distTo[v];
    }

    /**
     * Returns true if there is a path from the source vertex to destination vertex.
     * 
     * @param v the destination vertex
     * @return {@code true} if there is a path from the source vertex
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean hasPathTo(int v) {
        validateVertex(v);
        return distTo[v] < Double.POSITIVE_INFINITY;
    }

    /**
     * Returns a shortest path from the source vertex {@code s} to vertex {@code v}.
     * 
     * @param v the destination vertex
     * @return a shortest path from the source vertex {@code s} to vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<DirectedEdge> pathTo(int v) {
        validateVertex(v);
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<DirectedEdge> path = new Stack<>();
        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            path.push(e);
        }
        return path;
    }

    private void validateVertex(int v) {
        int V = distTo.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
    }
    
    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
        int s = Integer.parseInt(args[1]);

        // compute shortest paths
        DijkstraSP sp = new DijkstraSP(G, s);

        // print path
        for (int t = 0; t < G.V(); t++) {
            if (sp.hasPathTo(t)) {
                System.out.printf("%d to %d (%.2f) ", s, t, sp.distTo(t));
                for (DirectedEdge edge : sp.pathTo(t)) {
                    System.out.print(edge + "  ");
                }
                System.out.println();
            } else {
                System.out.printf("%d to %d       no path\n", s, t);
            }
        }
    }
}

/**
 * command:
 * javac DijkstraSP.java
 * java DijkstraSP tinyEWD.txt 0       
 * 
 * output:
 * 0 to 0 (0.00) 
 * 0 to 1 (1.05) 0->4  0.38  4->5  0.35  5->1  0.32  
 * 0 to 2 (0.26) 0->2  0.26  
 * 0 to 3 (0.99) 0->2  0.26  2->7  0.34  7->3  0.39  
 * 0 to 4 (0.38) 0->4  0.38  
 * 0 to 5 (0.73) 0->4  0.38  4->5  0.35  
 * 0 to 6 (1.51) 0->2  0.26  2->7  0.34  7->3  0.39  3->6  0.52  
 * 0 to 7 (0.60) 0->2  0.26  2->7  0.34
 */