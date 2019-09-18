import Strategies.HumanStrategy;
import Strategies.RobotStrategy;
import Weapon.*;
import classes.Context;
import classes.RandomExplosion;
import classes.RandomMethod;

import java.io.IOException;

public class MainClass {

    public static void main(String [] args) throws IOException {

        Context humanContext = new Context();
        Context robotContext = new Context();

        humanContext.setContextStrategy(new HumanStrategy());
        robotContext.setContextStrategy(new RobotStrategy());

            RandomExplosion randomExplosion = new RandomExplosion();
            randomExplosion.registerObserver(humanContext);
            randomExplosion.registerObserver(robotContext);
            for (; ; ) {
                RandomMethod.getRandoomMethod(humanContext, robotContext);
                if (robotContext.getCurrentHp() <= 0)
                    break;
                RandomMethod.getRandoomMethod(robotContext, humanContext);
                if (humanContext.getCurrentHp() <= 0)
                    break;
                randomExplosion.generateRandomEvent();
                if (humanContext.getCurrentHp() <= 0 || robotContext.getCurrentHp() <= 0)
                    break;
            }
    }
}
