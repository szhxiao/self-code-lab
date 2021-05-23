/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.lang.StringBuilder;

/**
 * 测试StringBuilder类
 */

public class StringBuilderTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        String str = "core java";

        StringBuilder sb = null;
        sb = new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);

        for(int i = 0; i < 10; i++) {
            sb.append(i);
        }
    }
}

/**
 * output:
 * 
 */