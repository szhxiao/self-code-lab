
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

public class TryCatchTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
            char c1 = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println("" + c1 + c2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * output:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * ExceptionTest.main(ExceptionTest.java:24)
 */