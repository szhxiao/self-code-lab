/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

/**
 * This program demonstrates using anonymous inner classes 
 * with the Game framework.
 */

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {}

    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess() {}

    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {
            
        }
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }

}

/**
 * output:
 * Checkers move 0
 * Checkers move 1
 * Checkers move 2
 * Chess move 0
 * Chess move 1
 * Chess move 2
 * Chess move 3
 */