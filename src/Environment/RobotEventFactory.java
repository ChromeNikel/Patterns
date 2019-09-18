package Environment;

public class RobotEventFactory implements EnvironmentFactory{
    public Trap createTrap() {
        return new Press();
    }

    @Override
    public Heal createHealObject() {
        return new Energy();
    }

    @Override
    public Ammo createAmmo() {
        return new Ammo();
    }

    @Override
    public int getChance() {
        return 10;
    }
}
