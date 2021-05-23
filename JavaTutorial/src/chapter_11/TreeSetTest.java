/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        // add()
        set.add("python");
        set.add("java");
        set.add("lisp");
        set.add("lisp");
        set.add("c");

        // get()
        for (String str : set) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("***************");

        Set<User> su = new TreeSet<>();
        User user1 = new User("root", 18);
        User user2 = new User("hello", 29);
        User user3 = new User("admin", 29);
        su.add(user1);
        su.add(user2);
        su.add(user3);

        for (User user : su) {
            System.out.println(user);
        }

        System.out.println("***************");
        
        Set<Student> ss = new TreeSet<>(new StudentComparator());
        Student s1 = new Student("java", 27);
        Student s2 = new Student("c", 40);
        Student s3 = new Student("javascript", 27);
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);

        for (Student student : ss) {
            System.out.println(student);
        }
    }
}
