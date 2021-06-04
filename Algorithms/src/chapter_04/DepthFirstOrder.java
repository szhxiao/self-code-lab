/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */


public class DepthFirstOrder {
    private boolean[] marked; // marked[v] = has v been marked in dfs?
    private int[] pre; // pre[v] = preorder number of v
    private int[] post; // post[v] = postorder number of v
    private Queue<Integer> preorder; // vertices in preorder
    private Queue<Integer> postorder; // vertices in postorder
    private int preCounter; // counter or preorder numbering
    private int postCounter; // counter for postorder numbering
    
    /**
     * Determines a depth-first order for the digraph {@code G}.
     * 
     * @param G the digraph
     */
    public DepthFirstOrder(Digraph G) {
        pre = new int[G.V()];
        post = new int[G.V()];
        postorder = new Queue<>();
        preorder = new Queue<>();
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }
    }

    /**
     * Runs DFS in digraph G from vertex v and compute preorder/postorder
     */
    private void dfs(Digraph G, int v) {
        marked[v] = true;
        pre[v] = preCounter++;
        preorder.enqueue(v);
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
        postorder.enqueue(v);
        post[v] = postCounter;
    }

    /**
     * Returns the preorder number of vertex {@code v}.
     * 
     * @param v the vertex
     * @return the preorder number of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int pre(int v) {
        validateVertex(v);
        return pre[v];
    }

    /**
     * Returns the postorder of vertex {@code v}.
     * 
     * @param v the vertex
     * @return the postorder number of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public int post(int v) {
        validateVertex(v);
        return post[v];
    }

    /**
     * Returns the vertices in postorder.
     * 
     * @return the vertices in postorder, as an iterable of vertices
     */
    public Iterable<Integer> post() {
        return postorder;
    }

    /**
     * Returns the vertices in preorder.
     * 
     * @return the vertices in preorder, as an iterable of vertices
     */
    public Iterable<Integer> pre() {
        return preorder;
    }

    /**
     * Returns the vertices in reverse postorder.
     * 
     * @return the vertices in reverse postorder, as an iterable of vertices
     */
    public Iterable<Integer> reversePost() {
        Stack<Integer> reverse = new Stack<>();
        for (int v : postorder) {
            reverse.push(v);
        }
        return reverse;
    }

    /**
     * throws an IllegalArgumentException unless {@code 0 <= v < V}
     */
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
        }
    }
    
    public static void main(String[] args) {
        In in = new In(args[0]);
        Digraph G = new Digraph(in);

        DepthFirstOrder dfo = new DepthFirstOrder(G);
        System.out.println("    v   pre    post");
        System.out.println("___________________");
        for (int v = 0; v < G.V(); v++) {
            System.out.printf("%4d %4d %4d\n", v, dfo.pre(v), dfo.post(v));
        }

        System.out.print("Preorder: ");
        for (int v : dfo.pre()) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Postorder: ");
        for (int v : dfo.post()) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Reverse postorder: ");
        for (int v : dfo.reversePost()) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
