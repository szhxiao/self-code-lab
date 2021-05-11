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
 * 
 */

public class RandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer charBuffer) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        charBuffer.append(result);
        return result.length();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Adapted)
    }
}

/**
 * output:
 * 0.7271157860730044 0.5309454508634242 0.16020656493302599 0.18847866977771732 0.5166020801268457 0.2678662084200585 0.2613610344283964
 */