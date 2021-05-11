/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates abstract classes and methods.
 */

abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();

}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {}
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {}
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {}
}

class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    public String what() {
        return "Woodwind";
    }
}


public class MusicAbstractClass {
    static void tune (Instrument i) {
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
 * Wind.play() MIDDLE_C
 * Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play()MIDDLE_C
 * Woodwind.play()MIDDLE_C
 */
