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
public class DVD extends Item {

    // private String title;
    private String director;
    // private int numofTracks;
    // private int playingTime;
    // private boolean gotIt;
    // private String comment;

    public DVD(String title, String director, int playingTime, String comment) {
            super();
            // this.title = title;
            this.director = director;
            // this.playingTime = playingTime;
            // this.comment = comment;
        }


        public void print() {
            System.out.print("DVD --> ");
            super.print();
            System.out.println(" " + director);
        }

    public static void main(String[] args) {
        
    }
}

/**
 * output:
 *
 */