/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BasicObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream("basic_output.txt")));
                
            // 读取顺序必须与写入顺序一致
            System.out.println("int: " + ois.readInt());
            System.out.println("double: " + ois.readDouble());
            System.out.println("char: " + ois.readChar());
            System.out.println("String: " + ois.readUTF());
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
