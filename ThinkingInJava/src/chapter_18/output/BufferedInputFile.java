
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 *
 */

import java.io.*;

public class BufferedInputFile {
    
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}

/*
output:

*/
