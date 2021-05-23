
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;
import java.awt.event.*;

public class Shell extends GameObject {
    double degree; // 指定角度

    public Shell() {
        x = 200;
        y = 200;

        degree = Math.random() * Math.PI * 2;

        width = 6;
        height = 6;

        speed = 3;
    }

    public void drawSelf(Graphics g) {
        Color color = g.getColor();

        g.setColor(Color.YELLOW);
        g.fillOval((int) x, (int) y, width, height);

        g.setColor(color);

        // 任意角度飞行
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);

        // 碰到边界时改变方向
        if (y > (ConstVar.GAME_HEIGHT - this.height) || y < 20) {
            degree = -degree;
        }

        if (x > (ConstVar.GAME_WIDTH - this.width) || x < 0) {
            degree = Math.PI - degree;
        }
    }
}
