/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * A frame with a button for changing look-and feel.
 */
public class PlafFrame extends JFrame {
    private JPanel buttonPanel;

    /**
     * constructs PlafFrame
     */
    public PlafFrame() {
        buttonPanel = new JPanel();

        // list all look-and feel
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos) {
            makeButton(info.getName(), info.getClassName());
        }

        add(buttonPanel);
        pack();
    }

    /**
     * Makes a button to change the pluggable look-and-feel.
     * 
     * @param name the button name
     * @param className the name of the look-and-feel class
     */
    private void makeButton(String name, String className) {
        // add button to panel
        JButton button = new JButton(name);
        buttonPanel.add(button);

        // set button action
        button.addActionListener(event -> {
            // button action: switch to the new look-and-feel
            try {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            } catch(Exception e) {
                e.printStackTrace();
            }
        });
    }
}