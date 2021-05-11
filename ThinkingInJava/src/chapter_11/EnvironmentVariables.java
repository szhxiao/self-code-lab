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

import java.util.*;

public class EnvironmentVariables {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

/**
 * output:
 * 
 */
