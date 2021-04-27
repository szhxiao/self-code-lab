
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 数组搜索
 */
public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = { 3, 2, 5, 7, 4, 9, 11, 34, 12, 28 };
        int x = in.nextInt();
        int loc = -1;
        boolean isfound = false;
        for (int i = 0; i < data.length; i++) {
            if (x == data[i]) {
                loc = i;
                break;
            }
        }

        for (int k : data) {
            if (k == x) {
                isfound = true;
                break;
            }
        }

        if (loc > -1) {
            System.out.println(x + "是第" + (loc + 1) + "个数据");
        } else {
            System.out.println(x + "不在其中");
        }
    }
}

/**
 * output:
 *
 */