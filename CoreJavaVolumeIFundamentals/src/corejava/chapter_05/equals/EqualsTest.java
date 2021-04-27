/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */


/**
 * This program demonstrates the equals method.
 */
public class EqualsTest {
    public static void main(String[] args) {

        Employee alice1 = new Employee("Alice Adams", 7500, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 7500, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 5000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));

        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 8000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("carl.toString(): " + carl);
        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));

        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}

/*
output:
alice1 == alice2: true
alice1 == alice3: false
alice1.equals(alice3): true
alice1.equals(bob): false
bob.toString(): Employee[ name = Bob Brandson, salary = 5000.0, hireDay = 1989-10-01 ]
carl.toString(): Manager[ name = Carl Cracker, salary = 8000.0, hireDay = 1987-12-15 ][ bonus = 0.0 ]
boss.toString(): Manager[ name = Carl Cracker, salary = 8000.0, hireDay = 1987-12-15 ][ bonus = 5000.0 ]
carl.equals(boss): false
alice1.hashCode(): -916556974
alice3.hashCode(): -916556974
bob.hashCode(): -731457450
carl.hashCode(): -447977843
*/