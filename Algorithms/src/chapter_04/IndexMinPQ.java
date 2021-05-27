/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IndexMinPQ<Key extends Comparable<Key>> implements Iterable<Integer> {
    private int[] pq; // binary heap using 1-based indexing
    private int[] qp; // inverse of 
    private int maxN; // maximum number of elements on PQ
    private int n; // number of item on priority queue
    private Key[] keys; // keys[i] = priority of i

    /**
     * Initializes an empty indexed priority queue with indices between 
     * {@code 0} and {@code maxN-1}.
     * 
     * @param maxN the keys on the priority queue are index
     * @throws IllegalArgumentException if {@code maxN < 0}
     */
    public IndexMinPQ(int maxN) {
        if (maxN < 0) {
            throw new IllegalArgumentException();
        }
        
        this.maxN = maxN;
        n = 0;
        keys = (Key[]) new Comparable[maxN + 1];
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];
        for (int i = 0; i <= maxN; i++) {
            qp[i] = -1;
        }
    }
    
    /**
     * Returns true if this priority queue is empty.
     * 
     * @return {@code true} if the priority queue is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of keys on the priority queue.
     * 
     * @return the number of keys on the priority queue
     */
    public int size() {
        return n;
    }

    /**
     * Is {@code i} and index on the priority queue?
     * 
     * @param i an index
     * @return {@code true} if {@code i} is an index on the priority queue;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     */
    public boolean contains(int i) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        return qp[i] != -1;
    }

    /**
     * Associates key with index {@code i}
     * 
     * @param i an index
     * @param key the key to associate with index {@code i}
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     * @throws IllegalArgumentException if there already is an item associated
     */
    public void insert(int i, Key key) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (contains(i)) {
            throw new IllegalArgumentException("index is already in the priority queue");
        }

        n++;
        qp[i] = n;
        pq[n] = i;
        keys[i] = key;
        swim(n);
    }

    /**
     * Returns an index associated with a minimum key.
     * 
     * @return an index associated with a minimum key
     * @throws NoSuchElementException if the priority queue is empty
     */
    public int minIndex() {
        if (n == 0) {
            throw new NoSuchElementException("Priority queue underflow");
        }
        return pq[1];
    }

    /**
     * Returns a minimum key.
     * 
     * @return a minimum key
     * @throws NoSuchElementException if the priority queue is empty
     */
    public Key minKey() {
        if (n == 0) {
            throw new NoSuchElementException("Priority queue underflow");
        }
        return keys[pq[1]];
    }
    
    /**
     * Removes a minimum key and returns its associated index.
     * 
     * @return an index associated with a minimum key
     * @throws NoSuchElementException if the priority queue is empty
     */
    public int delMin() {
        if (n == 0) {
            throw new NoSuchElementException("Priority queue underflow");
        }
        int min = pq[1];
        exch(1, n--);
        sink(1);
        assert min == pq[n + 1];
        qp[min] = -1;
        keys[min] = null;
        pq[n + 1] = -1;
        return min;
    }

    /**
     * Removes the key associated with index {@code i}.
     * 
     * @param i the index of the key to remove
     * @throws IllegalArgumentException unlesss {@code 0 <= i < maxN}
     * @throws NoSuchElementException no key is associated with index {@code i}
     */
    public void delete(int i) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (!contains(i)) {
            throw new NoSuchElementException("index is not in the priority queue");
        }
        
        int index = qp[i];
        exch(index, n--);
        swim(index);
        sink(index);
        keys[i] = null;
        qp[i] = -1;
    }

    /**
     * Returns the key associated with index {@code i}.
     * 
     * @param i the index of the key to return
     * @return the key associated with index {@code i}
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     * @throws NoSuchElementException no key is associated with index {@code i}
     */
    public Key keyOf(int i) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (!contains(i)) {
            throw new NoSuchElementException("index is not in the priority queue");
        } else {
            return keys[i];
        }
    }

    /**
     * Change the key associated with index {@code i} to the specified value.
     * 
     * @param i the index of the key to change
     * @param key change the key associated with index {@code i} to the key
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     * @throws NoSuchElementException no key is associated with index {@code i}
     */
    public void changeKey(int i, Key key) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (!contains(i)) {
            throw new NoSuchElementException("index is not in the priority queue");
        }

        keys[i] = key;
        swim(qp[i]);
        sink(qp[i]);

    }
    
    /**
     * Decrease the key associated with index {@code i} to the specified value.
     * 
     * @param i the index of the key to decrease
     * @param key decrease the key associated with index {@code i}
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     * @throws IllegalArgumentException if {@code key >= keyOf(i)}
     * @throws NoSuchElementException no key is associated with index {@code i}
     */
    public void decreaseKey(int i, Key key) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (!contains(i)) {
            throw new NoSuchElementException("index is not in the priority queue");
        }

        if (keys[i].compareTo(key) <= 0) {
            throw new IllegalArgumentException(
                    "Calling decreaseKey() with given argument would not strictly decrease the key");
        }
        keys[i] = key;
        swim(qp[i]);
    }

    /**
     * Increase the key associated with index {@code i} to the specified value.
     * 
     * @param i the index of the key to increase
     * @param key increase the key associated with index {@code i}
     * @throws IllegalArgumentException unless {@code 0 <= i < maxN}
     * @throws IllegalArgumentException if {@code key >= keyOf(i)}
     * @throws NoSuchElementException no key is associated with index {@code i}
     */
    public void increaseKey(int i, Key key) {
        if (i < 0 || i >= maxN) {
            throw new IllegalArgumentException();
        }
        if (!contains(i)) {
            throw new NoSuchElementException("index is not in the priority queue");
        }

        if (keys[i].compareTo(key) <= 0) {
            throw new IllegalArgumentException(
                    "Calling increaseKey() with given argument would not strictly decrease the key");
        }
        keys[i] = key;
        sink(qp[i]);
    }


    private void swim(int k) {
        while (k > 1 && greater(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }
    
    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && greater(j, j + 1)) {
                j++;
            }
            if (!greater(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }
    
    private boolean greater(int i, int j) {
        return keys[pq[i]].compareTo(keys[pq[j]]) > 0;
    }

    private void exch(int i, int j) {
        int swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;

        qp[pq[i]] = i;
        qp[pq[j]] = j;
    }

    /**
     * Returns an iterator that iterates over the keys on the priority queue.
     */
    public Iterator<Integer> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<Integer> {
        private IndexMinPQ<Key> copy;

        public HeapIterator() {
            copy = new IndexMinPQ<>(pq.length - 1);
            for (int i = 1; i <= n; i++) {
                copy.insert(pq[i], keys[pq[i]]);
            }
        }

        public boolean hasNext() {
            return !copy.isEmpty();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy.delMin();
        }
    }

    /**
     * Unit tests
     * 
     * @param args the command-line
     */
    public static void main(String[] args) {
        // insert a bunch of strings
        String[] strings = {"it", "was", "the", "best", "of", "time",
                "it", "was", "the", "worst" };
        
        IndexMinPQ<String> pq = new IndexMinPQ<>(strings.length);
        for (int i = 0; i < strings.length; i++) {
            pq.insert(i, strings[i]);
        }

        // delete and print each key
        while (!pq.isEmpty()) {
            int i = pq.delMin();
            System.out.println(i + " " + strings[i]);
        }
        System.out.println();

        // reinsert the same strings
        for (int i = 0; i < strings.length; i++) {
            pq.insert(i, strings[i]);
        }

        // print each key using the iterator
        for (int i : pq) {
            System.out.println(i + " " + strings[i]);
        }
        while (!pq.isEmpty()) {
            pq.delMin();
        }
    }
}
