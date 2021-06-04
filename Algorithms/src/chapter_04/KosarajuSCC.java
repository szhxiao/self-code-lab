/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class KosarajuSCC {
    private boolean[] marked;   // marked[v] = has vertex v been marked?
    private int[] id;   // id[v] = id of connected component containing v
    private int count; // number of connected components

    /**
     * Computes the connected components of the undirected graph {@code G}.
     * 
     * @param G the undirected graph
     */
    public KosarajuSCC(Digraph G) {
        // compute reverse postorder of reverse graph
        DepthFirstOrder dfs = new DepthFirstOrder(G.reverse());

        // run DFS on G, using reverse postorder to guide calculation
        marked = new boolean[G.V()];
        id = new int[G.V()];
        for (int v : dfs.reversePost()) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }

    /**
     * DFS on graph G
     */
    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    /**
     * Returns the component id of the connected component containing vertex {@code v}.
     * 
     * @param v the vertex
     * @return the component id of the connected component containing vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int id(int v) {
        validateVertex(v);
        return id[v];
    }

    /**
     * Returns the number of string components.
     * 
     * @return the number of connected components
     */
    public int count() {
        return count;
    }

    /**
     * Are vertices {@code v} and {@code w} in the same strong component?
     * 
     * @param v one vertex
     * @param w the other vertex
     * @return {@code true} if vertices {@code v} and {@code w} are in the same connected component;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean strongConnected(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        return id[v] == id[w];
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
        Digraph G = new Digraph(in);
        KosarajuSCC scc = new KosarajuSCC(G);

        // number of connected components
        int m = scc.count();
        System.out.println(m + " strong components");

        // compute list of vertices in each connected component
        Queue<Integer>[] components = (Queue<Integer>[]) new Queue[m];
        for (int i = 0; i < m; i++) {
            components[i] = new Queue<Integer>();
        }
        for (int v = 0; v < G.V(); v++) {
            components[scc.id(v)].enqueue(v);
        }

        // print results
        for (int i = 0; i < m; i++) {
            for (int v : components[i]) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

/**
 * command:
 * javac KosarajuSCC.java
 * java KosarajuSCC tinyDG.txt 
 * 
 * output:
 * 5 strong components
 * 1 
 * 0 2 3 4 5 
 * 9 10 11 12 
 * 6 
 * 7 8 
 */