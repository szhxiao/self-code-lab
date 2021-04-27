
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.ArrayList;

/**
 * 对象数组
 */
public class ObjectArray {

    public static void main(String[] args) {
        int[] ia = new int[10];
        String[] sa = new String[10];
        System.out.println(ia[0] + 2);
        // null
        System.out.println(sa[0]);
        // NullPointerException
        System.out.println(sa[0].length());
    }
}

/**
 * output:
 *
 */