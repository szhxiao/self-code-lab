/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
        int c;
        while((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}

/**
 * output:
 * 
 */
