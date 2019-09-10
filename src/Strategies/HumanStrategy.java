package Strategies;

import Weapon.RangedWeapon;
import interfaces.Humanoid;

public class HumanStrategy implements Humanoid {

    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private int hp = 20;

    private int aimDamage = 0;
    private int baseShootDamage = 2;
    private String rangedWeaponName = "дробовик";
    private RangedWeapon rangedWeapon;

    @Override
    public void walk(int x1, int y1, int x2, int y2) {
        System.out.println(String.format("Иди как человек из точки (%s:%s) в точку (%s:%s)", x1, y1, x2, y2));
    }

    @Override
    public void talk() {
         System.out.println(ANSI_BLUE + "Сара Конор: Спасите!!" + ANSI_RESET);
    }

    @Override
    public Boolean recognizeALie(boolean statement) {
        return true;
    }

    @Override
    public void look() {
        System.out.println(ANSI_BLUE + "Сара Конор: Ищу безумного робота" + ANSI_RESET);
    }

    @Override
    public void checkRangedWeapon() {
        System.out.println(String.format(
                ANSI_BLUE + "Сара Конор: Теперь я вооружена %s. Это оружие наносит: %s урона" + ANSI_RESET,
                rangedWeapon.getName(),
                rangedWeapon.getDamage()));
    }

    @Override
    public void setRangedWeapon(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
        baseShootDamage = rangedWeapon.getDamage();
        rangedWeaponName = rangedWeapon.getName();
        aimDamage = 0;
    }

    @Override
    public int kick() {
        System.out.println(ANSI_BLUE +"Сара Конор: Борюсь с терминатором, который пришел меня убить" + ANSI_RESET);
        System.out.println(ANSI_RED + "Сара Конор Наносит 2 урона" + ANSI_RESET);
        return 2;
    }

    @Override
    public void jump() {
        System.out.println(ANSI_BLUE + "Сара Конор: Прыгаю подальше от этого сумасшедшего робота" + ANSI_RESET);
    }

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Сара Конор: Спасаюсь бегством" + ANSI_RESET);
    }

    @Override
    public void aim() {
        System.out.println(ANSI_BLUE + "Сара Конор: Прицеливаюсь в генератор" + ANSI_RESET);
        aimDamage += 5;
    }

    @Override
    public int shoot() {
        int shootDamage = baseShootDamage + aimDamage;
        System.out.println(ANSI_BLUE + String.format("Сара Конор: Стреляю из %s", rangedWeaponName) + ANSI_RESET);
        System.out.println(ANSI_RED + String.format("Сара Конор наносит %s урона", shootDamage)+ ANSI_RESET);
        aimDamage = 0;
        return shootDamage;
    }

    @Override
    public void relax() {
        hp += 5;
        System.out.println(ANSI_GREEN + "Сара Конор: Легла вздремнуть" + ANSI_RESET);
    }

    @Override
    public void dead() {
        System.out.println("О нет, в глазах потемнело");
        System.out.println("---Сара Конор погибла---");
    }

    @Override
    public void decreaseHp(int damage) {
        hp -= damage;
        if (hp <= 0) {
            this.dead();
        }

    }

    @Override
    public int getCurrentHp() {
        return hp;
    }

    @Override
    public int pushIntoPress() {
        System.out.println(ANSI_BLUE + "Сара Конор: Сейчас расплющим железяку" + ANSI_RESET);
        System.out.println(ANSI_RED + "Сара Конор отправляет Терминатора под пресс на 7 урона" + ANSI_RESET);
        return 7;
    }

    @Override
    public String getName() {
        return "Сара Конор";
    }
}
