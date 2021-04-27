
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import javax.swing.JPanel;
import java.awt.*;

/**
 * 
 */
public class View extends JPanel {

    private static final long serialVersionUID = -5258995676212660595L;
    private static final int GRID_SIZE = 16;
    private Field theField;

    public View(Field field) {
        theField = field;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = theField.get(row, col);
                if (cell != null) {
                    cell.draw(g, col * GRID_SIZE, row * GRID_SIZE, GRID_SIZE);
                }
            }
        }
    }
}

/**
 * output:
 *
 */