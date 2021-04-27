/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class MapData<K, V> extends LinkedHashMap<K, V> {
    // A single Pair Generator
    public MapData(Generator<Pair<K, V>>gen, int quantity) {
        for(int i = 0; i < quantity; i++) {
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    // Two separate Generators
    public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
        for(int i = 0; i < quantity; i++) {
            put(genK.next(), genV.next());
        }
    }

    // A key Generator and a single value
    public MapData(Generator<K> genK, V value, int quantity) {
        for(int i = 0; i < quantity; i++) {
            put(genK.next(), value);
        }
    }

    // An Iterable and a single value
    public MapData(Iterable<K> genK, Generator<V> genV) {
        for(K key : genK) {
            put(key, genV.next());
        }
    }

    // An Interable and a single value
    public MapData(Iterable<K> genK, V value) {
        for(K key : genK) {
            put(key, value);
        }
    }
}
