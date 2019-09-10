package Weapon;

public class Rapid extends RangedWeaponDecorator{
    RangedWeapon rangedWeapon;

    public Rapid(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Скорострельный " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 3 * rangedWeapon.getDamage();
    }
}
