
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

/**
 * 素数表
 */
public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 1. 构造素数表 int[] primes = new int[50]; primes[0] = 2; int count = 1; MAIN_LOOP:
         * for(int x = 3; count < 50; x++) { for(int i = 0; i < count; i++) { if(x %
         * primes[i] == 0) { continue MAIN_LOOP; } } primes[count++] = x; }
         * 
         * for(int k : primes) { System.out.print(k + " "); } System.out.println();
         */

        boolean[] isPrime = new boolean[100];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int k = 2; i * k < isPrime.length; k++) {
                    isPrime[i * k] = false;
                }
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

/**
 * output:
 *
 */