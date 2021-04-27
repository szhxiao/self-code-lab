/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a menu whose File->Connect action shows a password dialog.
 */
public class DataExchangeFrame extends JFrame {

    public static final int TEXT_ROWS = 20;
    public static final int TEXT_COLUMNS = 40;

    private PasswordChooser dialog = null;
    private JTextArea textArea;

    /**
     * Construct data exchange frame
     */
    public DataExchangeFrame() {
        // construct a File menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // add Connect menu items
        JMenuItem connectItem = new JMenuItem("Connect");
        connectItem.addActionListener(new ConnectAction());
        fileMenu.add(connectItem);

        // add Exit menu items
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(event -> System.exit(0));
        fileMenu.add(exitItem);

        textArea = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        pack();
    }

    /**
     * The Connect action pops up the password dialog.
     */
    private class ConnectAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // if first time, construct dialog
            if (dialog == null) {
                dialog = new PasswordChooser();
            }
            // set default values
            dialog.setUser(new User("yourname", null));

            // pop up dialog
            if (dialog.showDialog(DataExchangeFrame.this, "Connect")) {
                User u = dialog.getUser();
                textArea.append("user name = " + u.getName()
                    + ", password = " + (new String(u.getPassword())) + "\n");
            }
        }
    }
}