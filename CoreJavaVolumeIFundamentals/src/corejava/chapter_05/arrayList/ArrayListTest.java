/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.ArrayList;

/**
 * This program demonstrates the ArrayList class.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        // fill the staff array with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 5000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 4000, 1990, 3, 15));

        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName()
                + ", salary = " + e.getSalary()
                + ", hireDay = " + e.getHireDay());
        }
    }
}

/*
output:
name = Carl Cracker, salary = 78750.0, hireDay = 1987-12-15
name = Harry Hacker, salary = 5250.0, hireDay = 1989-10-01
name = Tony Tester, salary = 4200.0, hireDay = 1990-03-15
*/