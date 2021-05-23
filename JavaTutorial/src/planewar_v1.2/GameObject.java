
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;

public class GameObject {
    Image image;
    // 坐标
    double x;
    double y;
    // 宽度和高度
    int width;
    int height;
    // 速度
    int speed;

    /**
     * @param plane
     * @param x
     * @param y
     * @param width
     * @param height
     * @param speed
     */
    public GameObject(Image image, double x, double y, int width, int height, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    /**
     * @param image
     * @param x
     * @param y
     * @param speed
     */
    public GameObject(Image image, double x, double y, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    /**
     * 
     */
    public GameObject() {
    }

    public Rectangle getRect() {
        return new Rectangle((int) x, (int) y, width, height);
    }

    public void drawSelf(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }

}
