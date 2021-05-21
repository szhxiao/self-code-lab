/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<User, String> map = new TreeMap<>();
        User u1 = new User("Jack", 21);
        User u2 = new User("Bloch", 29);
        map.put(u1, "Jack");
        map.put(u2, "Bloch");

        Set<User> keys = map.keySet();
        for (User user : keys) {
            System.out.println(user + " ---> " + map.get(user));
        }
        System.out.println("-----------");

        User u3 = new User("Admin", 21);
        map.put(u3, "John");
        System.out.println(map);

        System.out.println("-----------");

        Map<Student, String> smap = new TreeMap<>(new StudentComparator());
        Student s1 = new Student("kunlun", 21);
        Student s2 = new Student("song", 29);

        smap.put(s1, "kun");
        smap.put(s2, "song");

        Set<Student> skeys = smap.keySet();
        for (Student student : skeys) {
            System.out.println(student + "--->" + smap.get(student));
        }
    }
}
