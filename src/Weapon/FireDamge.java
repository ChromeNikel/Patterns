package Weapon;

public class FireDamge extends RangedWeaponDecorator {
    RangedWeapon rangedWeapon;

    public FireDamge(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Огненный " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 5 + rangedWeapon.getDamage();
    }
}
