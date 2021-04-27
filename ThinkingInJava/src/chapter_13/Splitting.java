/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.Arrays;

/**
 *
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must"
                                + " cut down thee mightiest tree in the forest..."
                                + " with... a herring!";
    
    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}

/**
 * output:
 * [Then,, when, you, have, found, the, shrubbery,, you, must,
 *  cut, down, thee, mightiest, tree, in, the, forest..., with..., a, herring!]
 * 
 * [Then, when, you, have, found, the, shrubbery, you, must,
 *  cut, down, thee, mightiest, tree, in, the, forest, with, a, herring]
 * 
 * [The, whe, you have found the shrubbery, you must cut dow, 
 * thee mightiest tree i, the forest... with... a herring!]
 */