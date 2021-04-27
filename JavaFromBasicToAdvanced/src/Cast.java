
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 类型转换
 */
public class Cast {
        public static void main(String[] args) {
                int foot;
                // int inch;
                double inch;
                Scanner in = new Scanner(System.in);
                foot = in.nextInt();
                // inch = in.nextInt();
                inch = in.nextDouble();
                System.out.println("foot = " + foot + ", inch = " + inch);
                // System.out.println((foot + inch / 12.0) * 0.3048);
                System.out.println((int) ((foot + inch / 12) * 0.3048 * 100) + "cm");
        }
}

/**
 * output:
 *
 */