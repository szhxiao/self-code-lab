/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.*;

/**
 * This program tests Employee class.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // print out information about all employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName()
                + " salary = " + e.getSalary()+ " hireDay = " + e.getHireDay());
        }
    }
}


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * raise employee's salary by percent geted
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent /100;
        salary += raise;
    }
}

/*
output:
name = Carl Cracker salary = 78750.0 hireDay = 1987-12-15
name = Harry Hacker salary = 52500.0 hireDay = 1989-10-01
name = Tony Tester salary = 42000.0 hireDay = 1990-03-15
 */