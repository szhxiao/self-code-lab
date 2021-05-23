
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.File;
import java.io.IOException;

/**
 * 测试File类
 */

public class FileTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) throws IOException {
        // 项目路径
        System.out.println(System.getProperty("user.dir"));
        // 新建文件
        File f1 = new File("test.txt");
        f1.createNewFile();

        // 创建目录
        File f2 = new File("./test/java");
        f2.mkdirs();
        // 删除java文件夹
        f2.delete();
    }
}

/**
 * output:
 * 
 */