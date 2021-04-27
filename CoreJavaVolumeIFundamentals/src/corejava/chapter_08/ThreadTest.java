/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.io.File;
import java.util.Scanner;

public class ThreadTest {
    public static void main(String[] args) {
        new Block() {
            public void body() throws Exception {
                Scanner in = new Scanner(new File("ququx"), "UTF-8");
                while (in.hasNext()) {
                    System.out.println(in.next());
                }
            }
        }.toThread().start();
    }
}