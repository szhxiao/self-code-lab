/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileReader;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader frd = null;

        try {
            frd = new FileReader("data.txt");
            
            int temp = 0;

            while ((temp = frd.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (frd != null) {
                    frd.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
