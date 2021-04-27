/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program demonstrates static methods.
 */
public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + ", id = " + e.getId()
                + ", salary = " + e.getSalary());
        }

        // calls static method
        int n = Employee.getNextId();
        System.out.println("Next avaliable id = " + n);
    }
}

/*
output:
name = Tom, id = 1, salary = 40000.0
name = Dick, id = 2, salary = 60000.0
name = Harry, id = 3, salary = 65000.0
Next avaliable id = 4
 */
