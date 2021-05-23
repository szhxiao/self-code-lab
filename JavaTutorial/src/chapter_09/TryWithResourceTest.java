
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试try-catch
 */

public class TryWithResourceTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test.txt")) {
            char c1 = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c1 + c2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * output:
 * 
 * 
 */