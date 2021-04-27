
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.HashSet;

/**
 * 对象数组
 */
public class Set {

    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("first");
        s.add("second");
        s.add("third");
        s.add("first");
        System.out.println(s);
    }
}

/**
 * output:
 *
 */