package Environment;

public class Pit implements Trap {

    public Pit() {
        System.out.println("Ловушка типа: Яма появилась");
    }

    @Override
    public String getName() {
        return "Это яма";
    }

    @Override
    public String getTarget() {
        return "Сара";
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
