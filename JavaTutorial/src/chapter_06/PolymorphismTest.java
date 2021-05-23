/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

/**
 * 测试多态
 */

class Animal {
    int age;

    public void shout() {
        System.out.println("make noise");
    }
}

class Dog extends Animal {
    int age = 20;

    public void shout() {
        System.out.println("Dog is shouting");
    }
}

class Cat extends Animal {
    int age = 5;

    public void shout() {
        System.out.println("Cat is shouting");
    }
}

public class PolymorphismTest {
    static void animalCry(Animal animal) {
        animal.shout();
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Animal dog = new Dog();
        // 调用属性时没有多态，仍是基类属性
        System.out.println(dog.age);
        // 调用方法时具有多态
        animalCry(dog);
        Animal cat = new Cat();
        cat.shout();
    }
}

/**
 * output:
 * 0
 * Dog is shouting
 * Cat is shouting
 */