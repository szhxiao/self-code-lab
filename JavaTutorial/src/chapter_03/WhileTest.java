/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试while循环结构
 */
public class WhileTest {
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < 100) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
/*
output:

 */