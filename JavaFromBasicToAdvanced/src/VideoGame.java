
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 */
public class VideoGame extends Item {

    private int numberOfPlayers;

    public VideoGame(String title, int playingTime, boolean gotIt, String comment, int number) {
        super(title, playingTime, gotIt, comment);
        numberOfPlayers = number;
    }

    public void print() {
        System.out.print("VideoGame --> ");
        super.print();
        // System.out.println(" " + director);
    }

    public static void main(String[] args) {

    }
}

/**
 * output:
 *
 */