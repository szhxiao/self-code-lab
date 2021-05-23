
/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 游戏工具类
 */
public class GameUtil extends Frame {
    // 构造器私有，避免被构造对象
    private GameUtil() {
    }

    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL url = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bi;
    }

    public static void main(String[] args) {
        Image img = GameUtil.getImage("images/background.jpg");
        System.out.println(img);
    }
}
