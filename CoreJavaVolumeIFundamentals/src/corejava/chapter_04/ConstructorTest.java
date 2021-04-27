/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Random;

/**
 * This program demonstrates object construction.
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Empployee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 4000);
        staff[1] = new Employee(8000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", id = " + e.getId()
                + ", salary = " + e.getSalary());
        }
    }
}

/**
 * Employee class
 */
class Employee {
    // static field
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    // static initialization block
    static {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(100000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    /**
     * three overloaded constructors
     */
    // the default constructor
    public Employee() {
        // name = ""
        // salary = 0.0
        // id
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double s) {
        // calls the Employee(String name, double salary) constructor
        this("Employee #" + nextId, s);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

/*
output:
name = Harry, id = 55534, salary = 4000.0
name = Employee #55535, id = 55535, salary = 8000.0
name = , id = 55536, salary = 0.0
*/