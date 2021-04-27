/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * {@code Employee} class.
 */
public class Employee {
    // static field
    private static int nextId = 1;
    
    private String name;
    private double salary;
    private int id;

    /**
     * constructs Employee object
     * 
     * @param name the employee's name
     * @param salary the employee's salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
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

    // set id to nextId, add 1 to nextId
    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;          // return static field
    }

    /**
     * unit test
     * 
     * @param args
     */
    public static void main(String[] args) {
        Employee employee = new Employee("Harry", 5000);
        System.out.println(employee.getName() + "\t" + employee.getSalary());
    }
}

/*
test output:
Harry	5000.0
 */