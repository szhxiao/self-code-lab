/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

class Customer {
    private static long counter = 1;
    private final long id = counter++;
    
    private Customer() {}

    public String toString() {
        return "Customer " + id;
    }

    /**
     * A method to produce Generator objects.
     */
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;
    
    private Teller() {}

    public String toString() {
        return "Teller " + id;    
    }

    public static Generator<Teller> generator = 
        new Generator<Teller>() {
            public Teller next() {
                return new Teller();
            }
        };
}
public class BankTeller {
    
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves" + c);
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);
        for(Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())), c);
        }
    }
}

/**
 * output:
 * Teller 3 servesCustomer 1
 * Teller 2 servesCustomer 2
 * Teller 3 servesCustomer 3
 * Teller 1 servesCustomer 4
 * Teller 1 servesCustomer 5
 * Teller 3 servesCustomer 6
 * Teller 1 servesCustomer 7
 * Teller 2 servesCustomer 8
 * Teller 3 servesCustomer 9
 * Teller 3 servesCustomer 10
 * Teller 2 servesCustomer 11
 * Teller 4 servesCustomer 12
 * Teller 2 servesCustomer 13
 * Teller 1 servesCustomer 14
 * Teller 1 servesCustomer 15
 */