/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputTest {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = null;

        try {
            bos = new ByteArrayOutputStream();

            bos.write('a');
            bos.write('b');
            bos.write('c');

            byte[] arr = bos.toByteArray();

            for (int i = 0; i < arr.length; i++) {
                System.out.println((char) arr[i]);
            }
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
