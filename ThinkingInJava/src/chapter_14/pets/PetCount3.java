/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;

public class PetCount3 {
    static class PetCounter 
        extends LinkedHashMap<Class <? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair 
                : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair 
                : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");

            return result.toString();
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
    }
}

/**
 * output:
 * Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat 
 * EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric 
 * {Pug=3, Rat=2, Cymric=5, Mouse=2, Cat=9, Manx=7, Rodent=5, Mutt=3, Dog=6, Pet=20, Hamster=1}
 */