package Environment;

public class HumanEventFactory implements EnvironmentFactory{
    @Override
    public Trap createTrap() {
        return new Pit();
    }

    public Heal createHealObject() {
        return new Food();
    }

    @Override
    public Ammo createAmmo() {
        return new Ammo();
    }

    @Override
    public int getChance() {
        return 50;
    }
}
