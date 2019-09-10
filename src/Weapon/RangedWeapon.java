package Weapon;

public abstract class RangedWeapon {
    String name = "Шута";

    public String getName() {
        return name;
    }

    public abstract int getDamage();
}
