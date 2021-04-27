/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program demonstrates data corruption
 * when multiple threads access a data sturcture.
 */
public class SynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while(true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                    //TODO: handle exception
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}

/*
test output:
Thread[Thread-49,5,main]
    194.59 from 49 to 56Total Balance:  100000.00
Thread[Thread-50,5,main]
    146.11 from 50 to 40Total Balance:  100000.00
Thread[Thread-42,5,main]
    982.71 from 42 to 99Total Balance:  100000.00
Thread[Thread-80,5,main]
    28.76 from 80 to 73Total Balance:  100000.00
Thread[Thread-56,5,main]
    289.52 from 56 to 63Total Balance:  100000.00
Thread[Thread-14,5,main]
    352.64 from 14 to 82Total Balance:  100000.00
Thread[Thread-13,5,main]
    968.67 from 13 to 6Total Balance:  100000.00

*/