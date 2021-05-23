/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("BufferedReaderTest.java"));

            String temp = "";

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
