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
public class WoodWind extends Wind3 {
    // Redefine interface method
    @Override
    public void play(Note note) {
        System.out.println("WoodWind.play() " + note);
    }

    @Override
    public String what() {
        return "WoodWind";
    }

    // @Override
    // public void adjust() {
    //     System.out.println("Adjusting Wind");
    // }
}