/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates inheritance and upcasting.
 */
public class Music3 {
    public static void tune(Instrument3 instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument3[] e) {
        for (Instrument3 instrument : e) {
            tune(instrument);
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Instrument3[] orchestra = {
            new Wind3(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new WoodWind()
        };
        tuneAll(orchestra);
    }
}

/**
 * output:
 * Wind.play() MIDDLE_C
 * Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play() MIDDLE_C
 * WoodWind.play() MIDDLE_C
 */