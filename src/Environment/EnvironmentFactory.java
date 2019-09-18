package Environment;

public interface EnvironmentFactory {
    Trap createTrap();

    Heal createHealObject();

    Ammo createAmmo();

    int getChance();

}
