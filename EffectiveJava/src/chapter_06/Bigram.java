/**
 * Effective Java
 *
 * @version 2nd
 * @author Joshua Bloch
 * @see
 */

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;
    
    /**
     * @param first
     * @param second
     */
    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    
    // public boolean equals(Bigram bigram) {
    //     return bigram.first == first && bigram.second == second;
    // }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bigram)) {
            return false;
        }
        Bigram bigram = (Bigram) obj;
        return bigram.first == first && bigram.second == second;
    }


    @Override
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram(ch, ch));
            }
        }
        System.out.println(s.size());
    }
}
