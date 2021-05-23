/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile("random_data.txt", "rw");

            int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
            for (int i = 0; i < arr.length; i++) {
                raf.writeInt(arr[i]);
            }

            raf.seek(4);
            System.out.println(raf.readInt());

            // 隔一个读一个
            for (int i = 0; i < arr.length; i += 2) {
                raf.seek(i * 4);
                System.out.print(raf.readInt() + "\t");
            }
            System.out.println();

            // 替换数据
            raf.seek(16);
            raf.writeInt(45);
            for (int i = 0; i < arr.length; i++) {
                raf.seek(i * 4);
                System.out.print(raf.readInt() + "\t");
            }
            System.out.println();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
