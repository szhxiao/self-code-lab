/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 *         Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

public class LookupCSV {
    private LookupCSV() {
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        // Scanner in = new Scanner(System.in);

        int keyFiled = Integer.parseInt(args[1]);
        int valueFiled = Integer.parseInt(args[2]);

        RedBlackBST<String, String> tm = new RedBlackBST<>();

        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] tokens = line.split(",");
            String key = tokens[keyFiled];
            String value = tokens[valueFiled];
            tm.put(key, value);
        }

        while (!StdIn.isEmpty()) {
            String query = StdIn.readString();
            if (tm.contains(query)) {
                System.out.println(tm.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

/**
 * command:
 * javac LookupCSV.java
 * java LookupCSV ipcsv 1 0
 * 
 * output:
 * 
 */