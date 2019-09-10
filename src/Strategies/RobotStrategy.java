package Strategies;

import Weapon.RangedWeapon;
import interfaces.Humanoid;

public class RobotStrategy implements Humanoid {

    private int hp = 30;

    private int aimDamage = 0;
    private int baseShootDamage = 5;
    private int baseKickDamage = 5;

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public void walk(int x1, int y1, int x2, int y2) {
        System.out.println(String.format("Иди как робот из точки (%s:%s) в точку (%s:%s)", x1, y1, x2, y2));
    }

    @Override
    public void talk() {
        System.out.println(ANSI_PURPLE + "Терминатор: Уничтожить! Уничтожить!" + ANSI_RESET);
    }

    @Override
    public Boolean recognizeALie(boolean statement) {
        return false;
    }

    @Override
    public void look() {
        System.out.println(ANSI_PURPLE + "Терминатор: Выслеживаю кожанный мешок" + ANSI_RESET);
    }

    @Override
    public void checkRangedWeapon() {
        System.out.println(ANSI_PURPLE + "Терминатор: Теперь я вооружен своей яростью.\nУРОН УДВАИВАЕТСЯ!!!" + ANSI_RESET);
    }

    @Override
    public void setRangedWeapon(RangedWeapon rangedWeapon) {
        baseShootDamage *= 2;
        baseKickDamage *= 2;
        aimDamage *= 2;
    }

    @Override
    public int kick() {
        System.out.println(ANSI_PURPLE + "Терминатор: Бью кожанного ублюдка" + ANSI_RESET);
        System.out.println(ANSI_RED + String.format("Терминатор наносит %s урона", baseKickDamage) + ANSI_RESET);
        return baseKickDamage;
    }

    @Override
    public void jump() {
        System.out.println(ANSI_PURPLE + "Терминатор: Прыгаю за кожанным мешком" + ANSI_RESET);
    }

    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Терминатор: Бегу за кожанным мешком" + ANSI_RESET);
    }

    @Override
    public void aim() {
        System.out.println(ANSI_PURPLE + "Терминатор: Выцеливаю жалкого человечка" + ANSI_RESET);
        aimDamage += 2;
    }

    @Override
    public int shoot() {
        int shootDamage = baseShootDamage + aimDamage;
        System.out.println(ANSI_PURPLE + "Терминатор: Стреляю лазером" + ANSI_RESET);
        System.out.println(ANSI_RED + String.format("Терминатор наносит %s урона", shootDamage) + ANSI_RESET);
        aimDamage = 0;
        return shootDamage;
    }

    @Override
    public void relax() {
        hp += 2;
        System.out.println(ANSI_GREEN + "Терминатор: Села батарейка, заряжаюсь" + ANSI_RESET);
    }

    @Override
    public void dead() {
        System.out.println("Терминатор: Я еще вернусь!");
        System.out.println("---Терминатор уничтожен---");
    }

    @Override
    public void decreaseHp(int damage) {
        hp -= damage;
        if (hp <= 0)
            this.dead();
    }

    @Override
    public int getCurrentHp() {
        return hp;
    }

    @Override
    public int pushIntoPress() {
        return 0;
    }

    @Override
    public String getName() {
        return "Терминатор";
    }
}
