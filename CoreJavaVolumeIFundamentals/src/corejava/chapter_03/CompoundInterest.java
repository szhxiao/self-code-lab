/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

/**
 * This program shows how to store tabular data in a 2D array.
 */
public class CompoundInterest {

    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 1000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }

        // compute interest fo future years 
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];
                // compute interest
                double interest = oldBalance * interestRate[j];
                // compute this year's balance
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100*interestRate[j]);
        }

        System.out.println();

        // print balance table
        for (double[] row : balances) {
            // print table row
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}

/*
output:

       10%       11%       12%       13%       14%       15%
  10000.00  10000.00  10000.00  10000.00  10000.00  10000.00
  11000.00  11100.00  11200.00  11300.00  11400.00  11500.00
  12100.00  12321.00  12544.00  12769.00  12996.00  13225.00
  13310.00  13676.31  14049.28  14428.97  14815.44  15208.75
  14641.00  15180.70  15735.19  16304.74  16889.60  17490.06
  16105.10  16850.58  17623.42  18424.35  19254.15  20113.57
  17715.61  18704.15  19738.23  20819.52  21949.73  23130.61
  19487.17  20761.60  22106.81  23526.05  25022.69  26600.20
  21435.89  23045.38  24759.63  26584.44  28525.86  30590.23
  23579.48  25580.37  27730.79  30040.42  32519.49  35178.76
 */