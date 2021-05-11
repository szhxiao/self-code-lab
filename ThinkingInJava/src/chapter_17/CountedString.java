/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String str) {
        s = str;
        created.add(s);
        for (String string : created) {
            if (string.equals(s)) {
                id++;
            }
        }
    }

    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString) o).s) && id == ((CountedString) o).id;
    }
    
    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap<>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i);
        }

        System.out.println(map);
        for (CountedString cstring : cs) {
            System.out.print("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }
    }
}

/**
 * output:
 * {String: hi id: 4 hashCode(): 146450=3, String: hi id: 5 hashCode(): 146451=4, 
 * String: hi id: 2 hashCode(): 146448=1, String: hi id: 3 hashCode(): 146449=2, 
 * String: hi id: 1 hashCode(): 146447=0}
 * Looking up String: hi id: 1 hashCode(): 1464470
 * Looking up String: hi id: 2 hashCode(): 1464481
 * Looking up String: hi id: 3 hashCode(): 1464492
 * Looking up String: hi id: 4 hashCode(): 1464503
 * Looking up String: hi id: 5 hashCode(): 1464514
 */