/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 *
 */

public class BasicGeneratorDemo {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Generator<CountedObject> gen = 
            BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}

/**
 * output:
 * CountedObject 0
 * CountedObject 1
 * CountedObject 2
 * CountedObject 3
 * CountedObject 4
 */