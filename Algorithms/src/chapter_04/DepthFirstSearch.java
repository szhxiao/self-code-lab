/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class DepthFirstSearch {
    private boolean[] marked; // marked[v] = is there an s-v path
    private int count; // number of vertices connected to s
    
    /**
     * Computes the vertices in graph {@code G} that
     * are connected to the source vertex {@code s}.
     * 
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        validateVertex(s);
        dfs(G, s);
    }

    /**
     * depth first search from v
     */
    private void dfs(Graph G, int v) {
        count++;
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex {@code s} and vertex {@code v}.
     * 
     * @param v the vertex
     * @return {@code true} if there is a path
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean marked(int v) {
        validateVertex(v);
        return marked[v];
    }

    /**
     * Returns the number of vertices connected to the source vertex {@code s}.
     * 
     * @return the number of vertices connected to the source vertex {@code s}
     */
    public int count() {
        return count;
    }

    /**
     * 
     */
    private void validateVertex(int v) {
        int V = marked.length;
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
        In in = new In(args[0]);
        Graph G = new Graph(in);
        int s = Integer.parseInt(args[1]);
        DepthFirstSearch search = new DepthFirstSearch(G, s);
        for (int v = 0; v < G.V(); v++) {
            if (search.marked(v)) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
        if (search.count() != G.V()) {
            System.out.println("NOT connected");
        } else {
            System.out.println("connected");
        }
    }
}