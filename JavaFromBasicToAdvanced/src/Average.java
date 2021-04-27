
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 平均数
 */
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        double average = 0.0;

        // number = in.nextInt();
        // while (number != -1) {
        // sum += number;
        // count++;
        // number = in.nextInt();
        // }
        do {
            number = in.nextInt();
            if (number != -1) {
                sum += number;
                count++;
            }
        } while (number != -1);

        if (count > 0) {
            average = (double) sum / count;
            System.out.println(average);
        }
    }
}

/**
 * output:
 *
 */