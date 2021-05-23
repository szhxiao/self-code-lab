/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("object.txt"));
                
            User u1 = new User(1, "hello", 20);
            oos.writeObject(u1);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
