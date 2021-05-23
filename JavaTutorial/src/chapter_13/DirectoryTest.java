/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("test_directory");
        // 创建目录
        boolean flag = file.mkdir();
        System.out.println("create directory: " + flag);
        // 创建多级目录
        File files = new File("test/java");
        System.out.println("create directories: " + files.mkdirs());

        // 判断目录是否存在
        System.out.println("directory exits: " + files.exists());
        // 获取父级目录
        System.out.println(files.getParent());
        
    }
}
