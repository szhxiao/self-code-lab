/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * This program demonstrates a simple frame.
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            SimpleFrame frame = new SimpleFrame();
            // set the operation of clicking close 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame {
    // set the width and height of the window
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

