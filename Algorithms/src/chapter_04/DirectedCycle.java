/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

/**
 * Determines whether a digraph has a directed cycle.
 */
public class DirectedCycle {
    private boolean[] marked; // marked[v] = has vertex v been marked?
    private int[] edgeTo; // edgeTo[v] = previous vertex on path to v
    private boolean[] onStack; // onStack[v] = is vertex on the stack?
    private Stack<Integer> cycle; // directed cycle
    
    /**
     * Determines whether the digraph {@code G} has a directed cycle
     * and, if so, finds such a cycle.
     * 
     * @param G the digraph
     */
    public DirectedCycle(Digraph G) {
        marked = new boolean[G.V()];
        onStack = new boolean[G.V()];
        edgeTo = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v] && cycle == null) {
                dfs(G, v);
            }
        }
    }

    /**
     * check that algorithm computes either the topological order 
     * or finds a directed cycle.
     */
    private void dfs(Digraph G, int v) {
        onStack[v] = true;
        marked[v] = true;
        for (int w : G.adj(v)) {
            // short circuit if directed cycle found
            if (cycle != null) {
                return;
            }

            // found new vertex, so recur
            else if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }

            // trace back directed cycle
            else if (onStack[w]) {
                cycle = new Stack<>();
                for (int x = v; x != w; x = edgeTo[x]) {
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
        onStack[v] = false;
    }

    /**
     * Does the digraph have a directed cycle?
     * 
     * @return {@code true} if the digraph has a directed cycle;
     *         {@code false} otherwise
     */
    public boolean hasCycle() {
        return cycle != null;
    }

    /**
     * Returns a directed cycle if the digraph has a directed cycle
     * and null otherwise.
     * 
     * @return a directed cycle if the digraph has a directed cycle
     *         and {@code null} otherwise
     */
    private Iterable<Integer> cycle() {
        return cycle;
    }

    /**
     * Unit tests 
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        Digraph G = new Digraph(in);

        DirectedCycle finder = new DirectedCycle(G);
        if (finder.hasCycle()) {
            System.out.print("Directed cycle: ");
            for (int v : finder.cycle()) {
                System.out.print(v + " ");
            }
            System.out.println();
        } else {
            System.out.println("No directed cycle");
        }
        System.out.println();
    }
}

/**
 * command:
 * javac DirectedCycle.java
 * java DirectedCycle tinyDG.txt 
 * 
 * output:
 * Directed cycle: 3 4 5 3 
 */