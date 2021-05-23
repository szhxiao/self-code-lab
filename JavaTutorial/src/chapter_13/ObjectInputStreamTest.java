/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("object.txt"));
            User user = (User) ois.readObject();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
