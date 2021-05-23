/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */


/**
 * 递归算法完成阶乘
 */
public class SumOfJieTest {

    public static int jie(int value) {
        int mul = 1;
        for (int i = 1; i <= value; i++) {
            mul *= i;
        }
        return mul;
    }
    
    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += jie(i);
        }
        System.out.println(sum);
    }
}

/**
 * output:
 * 
 */