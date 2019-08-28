import Strategies.HumanStrategy;
import Strategies.RobotStrategy;
import classes.Context;
import classes.RandomMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String [] args) throws IOException {
//        Context humanContext = new Context();
//        Context robotContext = new Context();
//
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String strategy = br.readLine();
////        if(strategy.equals("Робот"))
////            humanContex.setContextStrategy(new RobotStrategy());
////
////        if(strategy.equals("Человек"))
////            humanContex.setContextStrategy(new HumanStrategy());
//        humanContext.setContextStrategy(new RobotStrategy());
//        robotContext.setContextStrategy(new HumanStrategy());

            Context humanContext = new Context();
            Context robotContext = new Context();

            humanContext.setContextStrategy(new RobotStrategy());
            robotContext.setContextStrategy(new HumanStrategy());

            for (; ; ) {
                RandomMethod.getRandoomMethod(humanContext, robotContext);
                if (robotContext.getCurrentHp() <= 0)
                    break;
                RandomMethod.getRandoomMethod(robotContext, humanContext);
                if (humanContext.getCurrentHp() <= 0)
                    break;
            }
    }
}
