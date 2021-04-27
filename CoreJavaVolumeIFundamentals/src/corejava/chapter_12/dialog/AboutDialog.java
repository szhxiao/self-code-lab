/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A sample modal dialog that displays a message
 * and waits for the user to click the OK button.
 */
public class AboutDialog extends JDialog {
    /**
     * Construct About dialog.
     * 
     * @param owner the super frame
     */
    public AboutDialog(JFrame owner) {
        super(owner, "About DialogTest", true);

        // add HTML label to center
        add (
            new JLabel("<html><h1><i>Core Java</i></h1><hr>By Cay Horstmann</html>"),
            BorderLayout.CENTER
        );

        // click OK button to cclose the dialog
        JButton ok = new JButton("OK");
        ok.addActionListener(event -> setVisible(false));

        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);

        pack();
    }
}