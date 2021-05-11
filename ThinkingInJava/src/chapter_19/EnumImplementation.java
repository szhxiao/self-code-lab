/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Random;


enum CartoonCharacter implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNDHY, SILLY, BOUNCY, NUTTY, BOB;

    private Random rand = new Random(47);

    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
        System.out.println();
    }
}

/**
 * output:
 * BOB, PUNDHY, BOB, SPANKY, NUTTY, PUNDHY, SLAPPY, NUTTY, NUTTY, SLAPPY, 
 */