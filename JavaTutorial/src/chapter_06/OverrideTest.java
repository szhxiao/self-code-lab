/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试方法重写
 */

class Vehicle {
    public void run() {
        System.out.println("run");
    }

    public void stop() {
        System.out.println("stop");
    }
}

class Car extends Vehicle {

}

public class OverrideTest {
    

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
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