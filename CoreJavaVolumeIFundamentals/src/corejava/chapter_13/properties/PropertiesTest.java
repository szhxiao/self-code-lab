/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates properties.
 */
public class PropertiesTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new PropertiesFrame();
            frame.setVisible(true);
        });
    }
}