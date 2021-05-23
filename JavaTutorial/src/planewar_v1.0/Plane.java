
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;
import java.awt.event.*;

public class Plane extends GameObject {
    boolean left;
    boolean right;
    boolean up;
    boolean down;

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        // System.out.println("正在绘制飞机");
        // x += speed;
        if (left) {
            x -= speed;
        }
        if (right) {
            x += speed;
        }
        if (up) {
            y -= speed;
        }
        if (down) {
            y += speed;
        }

    }

    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            left = true;
            break;
        case KeyEvent.VK_RIGHT:
            right = true;
            break;
        case KeyEvent.VK_UP:
            up = true;
            break;
        case KeyEvent.VK_DOWN:
            down = true;
            break;

        }
    }

    public void minusDirection(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down = false;
        }
    }

    public Plane(Image image, double x, double y, int speed) {
        super(image, x, y, speed);
    }

}
