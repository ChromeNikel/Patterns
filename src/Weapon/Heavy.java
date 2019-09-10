package Weapon;

public class Heavy extends RangedWeaponDecorator{
    RangedWeapon rangedWeapon;

    public Heavy(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Тяжелый " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 3 * rangedWeapon.getDamage();
    }
}
