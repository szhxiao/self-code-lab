/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试类
 */
public class Student {
    // 类属性
    private int id;
    private String name;
    private int age;

    // 构造方法
    Student() {}

    // 类方法
    public void study() {
        System.out.println("学生在学习");
    }

    public void play() {
        System.out.println("学生在玩");
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        // 创建对象
        Student st = new Student();
        st.study();
        st.play();
    }
}

/**
 * output:
 * 
 */