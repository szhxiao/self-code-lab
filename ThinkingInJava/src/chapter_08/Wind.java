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
public class Wind extends Instrument {
    // Redefine interface method
    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
}