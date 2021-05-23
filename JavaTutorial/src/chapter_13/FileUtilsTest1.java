/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.File;

import org.apache.commons.io.FileUtils;

public class FileUtilsTest1 {
    public static void main(String[] args) throws Exception {
        String content = FileUtils.readFileToString(new File("data.txt"), "utf-8");
        System.out.println(content);
    }
}
