/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Random;

/**
 * 生成0－100随机数，直到生成88为止，停止循环
 */
public class RandomNumberTest {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 方式1
        Random random = new Random();
        int number = 0;
        int i = 0;
        while (number != 88) {
            number = random.nextInt(100);
            i++;
        }
        System.out.println("第" + i + "次产生数" + number);

        // 方式2
        // Random random = new Random();
        // int number = 0;
        // int i = 0;
        // while (true) {
        //     number = random.nextInt(100);
        //     if (number == 88) {
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("第" + i + "次产生数" + number);
    }
}

/**
 * output:
 * 
 */