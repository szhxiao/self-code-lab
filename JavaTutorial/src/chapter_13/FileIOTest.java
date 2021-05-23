/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(new File("data.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dataout.txt")));

            String temp = "";
            int i = 1;

            while ((temp = br.readLine()) != null) {
                bw.write(i + "--> " + temp);
                bw.newLine();
                i++;
            }
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
