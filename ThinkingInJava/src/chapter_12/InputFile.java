/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.io.*;

/**
 * This program demonstrates paying attention to exceptions 
 * in constructors.
 */

public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch(FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        } catch(Exception e) {
            try {
                in.close();
            } catch(IOException e2) {
                System.out.println("in.close() unsucessful");
            }
            throw e;
        } finally {
            
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch(IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
}

/**
 * output:
 */