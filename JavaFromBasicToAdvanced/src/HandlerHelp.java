
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.HashMap;

/**
 * 
 */
public class HandlerHelp extends Handler {
    public HandlerHelp(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        System.out.println("迷路了吗？你可以做的命令有：go, bye, help");
        System.out.println("如：\t go east");
    }
}

/**
 * output:
 *
 */