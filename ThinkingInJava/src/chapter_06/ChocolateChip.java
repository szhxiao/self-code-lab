/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * {@code ChocolateChip}
 */
public class ChocolateChip extends Cookie {

    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}

/**
 * output:
 * Cookie constructor
 * ChocolateChip constructor
 * bite
 */