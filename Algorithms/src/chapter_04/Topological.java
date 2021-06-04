/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class Topological {
    private Iterable<Integer> order; // topological order
    private int[] rank; // rank[v] = rank of vertex v in order

    /**
     * Determines whether the digraph {@code G} has a topological order.
     * 
     * @param G the digraph
     */
    public Topological(Digraph G) {
        DirectedCycle finder = new DirectedCycle(G);
        if (!finder.hasCycle()) {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
            rank = new int[G.V()];
            int i = 0;
            for (int v : order) {
                rank[v] = i++;
            }
        }
    }

    /**
     * Returns a topological order if the digraph has a topological order,
     * and {@code null} otherwise.
     * 
     * @return a topological order of the vertices if the digraph has a topological order
     *         and {@code null} otherwise
     */
    public Iterable<Integer> order() {
        return order;
    }

    /**
     * Does the digraph have a topological order?
     * 
     * @return {@code true} if the digraph has a topological order;
     *         {@code false} otherwise
     */
    public boolean hasOrder() {
        return order != null;
    }

    /**
     * The rank of vertex {@code v} in the topological order;
     * -1 if the digraph is not a DAG.
     * 
     * @param v the vertex
     * @return the position of vertex {@code v} in a topological order 
     *         of the digraph; -1 if the digraph is not a DAG
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int rank(int v) {
        validateVertex(v);
        if (hasOrder()) {
            return rank[v];
        } else {
            return -1;
        }
    }

    /**
     * throw an IllegalArgumentException unless 0 <= v < V
     */
    private void validateVertex(int v) {
        int V = rank.length;
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
        Topological topological = new Topological(sg.digraph());
        for (int v : topological.order()) {
            System.out.println(sg.nameOf(v));
        }
    }
}
