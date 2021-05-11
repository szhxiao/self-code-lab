/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


public class BoundedClassReferences {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}

/**
 * output:
 * 
 */