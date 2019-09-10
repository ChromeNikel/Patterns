package Weapon;

public class Pistol extends RangedWeapon {

    public Pistol() {
        name = "Пистолет";
    }

    @Override
    public int getDamage() {
        return 2;
    }
}
