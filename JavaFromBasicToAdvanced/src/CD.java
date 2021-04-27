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
public class CD extends Item {

    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public CD(String title, String artist, 
        int numofTracks, int playingTime, String comment) {
            super(title, playingTime, false, comment);
            // this.title = title;
            this.artist = artist;
            this.numofTracks = numofTracks;
            // this.playingTime = playingTime;
            // this.comment = comment;
        }


        public void print() {
            System.out.println("CD --> " + title + ": " + artist);
        }

    public static void main(String[] args) {
        
    }
}

/**
 * output:
 *
 */