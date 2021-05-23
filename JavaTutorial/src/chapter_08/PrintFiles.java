
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.File;
import java.util.Random;

/**
 * 测试递归
 */

public class PrintFiles {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        File f = new File("/home/szhxiao/Codespace/self-code-lab/JavaTutorial");
        printFile(f, 0);
    }

    /**
     * 打印文件信息
     * 
     * @param file  文件名称
     * @param level 层次数
     */
    static void printFile(File file, int level) {
        // 输出层次数
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }

        // 输出文件名
        if (file.isDirectory() || file.getName().endsWith(".java")) { // 过滤
            System.out.println(file.getName());
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                printFile(temp, level + 1);
            }
        }
    }
}

/**
 * output:
 * 
 */