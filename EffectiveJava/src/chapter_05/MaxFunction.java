import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see
 */

import java.util.Iterator;

public class MaxFunction {
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }
}
