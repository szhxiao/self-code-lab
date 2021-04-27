/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.*;
import javax.swing.*;

public class ColorChooserFrame extends JFrame {
    public ColorChooserFrame() {
        add(new ColorChooserPanel());
        pack();
    }
}