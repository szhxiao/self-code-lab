/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * A frame that restores position and size from user preferences
 * and updates the preferences upon exit.
 */
public class PreferencesFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private final Preferences root = Preferences.userRoot();
    private final Preferences node = root.node("corejava/chapter_13/preferences");

    public PreferencesFrame() {
        // get position, size, title from preferences
        final int left = node.getInt("left", 0);
        final int top = node.getInt("top", 0);
        final int width = node.getInt("width", DEFAULT_WIDTH);
        final int height = node.getInt("height", DEFAULT_HEIGHT);
        setBounds(left, top, width, height);

        // if no title given, ask user
        String title = node.get("title", "");
        if (title.equals("")) {
            title = JOptionPane.showInputDialog("Please supply a frame title: ");
        }
        if (title == null) {
            title = "";
        }
        setTitle(title);

        // set up file chooser that shows XML files
        final JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileFilter(new FileNameExtensionFilter("XML files", "xml"));

        // set up menus
        final JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem exportItem = new JMenuItem("Exprot preferences");
        menu.add(exportItem);
        exportItem.addActionListener(event -> {
            if(chooser.showSaveDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION) {
                try {
                    savePreferences();
                    OutputStream out = new FileOutputStream(chooser.getSelectedFile());
                    node.exportSubtree(out);
                    out.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        });

        JMenuItem importItem = new JMenuItem("Import preferences");
        menu.add(importItem);
        importItem.addActionListener(event -> {
            if(chooser.showOpenDialog(PreferencesFrame.this) == JFileChooser.APPROVE_OPTION) {
                try {
                    InputStream in = new FileInputStream(chooser.getSelectedFile());
                    Preferences.importPreferences(in);
                    in.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> {
            savePreferences();
            System.exit(0);
        });
    }

    public void savePreferences() {
        node.putInt("left", getX());
        node.putInt("right", getY());
        node.putInt("widht", getWidth());
        node.putInt("height", getHeight());
        node.put("title", getTitle());
    }
}