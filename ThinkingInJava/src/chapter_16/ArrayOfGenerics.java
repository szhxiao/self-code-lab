/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class ArrayOfGenerics {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        // "Unchecked" warning
        ls = (List<String>[])la;
    }
}

/**
 * output:
 * [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
 */