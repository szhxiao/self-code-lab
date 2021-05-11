import java.util.Arrays;

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
public class Replacing {
    public static String knights = "Then, when you have found the shrubbery, you must"
                                + " cut down thee mightiest tree in the forest..."
                                + " with... a herring!";

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println(knights.replaceFirst("f\\w+", "located"));
        System.out.println(knights.replaceAll("shrubbery|tree|herring", "banana"));
    }
}

/**
 * output:
 * Then, when you have located the shrubbery, 
 * you must cut down thee mightiest tree in the forest... with... a herring!
 * 
 * Then, when you have found the banana, 
 * you must cut down thee mightiest banana in the forest... with... a banana!
 */