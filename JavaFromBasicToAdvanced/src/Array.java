
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 数组
 */
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int x;
        // int[] numbers = new int[100];
        double sum = 0.0;
        int count = 0;
        double average = 0.0;

        // do {
        // x = in.nextInt();
        // numbers[count] = x;
        // if (x != -1) {
        // sum += x;
        // count++;
        // }
        // } while (x != -1);

        count = in.nextInt();
        if (count > 0) {
            int[] numbers = new int[count];
            for (int i = 0; i < count; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            average = sum / count;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
            System.out.println("average = " + average);
        }

        // if (count > 0) {
        // average = sum / count;
        // for(int i = 0; i < count; i++) {
        // if(numbers[i] > average) {
        // System.out.print(numbers[i] + " ");
        // }
        // }
        // System.out.println();
        // System.out.println("average = " + average);
        // }
    }
}

/**
 * output:
 *
 */