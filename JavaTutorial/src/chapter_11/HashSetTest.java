/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        // 实例化HashSet
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("Vim");
        set.add("Emacs");
        set.add("Atom");
        set.add("VScode");
        set.add("Vim");

        // 获取元素
        // Set中没有索引
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println("\n-----------");

        // 删除元素
        set.remove("Emacs");
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println("\n-----------");

        Set<User> su = new HashSet<>();

        User u1 = new User("Jack", 21);
        User u2 = new User("Bloch", 29);
        User u3 = new User("Jack", 21);
        su.add(u1);
        su.add(u2);
        su.add(u3);

        for (User user : su) {
            System.out.println(user);
        }
        System.out.println("---------------");
    }
}