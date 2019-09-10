import Strategies.HumanStrategy;
import Strategies.RobotStrategy;
import Weapon.*;
import classes.Context;
import classes.RandomExplosion;
import classes.RandomMethod;

import java.io.IOException;

public class MainClass {

    public static void main(String [] args) throws IOException {

//        RangedWeapon rangedWeapon0 = new Pistol();
//        System.out.println(rangedWeapon0.getName() + " " + rangedWeapon0.getDamage());
//
//        RangedWeapon rangedWeapon2 = new Pistol();
//        rangedWeapon2 = new ElectroDamge(rangedWeapon2);
//        rangedWeapon2 = new Heavy(rangedWeapon2);
//        System.out.println(rangedWeapon2.getName() + " " + rangedWeapon2.getDamage());
//
//        RangedWeapon rangedWeapon1 = new Rifle();
//        rangedWeapon1 = new FireDamge(rangedWeapon1);
//        rangedWeapon1 = new Assault(rangedWeapon1);
//        System.out.println(rangedWeapon1.getName() + " " + rangedWeapon1.getDamage());
//
//        RangedWeapon rangedWeapon3 = new Cannon();
//        rangedWeapon3 = new ElectroDamge(rangedWeapon3);
//        rangedWeapon3 = new Rapid(rangedWeapon3);
//        System.out.println(rangedWeapon3.getName() + " " + rangedWeapon3.getDamage());

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
