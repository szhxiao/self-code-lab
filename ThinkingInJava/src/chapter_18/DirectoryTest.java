/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.io.*;

public class DirectoryTest {
    
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);

        for(File file : Directory.local(".", "T.*")) {
            System.out.println(file);
        }

        System.out.println("------------------");
        
        for(File file : Directory.walk(".", "T.\\.java")) {
            System.out.println(file);
        }

        System.out.println("==================");

        for(File file : Directory.walk(".", ".*[Zz].*\\.class")) {
            System.out.println(file);
        }
    }
}

/**
 * output:
 * 
 */
