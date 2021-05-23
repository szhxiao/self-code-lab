/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("test_bufferwriter.txt"));
            bw.write("hello world");
            bw.newLine();
            bw.write("I miss you");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
