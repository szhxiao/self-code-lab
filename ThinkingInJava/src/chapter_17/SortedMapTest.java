/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Iterator;
import java.util.TreeMap;

public class SortedMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(0, "A0");
        sortedMap.put(1, "B0");
        sortedMap.put(2, "C0");
        sortedMap.put(3, "D0");
        sortedMap.put(4, "E0");
        sortedMap.put(5, "F0");
        sortedMap.put(6, "G0");
        sortedMap.put(7, "H0");
        sortedMap.put(8, "I0");
        sortedMap.put(9, "J0");

        System.out.println(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        System.out.println(low);
        System.out.println(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) {
                low = it.next();
            }
            if (i == 6) {
                high = it.next();
            } else {
                it.next();
            }
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedMap.subMap(low, high));
        System.out.println(sortedMap.headMap(high));
        System.out.println(sortedMap.tailMap(low));
    }
}

/**
 * output:
 * {0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 6=G0, 7=H0, 8=I0, 9=J0}
 * 0
 * 9
 * 3
 * 7
 * {3=D0, 4=E0, 5=F0, 6=G0}
 * {0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 6=G0}
 * {3=D0, 4=E0, 5=F0, 6=G0, 7=H0, 8=I0, 9=J0}
 */