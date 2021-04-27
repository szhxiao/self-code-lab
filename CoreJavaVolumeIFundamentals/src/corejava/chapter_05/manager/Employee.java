/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.LocalDate;

/**
 * Employee class.
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * Employee constructor
     * 
     * @param name the employee name
     * @param salary the employee salary
     * @param year year of employee's hireday
     * @param month month of employee's hireday
     * @param day day of employee's hireday
     */
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

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}