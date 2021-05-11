/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class PetCount4 {

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}

/**
 * output:
 * Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau
 *  Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric 
 * {Rat=2, Cat=9, EgyptianMau=2, Mouse=2, Pet=20, Rodent=5, Mutt=3, Pug=3, Manx=7, Cymric=5, Dog=6, Hamster=1}
 */