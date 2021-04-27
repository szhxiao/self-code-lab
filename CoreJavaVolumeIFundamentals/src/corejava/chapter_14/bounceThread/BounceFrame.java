/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * BounceFrame with panel and buttons.
 */
public class BounceFrame extends JFrame {
    private BallComponent comp;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    /**
     * Construct the frame with the component for showing the bouncing ball
     * and Start and Close buttons.
     */
    public BounceFrame() {
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel, "Start", event -> addBall());
        addButton(buttonPanel, "Close", event -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    /**
     * Add a button to a container.
     * 
     * @param container the container
     * @param title the button title
     * @param listener the action listener for the button
     */
    public void addButton(Container container, String title, ActionListener listener) {
        JButton button = new JButton(title);
        container.add(button);
        button.addActionListener(listener);
    }

    /**
     * Add a bouncing ball to the canvas and start a thread to make it bounce.
     */
    public void addBall() {
        Ball ball = new Ball();
        comp.add(ball);
        
        Runnable r = () -> {
            try {
                for (int i = 1; i < STEPS; i++) {
                    ball.move(comp.getBounds());
                    comp.repaint();
                    Thread.sleep(DELAY);
                }
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
    
}