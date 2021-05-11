/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Tests for end of file while reading a byte at a time.
 */
public class EOFTest {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("EOFTest.java")));
        while (in.available() != 0) {
            System.out.print((char)in.readByte());
        }
    }
}

/**
 * output:
 * 
 */
