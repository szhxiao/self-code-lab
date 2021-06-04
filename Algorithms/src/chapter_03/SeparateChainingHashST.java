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
public class SeparateChainingHashST<Key, Value> {
    private int n;      // number of key-value pairs
    private int m;      // hash table size
    // array of linked-list symbol tables
    private SequentialSearchST<Key, Value>[] st;
    
    private static final int INIT_CAPACITY = 4;

    /**
     * Initializes an empty symbol table.
     */
    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * 
     * @param m the initial number of chains
     */
    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m];

        for (int i = 0; i < m; i++) {
            st[i] = new SequentialSearchST<>();
        }
    }

    // resize the hash table to have the given number of chains,
    // rehashing all of the keys
    private void resize(int chains) {
        SeparateChainingHashST<Key, Value> temp = new SeparateChainingHashST<>(chains);

        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }

        this.m = temp.m;
        this.n = temp.n;
        this.st = temp.st;
    }

    // hash function for keys - returns value between 0 and m-1
    private int hashTextbook(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

    // hash function for keys- returns value between 0 and m-1
    private int hash(Key key) {
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12) ^ (h >>> 7) ^ (h >>> 4);
        return h & (m - 1);
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
     * Returns true if the symbol table is empty.
     * 
     * @return {@code true} if the symbol table is empty
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
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
        int i = hash(key);
        return st[i].get(key);
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
        
        // double table size if average length of list >= 10
        if (n >= 10 * m) {
            resize(2 * m);
        }
        
        int i = hash(key);
        if (!st[i].contains(key)) {
            n++;
        }
        st[i].put(key, value);
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
        
        int i = hash(key);
        if (st[i].contains(key)) {
            n--;
        }

        // halve table size if average length of list <= 2
        if (m > INIT_CAPACITY && n <= 2*m) {
            resize(m/2);
        }
    }

    

    /**
     * Returns all keys in the symbol table.
     * 
     * @return all keys in the symbol table
     */
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<>();
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                queue.enqueue(key);
            }
        }
        return queue;
    }

    /**
     * Unit tests.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<>();
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
 * H 5
 * P 10
 * M 9
 * X 7
 * A 8
 * E 12
 * S 0
 * C 4
 * R 3
 */