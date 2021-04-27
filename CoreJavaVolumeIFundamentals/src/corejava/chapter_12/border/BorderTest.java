/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.*;
import javax.swing.*;

public class BorderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BorderFrame();
            frame.setTitle("Border");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}