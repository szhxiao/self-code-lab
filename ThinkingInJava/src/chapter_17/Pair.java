/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }
}