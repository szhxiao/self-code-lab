/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */


public class PrintMsg {
    
    public void printFlag(Generic<?> generic) {
        System.out.println(generic.getFlag());
    }

    public static void main(String[] args) {
        PrintMsg pm = new PrintMsg();
        Generic<Integer> gi = new Generic<>();
        gi.setFlag(2021);
        pm.printFlag(gi);

        Generic<String> gs = new Generic<>();
        gs.setFlag("hello");
        pm.printFlag(gs);
    }
}

/**
 * output:
 * 
 * 
 */