/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

/**
 * The Collection.fill() & Collection.nCopies() methods
 */

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);

        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }
}

/**
 * output:
 * [StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello, 
 * StringAddress@3764951d Hello]
 * [StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!, 
 * StringAddress@7a81197d World!]
 */