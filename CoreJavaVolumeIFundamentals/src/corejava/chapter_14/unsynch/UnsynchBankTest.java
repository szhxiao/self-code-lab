/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program demonstrates data corruption
 * when multiple threads access a data structure.
 */
public class UnsynchBankTest {
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
Thread[Thread-8,5,main]
    789.95 from 8 to 6Total Balance:   99046.02
Thread[Thread-40,5,main]
    259.43 from 40 to 13Total Balance:   99046.02
    478.37 from 43 to 44Total Balance:   99524.39
Thread[Thread-94,5,main]
    235.65 from 94 to 29Total Balance:   99524.39
Total Balance:  100000.00
Thread[Thread-1,5,main]
    997.75 from 1 to 49Total Balance:   99524.39
Thread[Thread-18,5,main]
    164.27 from 18 to 34Total Balance:   99524.39
Thread[Thread-14,5,main]
    701.16 from 14 to 80Total Balance:   99524.39
Thread[Thread-23,5,main]
Thread[Thread-68,5,main]
    55.39 from 68 to 56Total Balance:   99420.47
Thread[Thread-30,5,main]
    361.14 from 30 to 89Total Balance:   99420.47
*/