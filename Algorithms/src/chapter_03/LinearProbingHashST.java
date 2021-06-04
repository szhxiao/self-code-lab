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
public class LinearProbingHashST<Key, Value> {
    private int n;          // number of key-value pairs
    private int m;          // hash table size
    private Key[] keys;     // the keys
    private Value[] values; // the values
    
    private static final int INIT_CAPACITY = 4;

    /**
     * Initializes an empty symbol table.
     */
    public LinearProbingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * 
     * @param m the initial number of chains
     */
    public LinearProbingHashST(int capacity) {
        m = capacity;
        n = 0;
        keys = (Key[]) new Object[m];
        values = (Value[]) new Object[m];
    }

    // resize the hash table to have the given number of chains,
    // rehashing all of the keys
    private void resize(int capacity) {
        LinearProbingHashST<Key, Value> temp = new LinearProbingHashST<>(capacity);

        for (int i = 0; i < m; i++) {
            if (keys[i] != null){
                temp.put(keys[i], values[i]);
            }
        }

        keys = temp.keys;
        values = temp.values;
        m = temp.m;
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
        for (int i = hash(key); keys[i] != null; i = (i + 1) % m) {
            if (keys[i].equals(key)) {
                return values[i];
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
        
        // double table size if 50% full
        if (n >= m/2) {
            resize(2 * m);
        }
        
        int i = hash(key);
        for ( ; keys[i] != null; i = (i+1)%m) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
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
        if (!contains(key)) {
            return;
        }
        
        // find position i of key
        int i = hash(key);
        while (!key.equals(keys[i])) {
            i = (i + 1) % m;
        }

        // delete key and associated value
        keys[i] = null;
        values[i] = null;

        // rehash all keys in same cluster
        i = (i + 1) % m;
        while (keys[i] != null) {
            // delete keys[i] an values[i] and reinsert
            Key keyToRehash = keys[i];
            Value valueToRehash = values[i];
            keys[i] = null;
            values[i] = null;
            n--;
            put(keyToRehash, valueToRehash);
            i = (i + 1) % m;
        }
        n--;

        // halves size of array if it's 12.5% full or less
        if (n > 0 && n <= m/8) {
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
            if (keys[i] != null) {
                queue.enqueue(keys[i]);
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