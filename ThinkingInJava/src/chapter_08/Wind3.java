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
public class Wind3 extends Instrument3 {
    // Redefine interface method
    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}