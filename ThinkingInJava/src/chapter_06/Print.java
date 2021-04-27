/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */
package net.mindview.util;

import java.io.*;

/**
 * {@code Print}
 * This program demonstrates printing methods 
 * that can be used without qualifiers, using static imports.
 */
public class Print {

    /**
     * Print with a newline.
     * 
     * @param object the object to print
     */
    public static void println(Object object) {
        System.out.println(object);
    }

    /**
     * Print with a newline by itself.
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Print with no line break.
     * 
     * @param object the object to print
     */
    public static void print(Object object) {
        System.out.print(object);
    }

    /**
     * The new printf().
     * 
     * @param format
     * @param args
     * @return
     */
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        
    }
}