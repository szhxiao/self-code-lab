/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class PrintNumber {

    // public void printFlag(Generic<? extends Number> generic) {
    //     System.out.println(generic.getFlag());
    // }
    public void printFlag(Generic<? super Integer> generic) {
        System.out.println(generic.getFlag());
    }

    public static void main(String[] args) {
        // test extends
        PrintNumber pm = new PrintNumber();
        Generic<Integer> gi = new Generic<>();
        gi.setFlag(2021);
        pm.printFlag(gi);

        // test super
        Generic<Number> gm = new Generic<>();
        gm.setFlag(2.742);
        pm.printFlag(gm);
    }
}

/**
 * output:
 * 
 * 
 */