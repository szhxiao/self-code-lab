/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试数组
 */

public class CharArrayTest {
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        char[] s = new char[26];

        for (int i = 0; i < s.length; i++) {
            s[i] = (char) ('A' + i);
        }

        // 输出数组
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}

/**
 * output:
 * A 
 * B C D E F 
 * G H I J K 
 * L M N O P 
 * Q R S T U 
 * V W X Y Z
 */