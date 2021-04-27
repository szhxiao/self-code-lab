/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 3500);
        staff[1] = new Employee("Carl Cracher", 7500);
        staff[2] = new Employee("Tony Tester", 4500);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println(
                "name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}

/*
output:
name = Harry Hacker, salary = 3500.0
name = Tony Tester, salary = 4500.0
name = Carl Cracher, salary = 7500.0
 */