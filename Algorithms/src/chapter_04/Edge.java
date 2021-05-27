/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    /**
     * Initializes an edge between vertices {@code v} and {@code w}
     * of the given {@code weight}.
     * 
     * @param v one vertex
     * @param w the other vertex
     * @param weight the weight of this edge
     * @throws IllegalArgumentException if either {@code v} is {@code NaN}
     */
    public Edge(int v, int w, double weight) {
        if (v < 0) {
            throw new IllegalArgumentException("vertex index must be a nonnegative integer");
        }

        if (w < 0) {
            throw new IllegalArgumentException("vertex index must be a nonnegative integer");
        }

        if (Double.isNaN(weight)) {
            throw new IllegalArgumentException("Weight is NaN");
        }

        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    /**
     * Returns the weight of the edge.
     * 
     * @return the weight of the edge
     */
    public double weight() {
        return weight;
    }

    /**
     * Returns the endpoint of the edge.
     * 
     * @return either endpoint of the edge
     */
    public int either() {
        return v;
    }

    /**
     * Returns the endpoint of the edge that is different from the given vertex.
     * 
     * @param vertex one endpoint of the edge
     * @return the other endpoint of the edge
     * @throws IllegalArgumentException if the vertex is not 
     *         one of the endpoints of the edge
     */
    public int other(int vertex) {
        if (vertex == v) {
            return w;
        } else if (vertex == w) {
            return v;
        } else {
            throw new IllegalArgumentException("Illegal endpoint");
        }
    }

    /**
     * Compares two edges by weight.
     */
    @Override
    public int compareTo(Edge that) {
        return Double.compare(this.weight, that.weight);
    }

    /**
     * Returns a string representation of the edge.
     */
    public String toString() {
        return String.format("%d-%d %.5f", v, w, weight);
    }

    /**
     * Unit tests
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Edge e = new Edge(12, 34, 5.67);
        System.out.println(e);
    }
}

/**
 * output:
 * 12-34 5.67000
 */