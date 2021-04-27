/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * A frame that contains a message panel.
 */
class NotHelloWorldFrame extends JFrame {
    /**
     * constructs NotHelloWorldFrame
     */
    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }
}

/**
 * A component that displays a message.
 */
class NotHelloWorldComponent extends JComponent {
    // set size of message
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    // set component size
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    /**
     * Set message
     */
    public void paintComponent(Graphics g) {
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }

    /**
     * Set component size
     */
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}