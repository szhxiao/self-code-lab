/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 用while, for循环分别计算100以内奇数和偶数的和，并输出
 */
public class NumbersSumTest {

    public static int sum1(int high) {
        int sum = 0;
        
        int i = 0;
        while (i < high) {
            if ((i % 2) == 0) {
                sum += i;
            }
            i++;
        }

        return sum;
    }

    public static int sum2(int high) {
        int sum = 0;

        for (int i = 0; i < high; i++) {
            if ((i % 2) == 1) {
                sum += i;
            }
        }

        return sum;
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        int sum1 = sum1(100);
        int sum2 = sum2(100);
        System.out.println("100以内偶数和：sum = " + sum1);
        System.out.println("100以内奇数和：sum = " + sum2);

    }
}

/**
 * output:
 * 100以内偶数和：sum = 2450
 * 100以内奇数和：sum = 2500
 */