/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class PetCount2 {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        PetCount.countPets(Pets.creator);
    }
}

/**
 * output:
 * Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat 
 * EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric 
 * {Pug=3, Rat=2, Cymric=5, Mouse=2, Cat=9, Manx=7, Rodent=5, Mutt=3, Dog=6, Pet=20, Hamster=1}
 */