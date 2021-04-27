
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 *
 */

import java.io.*;

public class MemoryInput {
    
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}

/*
output:

*/
