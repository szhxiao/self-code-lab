/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */


/**
 * This program shows properties.
 */
public class ShowProperties {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}

/*
output:

 */