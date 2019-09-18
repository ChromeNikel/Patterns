package Environment;

import classes.Context;

import java.util.Random;

public class EventGenerator {
    private EnvironmentFactory factory;

    public EventGenerator(Context context) {
        if (context.getName().equals("Сара Конор"))
            this.factory = new HumanEventFactory();
        else
            this.factory = new RobotEventFactory();
    }

    public int generateEvent() {
        if (new Random().nextInt(100) < factory.getChance()) {
            Heal heal = factory.createHealObject();
            System.out.println(heal.getName() + " лечит " + heal.getTarget() +" на " + heal.getHeal());
            return heal.getHeal();
        }
        else {
            Trap trap = factory.createTrap();
            System.out.println(trap.getName() + " ранит " + trap.getTarget()+" на " + trap.getDamage());
            return trap.getDamage();
        }
    }

}


