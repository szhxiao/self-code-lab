/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试super关键字
 */

class Father {
    protected int value;

    public void f() {
        this.value = 150;
        System.out.println("Father.value = " + value);
    }
}

class Child extends Father {
    private int value;

    public void f() {
        super.f();
        this.value = 120;
        System.out.println("Child.value = " + value);
        System.out.println("In Child, value = " + value);
        System.out.println("Use super, value = " + super.value);
    }
}

public class SuperTest {
    

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.f();
    }
}

/**
 * output:
 * Father.value = 150
 * Child.value = 120
 * In Child, value = 120
 * Use super, value = 150
 */