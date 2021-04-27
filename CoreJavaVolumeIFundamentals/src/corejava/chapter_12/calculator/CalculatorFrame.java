/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        add(new CalculatorPanel());
        pack();
    }
}