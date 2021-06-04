/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Scanner;

/**
 * Represents a priority queue of generic keys.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    /**
     * Initializes an empty priority queue with the given initial capacity.
     * 
     * @param maxN the initial capacity of this priority queue
     */
    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }
    
    /**
     * Returns true if the priority queue is empty.
     * 
     * @return {@code true} if the priority queue is empty
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * Returns numbers of keys on the priority queue.
     * 
     * @return the number of keys on the priority queue
     */
    public int size() {
        return N;
    }

    /**
     * Adds a new key to this priority queue.
     * 
     * @param v the new key to add to the priority queue
     */
    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    /**
     * Removes and returns the largest key on the priority queue.
     * 
     * @return the largest key on the priority queue
     */
    public Key delMax() {
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }
    
    private void sink(int k) {
        while (2*k <= n) {
            int j = 2 * k;
            if (j < n && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }


    /**
     * Returns true if pq[i] < pq[j]
     * 
     * @param i the index of pq
     * @param j the other index of pq
     * @return {@code true} if pq[i] < pq[j]
     *         {@code false} otherwise
     */
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    /**
     * Exchange the value of pq[i] and pq[j].
     * 
     * @param i the index of pq
     * @param j the other index of pq
     */
    private void exch(int i, int j) {
        Key tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }


    /**
     * Reads in a sequence of strings from standard input;
     * sorts them and prints them to standard output in ascending order.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // String[] a = In.readStrings();
        Scanner in = new Scanner(System.in);
        String[] a = in.nextLine().split(" ");
        sort(a);
        assert isSorted(a);
        show(a);
    }
}

/**
 * output:
 *
 */