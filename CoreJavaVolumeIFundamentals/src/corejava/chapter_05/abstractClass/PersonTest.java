/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program demonstrates abstract classes.
 */
public class PersonTest {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}

/*
output:
Harry Hacker, an employee with a salary of ￥5000.00
Maria Morris, a student majoring in computer science
*/