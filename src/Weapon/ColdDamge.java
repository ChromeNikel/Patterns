package Weapon;

public class ColdDamge extends RangedWeaponDecorator {
    RangedWeapon rangedWeapon;

    public ColdDamge(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Огненный " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 1 + rangedWeapon.getDamage();
    }
}
