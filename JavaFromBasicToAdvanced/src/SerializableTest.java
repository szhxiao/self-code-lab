
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */

class Student implements Serializable {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + ", " + age + ", " + grade;
    }
}

public class SerializableTest {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("John", 18, 12);
            System.out.println(s1);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.dat"));
            out.writeObject("s1 --> " + s1);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.dat"));
            Student s2 = (Student) in.readObject();
            System.out.println("s2 --> " + s2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/**
 * output:
 *
 */