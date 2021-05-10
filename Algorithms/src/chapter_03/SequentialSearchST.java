/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

/**
 * 
 */
public class SequentialSearchST<Key, Value> {
    private int n;
    private Node first;

    private class Node {
        private Key key;
        private Value value;
        private Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    // public SequentialSearchST() {

    // }


    /**
     * Returns the value associated with the given key in the symbol table.
     * 
     * @param key the key
     * @return the value associated with the given key if the key in the symbol table
     *         {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("calls get() with null key");
        }

        for (Node tmp = first; tmp != null; tmp = tmp.next) {
            if (key.equals(tmp.key)) {
                return tmp.value;
            }
        }

        return null;
    }

    /**
     * Insets the specified key-value pair into the symbol table, 
     * overwriting the old value with the new value if the symbol table 
     * already contains the specified key.
     * Deletes the specified key (and its associated value) from the symbol table
     * if the specified value is {@code null}
     * 
     * @param key the key
     * @param val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("calls put() with null key");
        }

        if (value == null) {
            delete(key);
            return;
        }
        
        for (Node tmp = first; tmp != null; tmp = tmp.next) {
            if (key.equals(tmp.key)) {
                tmp.value = value;
                return;
            }
        }

        first = new Node(key, value, first);
        n++;
    }

    /**
     * Removes the specified key and its associated value from this symbol table.
     * 
     * @param key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("calls delete() with null key");
        }
        first = delete(first, key);
    }

    /**
     * Deletes key in linked list beginning at Node x.
     * 
     * @param x the beginning Node
     * @param key the value
     * @return
     */
    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    /**
     * Returns true if the symbol table contain the given key.
     * 
     * @param key the key
     * @return {@code true} if the symbol table contains {@code key} 
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("calls contains() with null key");
        }
        return get(key) != null;
    }

    /**
     * Returns true if the symbol table is empty.
     * 
     * @return {@code true} if the symbol table is empty
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    
    /**
     * Returns the number of key-value pairs in the symbol table.
     * 
     * @return the number of key-value pairs in the symbol table
     */
    public int size() {
        return n;
    }

    /**
     * Returns all keys in the symbol table.
     * 
     * @return all keys in the symbol table
     */
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<>();
        for (Node tmp = first; tmp != null; tmp = tmp.next) {
            queue.enqueue(tmp.key);
        }
        return queue;
    }

    /**
     * Unit tests.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            st.put(key, i);
        }
        for (String s : st.keys()) {
            System.out.println(s + " " + st.get(s));
        }
    }
}

/**
 * output:
 * L 11
 * P 10
 * M 9
 * X 7
 * H 5
 * C 4
 * R 3
 * A 8
 * E 12
 */