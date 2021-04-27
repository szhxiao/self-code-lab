/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program demonstrates parameter passing in Java.
 */
public class ParamTest {
    public static void main(String[] args) {
        /**
         * Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Befor: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        /**
         * Test 2: Methods can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry", 5000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        /**
         * Test 3: Methods can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice", 7000);
        Employee b = new Employee("Bob", 6000);
        System.out.println("Befor swap: a = " + a.getName() + ", b = " + b.getName());
        swap(a, b);
        System.out.println("After swap: a = " + a.getName() + ", b = " + b.getName());
    }

    /**
     * Modify numeric parameters.
     * 
     * doesn't work
     */
    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    /**
     * Change the state of object parameters.
     * 
     * works
     */
    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());
    }

    /**
     * Attach new objects to object parameters.
     * 
     * doesn't work
     */
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End method: x = " + x.getName() + ", y = " + y.getName());
    }
}

class Employee {
    private String name;
    private double salary;

    /**
     * construct Employee object
     * 
     * @param name the employee's name
     * @param salary the employee's salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * raise employee's salary by geted percent
     * @param byPercent 
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent /100;
        salary += raise;
    }
}

/*
output:

Testing tripleValue:
Befor: percent = 10.0
End of method: x = 30.0
After: percent = 10.0

Testing tripleSalary:
Before: salary = 5000.0
End of method: salary = 15000.0
After: salary = 15000.0

Testing swap:
Befor swap: a = Alice, b = Bob
End method: x = Bob, y = Alice
After swap: a = Alice, b = Bob

*/