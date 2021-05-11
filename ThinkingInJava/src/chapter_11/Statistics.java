/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates simple demonstration of HashMap.
 */

import java.util.*;

public class Statistics {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}

/**
 * output:
 * {0=481, 1=502, 2=489, 3=508, 4=481, 5=503, 
 * 6=519, 7=471, 8=468, 9=549, 10=513, 
 * 11=531, 12=521, 13=506, 14=477, 15=497, 
 * 16=533, 17=509, 18=478, 19=464}
 */
