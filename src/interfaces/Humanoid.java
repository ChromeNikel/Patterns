package interfaces;

import Weapon.RangedWeapon;

public interface Humanoid {
    void walk(int x1, int y1, int x2, int y2);

    void talk();

    Boolean recognizeALie(boolean statement);

    void look();

    void checkRangedWeapon();

    void setRangedWeapon(RangedWeapon rangedWeapon);

    int kick();

    void jump();

    void run();

    void aim();

    int shoot();

    void relax();

    void dead();

    void decreaseHp(int hp);

    int getCurrentHp();

    int pushIntoPress();

    String getName();
}
