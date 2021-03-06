/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 * A file chooser accessory that previews images.
 */
public class ImagePreviewer extends JLabel {
    /**
     * Construct an ImagePreviewer.
     * 
     * @param chooser the file chooser whose property changes trigger 
     * an image change in this previewer
     */
    public ImagePreviewer(JFileChooser chooser) {
        setPreferredSize(new Dimension(100, 100));
        setBorder(BorderFactory.createEtchedBorder());

        chooser.addPropertyChangeListener(event -> {
            if (event.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
                // select a new file
                File f = (File) event.getNewValue();
                if (f == null) {
                    setIcon(null);
                    return;
                }

                // read the image into an icon
                ImageIcon icon = new ImageIcon(f.getPath());

                // if the icon is too large to fit, scale it
                if (icon.getIconWidth() > getWidth()) {
                    icon = new ImageIcon(icon.getImage().getScaledInstance(
                        getWidth(), -1, Image.SCALE_DEFAULT));
                }

                setIcon(icon);
            }
        });
    }
}