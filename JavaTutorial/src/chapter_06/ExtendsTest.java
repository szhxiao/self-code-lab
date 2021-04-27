/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试继承
 */

class Person {
    String name;        // 姓名
    String sex;         // 性别
    int height;      // 身高

    public void rest() {
        System.out.println("take a rest.");
    }
}

class Student extends Person {
    String major;
    
    public void study() {
        System.out.println("go to study.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

public class ExtendsTest {
    

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setSex("female");
        student.setHeight(178);
        student.setMajor("Program");
        student.rest();
        student.study();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
    }
}

/**
 * output:
 * take a rest.
 * go to study.
 * true
 * true
 * true
 */