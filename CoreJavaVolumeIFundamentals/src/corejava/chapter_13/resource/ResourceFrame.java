/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 * A frame that loads image and text resources.
 */
public class ResourceFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public ResourceFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        URL aboutURL = getClass().getResource("about.png");
        Image image = new ImageIcon(aboutURL).getImage();
        setIconImage(image);

        JTextArea textArea = new JTextArea();
        InputStream stream = getClass().getResourceAsStream("about.txt");
        try(Scanner in = new Scanner(stream, "UTF-8")) {
            while (in.hasNext()) {
                textArea.append(in.nextLine() + "\n");
            }
        }
        add(textArea);
    }
}