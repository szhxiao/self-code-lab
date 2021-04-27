
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */
public class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<>();

    public Game() {
        handlers.put("go", new HandlerGo(this));
        handlers.put("bye", new HandlerBye(this));
        handlers.put("help", new HandlerHelp(this));
        createRooms();
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom;
        // 制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down", lobby);

        currentRoom = outside;
    }

    public void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门");
        } else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt() {
        System.out.println("你在" + currentRoom);
        System.out.print("出口有：");
        System.out.print(currentRoom.getExitDesc());
        System.out.println();
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler handler = handlers.get(words[0]);
            String value = "";
            if (words.length > 1) {
                value = words[1];
            }
            if (handler != null) {
                handler.doCmd(value);
                if (handler.isBye()) {
                    break;
                }
            }
            // if (words[0].equals("help")) {
            // printHelp();
            // } else if (words[0].equals("go")) {
            // goRoom(words[1]);
            // } else if (words[0].equals("bye")) {
            // break;
            // }
            //
        }
        in.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.showPrompt();
    }
}

/**
 * output:
 *
 */