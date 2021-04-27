/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.*;
import javax.swing.*;

public class ColorChooserTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ColorChooserFrame();
            frame.setTitle("ColorChooserTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

