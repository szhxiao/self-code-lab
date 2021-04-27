/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.time.LocalDate;
import java.util.Objects;

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
     * @param name   the employee's name
     * @param salary the salary
     * @param year   the hire year
     * @param month  the hire month
     * @param day    the hire day
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

    /**
     * equals
     * 
     * @param  otherObject the other object to be compared
     * @return true if the objects are identical; false otherwise
     */
    public boolean equals(Object otherObject) {

        // 1. a quick test to see if the objects are identical
        if (this == otherObject) {
            return true;
        }

        // 2. must return false if the explicit parameter is null
        if (otherObject == null) {
            return false;
        }

        // 3. if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // 4. now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;
        
        // test whether the fields have identical values
        return Objects.equals(name, other.name) && (salary == other.salary)
            && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * hashCode
     * 
     * @return hash code
     */
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    /**
     * toString
     * 
     * @return the object's information
     */
    public String toString() {
        return getClass().getName() + "[ name = " + name + ", salary = " + salary
            + ", hireDay = " + hireDay + " ]";
    }
}