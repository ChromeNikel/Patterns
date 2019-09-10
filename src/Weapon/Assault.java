package Weapon;

public class Assault extends RangedWeaponDecorator{
    RangedWeapon rangedWeapon;

    public Assault(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Штуромовой " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 2 * rangedWeapon.getDamage();
    }
}
