/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputTest {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(
                    new BufferedInputStream(new FileInputStream("output.txt")));
                
            // 直接读取数据，读取顺序一定要与写出数据一致
            System.out.println("char: " + dis.readChar());
            System.out.println("int: " + dis.readInt());
            System.out.println("double: " + dis.readDouble());
            System.out.println("String: " + dis.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
