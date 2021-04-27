
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;
import java.util.HashMap;

/**
 * 对象数组
 */
public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<>();

    public Coin() {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dolar");
    }

    public String getName(int amount) {
        if (coinnames.containsKey(amount)) {
            return coinnames.get(amount);
        } else {
            return "NOT FOUND";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(amount + " --> " + name);
    }
}

/**
 * output:
 *
 */