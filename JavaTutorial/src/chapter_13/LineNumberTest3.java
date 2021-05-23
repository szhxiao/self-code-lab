/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class LineNumberTest3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new InputStreamReader(
                new FileInputStream("data.txt")
            ));
            pw = new PrintWriter("data2.txt");

            String temp = "";
            int i = 1;
            while ((temp = br.readLine()) != null) {
                pw.println(i + "--> " + temp);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
