
/**
 * Author: Bruce Eckel 
 * Thinking in Java
 * @version 4.0 
 */

/**
 * This program demonstrates interfaces.
 */

interface Instrument {
    int VALUE = 5;
    // Cannot have method definitions
    // Automatically public
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class MusicInterface {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}

/**
 * output:
 * Wind.play()MIDDLE_C
 * Percussion.play()MIDDLE_C
 * Stringed.play()MIDDLE_C
 * Brass.play()MIDDLE_C
 * Woodwind.play()MIDDLE_C
 */
