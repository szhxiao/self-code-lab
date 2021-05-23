/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("test_writer.txt");

            fw.write("Good morning, it's a nice day\n");
            fw.write("I'm reading Atomic Habits");
            
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
