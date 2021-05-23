
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;

public class Explode {
    double x;
    double y;
    static Image[] images = new Image[3];
    int count;

    static {
        for (int i = 0; i < images.length; i++) {
            images[i] = GameUtil.getImage("images/explosion_" + i + ".png");
            // images[i].getWidth(null);
        }
    }

    public void drawSelf(Graphics g) {
        if (count < 3) {
            g.drawImage(images[count], (int) x, (int) y, null);
            // 窗口显示图片是否正常
            System.out.println("爆炸图片" + count);
            count++;
        }
    }

    public Explode() {
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
