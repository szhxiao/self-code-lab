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
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LineNumberTest2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(
                new FileInputStream("data.txt")
            ));

            bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("convert_data.txt")
            ));

            String temp = "";
            int i = 1;

            while ((temp = br.readLine()) != null) {
                bw.write(i + "--> " + temp);
                bw.newLine();
                i++;
            }

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
