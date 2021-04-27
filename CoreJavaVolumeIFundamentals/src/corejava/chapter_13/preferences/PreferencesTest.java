/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
w
/**
 * This program demonstrates preference settings.
 * Program remembers the frame position, size, and title.
 */
public class PreferencesTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            PreferencesFrame frame = new PreferencesFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}