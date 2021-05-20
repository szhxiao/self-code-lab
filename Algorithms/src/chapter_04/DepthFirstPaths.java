/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class DepthFirstPaths {
    private boolean[] marked;       // marked[v] = is there an s-v path?
    private int[] edgeTo; // edgeTo[v] = last edge on s-v path
    private final int s; // source vertex
    
    /**
     * Computes a path between {@code s} and every other vertex in graph {@code G}.
     * 
     * @param G the graph
     * @param s the source vertex
     * @throws IllegalArgumentException unless {@code 0 <= s < V}
     */
    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        validateVertex(s);
        dfs(G, s);
    }

    /**
     * depth first search from v
     */
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex {@code s} and vertex {@code v}
     * 
     * @param v the vertex
     * @return {@code true} if there is a path
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public boolean hasPathTo(int v) {
        validateVertex(v);
        return marked[v];
    }

    /**
     * Returns a path between the source vertex {@code s} 
     * and vertex {@code v}, or {@code null} if no such path.
     * 
     * @param v the vertex
     * @return the sequence of vertices on a path between 
     * the source vertex {@code s} and vertex {@code v}.
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> pathTo(int v) {
        validateVertex(v);
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }

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
        DepthFirstPaths dfs = new DepthFirstPaths(G, s);

        for (int v = 0; v < G.V(); v++) {
            if (dfs.hasPathTo(v)) {
                System.out.printf("%d to %d: ", s, v);
                for (int x : dfs.pathTo(v)) {
                    if (x == s) {
                        System.out.print(x);
                    } else {
                        System.out.print("-" + x);
                    }
                }
                System.out.println();
            } else {
                System.out.printf("%d to %d: not connected\n", s, v);
            }
        }
    }
}

/**
 * command:
 * javac DepthFirstPaths.java
 * java DepthFirstPaths tinyCG.txt 0
 * 
 * output:
 * 0 to 0: 0
 * 0 to 1: 0-2-1
 * 0 to 2: 0-2
 * 0 to 3: 0-2-3
 * 0 to 4: 0-2-3-4
 * 0 to 5: 0-2-3-5
 */