/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * Returning arrays from methods.
 */
public class IceCream {
    private static Random rand = new Random(47);

    static final String[] FLAVORS = {
        "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
        "Mint Chip", "Mocha Almond Fudge", "RumRaisin",
        "Praline Cream", "Mud Pie"
    };

    public static String[] flavorSet(int n) {
        if(n > FLAVORS.length) {
            throw new IllegalArgumentException("See too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for(int i = 0; i < n; i++) {
            int t;
            do {
                t = rand.nextInt(FLAVORS.length);
            } while(picked[t]);
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}

/**
 * output:
 * [RumRaisin, Mint Chip, Mocha Almond Fudge]
 * [Chocolate, Strawberry, Mocha Almond Fudge]
 * [Strawberry, Mint Chip, Mocha Almond Fudge]
 * [RumRaisin, Vanilla Fudge Swirl, Mud Pie]
 * [Vanilla Fudge Swirl, Chocolate, Mocha Almond Fudge]
 * [Praline Cream, Strawberry, Mocha Almond Fudge]
 * [Mocha Almond Fudge, Strawberry, Mint Chip]
 */