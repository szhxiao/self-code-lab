/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * The Collection.fill() & Collection.nCopies() methods
 */

public class CollectionData<T> extends ArrayList {
    public CollectionData(Generator<T> gen, int quantity) {
        for(int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    // A generic convenience method
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}

/**
 * output:
 * [StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello]
 * [StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!]
 */