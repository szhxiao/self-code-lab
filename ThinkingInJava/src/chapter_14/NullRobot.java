/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.*;
import java.lang.reflect.*;

/**
 *
 */

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    
    private Robot proxied = new NRobot();

    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + "NullRobot";
    }

    private class NRobot implements Null, Robot {
        public String name() {
            return nullName;
        }

        public String model() {
            return nullName;
        }

        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    public Object invoke(Object proxy, 
        Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}

public class NullRobot {
    public static Robot newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
            NullRobot.class.getClassLoader(),
            new Class[] {Null.class, Robot.class},
            new NullRobotProxyHandler(type)
        );
    }

    /**
     * main()
     * 
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        Robot[] bots = {
            new SnowRemovalRobot("SnowBee"),
            newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot bot : bots) {
            Robot.Test.test(bot);
        }
    }
}

/**
 * output:
 * Robot name: SnowBee
 * Robot model: SnowBot Series 11
 * SnowBee can shovel snow
 * SnowBee shoveling snow
 * SnowBee can chip ice
 * SnowBee chipping ice
 * SnowBee can clear the roof
 * SnowBee clearing roof
 * [Null Robot]
 * Robot name: SnowRemovalRobotNullRobot
 * Robot model: SnowRemovalRobotNullRobot
 */