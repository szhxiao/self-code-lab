/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.lang.StringBuilder;

/**
 * 测试StringBuffer类
 */

public class StringBufferTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("我爱你中国");
        sb.insert(3, "，").insert(6, "！");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}

/**
 * output:
 * 
 */