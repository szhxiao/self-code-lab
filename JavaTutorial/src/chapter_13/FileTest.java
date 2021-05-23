/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.File;

public class FileTest {
    public static void main(String[] args) throws Exception {
        // 创建File对象
        File file = new File("test.txt");
        // 创建文件
        boolean flag = file.createNewFile();
        System.out.println(flag);
        // 删除文件
        // file.delete();
        // 判断文件是否存在
        System.out.println("Is file exits: " + file.exists());
        // 获取文件名
        System.out.println("file name: " + file.getName());
    }
}
