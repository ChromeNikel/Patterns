package Weapon;

public class ElectroDamge extends RangedWeaponDecorator {
    RangedWeapon rangedWeapon;

    public ElectroDamge(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    @Override
    public String getName() {
        return "Огненный " + rangedWeapon.getName();
    }

    @Override
    public int getDamage() {
        return 10 + rangedWeapon.getDamage();
    }
}
