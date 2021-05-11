/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * 
 */

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class ArrayOptions {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        BerylliumSphere[] a;

        BerylliumSphere[] b = new BerylliumSphere[5];
        System.out.println("b: " + Arrays.toString(b));
        
        BerylliumSphere[] c = new BerylliumSphere[4];
        for(int i = 0; i < c.length; i++) {
            if(c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }

        BerylliumSphere[] d = {
            new BerylliumSphere(),
            new BerylliumSphere(),
            new BerylliumSphere()
        };

        a = new BerylliumSphere[] {
            new BerylliumSphere(),
            new BerylliumSphere()
        };

        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);

        a = d;
        System.out.println("a.length = " + a.length);


        int[] e;
        int[] f = new int[5];
        System.out.println("f: " + Arrays.toString(f));
        
        int[] g = new int[4];
        for(int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }

        int[] h = {11, 47, 93};

        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);

        e = h;
        System.out.println("e.length = " + e.length);
        e = new int[] {1, 2};
        System.out.println("e.length = " + e.length);

    }
}

/**
 * output:
 * b: [null, null, null, null, null]
 * a.length = 2
 * b.length = 5
 * c.length = 4
 * d.length = 3
 * a.length = 3
 * f: [0, 0, 0, 0, 0]
 * f.length = 5
 * g.length = 4
 * h.length = 3
 * e.length = 3
 * e.length = 2
 */