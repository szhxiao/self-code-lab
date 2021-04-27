/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Random;

/**
 * {@code MathOps}
 * This program demonstrates the mathematical operators.
 */
public class MathOps {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);

        i = j + k;
        System.out.println("j + k : " + i);

        i = j - k;
        System.out.println("j - k : " + i);

        i = k / j;
        System.out.println("k / j : " + i);

        i = k * j;
        System.out.println("k * j : " + i);

        i = k % j;
        System.out.println("k % j : " + i);

        // Float-point number tests
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);

        u = v + w;
        System.out.println("v + w : " + u);

        u = v - w;
        System.out.println("v - w : " + u);

        u = v * w;
        System.out.println("v * w : " + u);

        u = v / w;
        System.out.println("v / w : " + u);

        u += v;
        System.out.println("u += v : " + u);

        u -= v;
        System.out.println("v -= : " + u);

        u *= v;
        System.out.println("v *= : " + u);

        u /= v;
        System.out.println("v /= : " + u);
    }
}

/**
 * output:
 * j : 59
 * k : 56
 * j + k : 115
 * j - k : 3
 * k / j : 0
 * k * j : 3304
 * k % j : 56
 * v : 0.5309454
 * w : 0.0534122
 * v + w : 0.5843576
 * v - w : 0.47753322
 * v * w : 0.028358962
 * v / w : 9.940527
 * u += v : 10.471473
 * v -= : 9.940527
 * v *= : 5.2778773
 * v /= : 9.940527
 */