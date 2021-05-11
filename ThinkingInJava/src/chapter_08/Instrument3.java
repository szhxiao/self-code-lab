/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * 
 */
public class Instrument3 {
    public void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}