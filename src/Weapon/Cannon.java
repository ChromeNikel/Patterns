package Weapon;

public class Cannon extends RangedWeapon {

    public Cannon() {
        name = "Пушка";
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
