package Weapon;

public class Rifle extends RangedWeapon{

    public Rifle() {
        name = "Винтовка";
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
