/**
 * Core Java Volume I-Fundamentals
 *
 * @version 10th
 * @author Cay S. Horstmann
 * @see http://horstmann.com/corejava
 */

import java.io.File;

import javax.swing.Icon;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/**
 * A file view that displays an icon for all files that match a file filter.
 */
public class FileIconView extends FileView {
    private FileFilter filter;
    private Icon icon;

    /**
     * Construct a FileIconView.
     * 
     * @param aFilter a file filter -- all files that this accepts 
     * will be shown with the icon
     * @param anIcon the icon shown with all accepted files
     */
    public FileIconView(FileFilter aFilter, Icon anIcon) {
        filter = aFilter;
        icon = anIcon;
    }

    public Icon getIcon(File f) {
        if (!f.isDirectory() && filter.accept(f)) {
            return icon;
        } else {
            return null;
        }
    }
}