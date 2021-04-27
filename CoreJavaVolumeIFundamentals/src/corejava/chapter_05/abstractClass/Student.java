/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * Student class.
 */
public class Student extends Person {
    private String major;

    /**
     * Student constructor
     * @param name  the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }
}