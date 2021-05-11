/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


public class WildcardClassReferences {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}

/**
 * output:
 * 
 */