/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class UF {
    // id of components
    private int[] id;
    // number of components
    private int count;

    /**
     * Initializes an empty union-find data structure with
     * {@code N} elements {@code 0} through {@code N-1}
     * @param N
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * Returns the number of sets.
     * 
     * @return the number of sets
     */
    public int count() {
        return count;
    }

    /**
     * Returns true if the two elements are in the same set.
     * 
     * @param p one element
     * @param q the other element
     * @return {@code true} if {@code p} and {@code q} are in the same set;
     *         {@code false} otherwise
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /************* start quick-find ********************
    public int find(int p) {
    return id[p];
    }

    public void union(int p, int q) {
    int pID = find(p);
    int qID = find(q);

    if (pID == qID) {
    return;
    }
    for (int i = 0; i < id.length; i++) {
    if (id[i] == pID) {
        id[i] = qID;
    }
    }
    count--;
    }
    ************* end quick-find ********************/

    /************** start quick-union *********************/

    private int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
        
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;

        count--;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) {
                continue;
            }
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(uf.count() + "components");
    }
}

/**
* output:
*
*/