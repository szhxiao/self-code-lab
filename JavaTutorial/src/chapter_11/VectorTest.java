/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // 实例化Vector
        List<String> v = new Vector<>();
        v.add("hello");
        v.add("world");
        v.add("java");
        v.add("javascript");

        // 遍历
        for (String s : v) {
            System.out.println(s);
        }
        System.out.println("---------------");
    }
}
