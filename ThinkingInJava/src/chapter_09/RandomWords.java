/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * This program demonstrates implementing an interface 
 * to conform to a method.
 */

public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = 
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = 
        "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        } 
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomWords(10));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}

/**
 * output:
 * Yazeruyac
 * Fowenucor
 * Goeazimom
 * Raeuuacio
 * Nuoadesiw
 * Hageaikux
 * Ruqicibui
 * Numasetih
 * Kuuuuozog
 * Waqizeyoy
 */