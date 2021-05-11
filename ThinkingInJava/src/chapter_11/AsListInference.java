/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * This program demonstrates Arrays.asList() 
 * makes its best guess about type.
 */

class Snow {}

class Powder extends Snow {}

class Light extends Powder {}

class Heavy extends Powder {}

class Crusty extends Snow {}

class Slush extends Snow {}

public class AsListInference {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
            new Crusty(),
            new Slush(),
            new Powder()
        );

        List<Snow> snow2 = new ArrayList<>();
        Collections.addAll(snow2, new Light(), new Heavy());

        List<Snow> snow3 = Arrays.asList(new Light(), new Heavy());
    }
}

/**
 * output:
 * 
 */
