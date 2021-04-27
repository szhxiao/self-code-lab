/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}

/**
 * The program demonstrates the use of a map with key type String 
 * and value type Employee.
 */
public class MapTest {
    public static void main(String[] args) {
        // constructs a HashMap and add entries
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("576-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        // print all entries
        System.out.println(staff);

        // get and remove an entry
        staff.remove("576-24-2546");

        // replace an entry
        staff.put("456-62-5527", new Employee("Francesca Miller"));

        // look up a value
        System.out.println(staff.get("157-62-7935"));

        // iterate through all entries
        staff.forEach((k, v) ->
            System.out.println("key = " + k + ", value = " + v));
    }
}

/*
output:
{157-62-7935=Gary Cooper, 144-25-5464=Amy Lee, 456-62-5527=Francesca Cruz, 576-24-2546=Harry Hacker}
Gary Cooper
key = 157-62-7935, value = Gary Cooper
key = 144-25-5464, value = Amy Lee
key = 456-62-5527, value = Francesca Miller
*/