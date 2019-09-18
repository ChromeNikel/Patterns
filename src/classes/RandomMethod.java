package classes;

import Environment.EventGenerator;
import Environment.HumanEventFactory;
import Weapon.*;

public class RandomMethod {

    int randomOne = 0;
    int randomTwo = 0;

    private static int getRandomIndex(int count) {
        return new java.util.Random().nextInt(count);
    }

    public static void getRandoomMethod(Context activeContext, Context passiveContext) {
        switch (getRandomIndex(11)) {
            case 0:
                passiveContext.decreaseHp(activeContext.kick());
                break;
            case 1:
                activeContext.run();
                break;
            case 2:
                activeContext.jump();
                break;
            case 3:
                activeContext.talk();
                break;
            case 4:
                activeContext.look();
                break;
            case 5:
                activeContext.aim();
                break;
            case 6:
                passiveContext.decreaseHp(activeContext.shoot());
                break;
            case 7:
                activeContext.relax();
                break;
            case 8:
                passiveContext.decreaseHp(activeContext.pushIntoPress());
                break;
            case 9:
                passiveContext.setRangedWeapon(getRandomWeapon());
                passiveContext.checkRangedWeapon();
                break;
            case 10:
                passiveContext.decreaseHp(new EventGenerator(passiveContext).generateEvent());
        }
    }

    public static RangedWeapon getRandomWeapon() {
        int typeRangedWeapon = getRandomIndex(3);
        int damageRangedWeapon = getRandomIndex(3);
        int baseRangedWeapon = getRandomIndex(3);

        RangedWeapon rangedWeapon = new Pistol();

        switch (baseRangedWeapon) {
            case 0:
                rangedWeapon = new Pistol();
                break;
            case 1:
                rangedWeapon = new Cannon();
                break;
            case 2:
                rangedWeapon = new Rifle();
                break;
        }

        switch (damageRangedWeapon) {
            case 0:
                rangedWeapon = new ElectroDamge(rangedWeapon);
                break;
            case 1:
                rangedWeapon = new FireDamge(rangedWeapon);
                break;
            case 2:
                rangedWeapon = new ColdDamge(rangedWeapon);
                break;
        }

        switch (typeRangedWeapon) {
            case 0:
                rangedWeapon = new Rapid(rangedWeapon);
                break;
            case 1:
                rangedWeapon = new Assault(rangedWeapon);
                break;
            case 2:
                rangedWeapon = new Heavy(rangedWeapon);
                break;
        }
        return rangedWeapon;
    }
}
