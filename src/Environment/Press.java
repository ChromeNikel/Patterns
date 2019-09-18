package Environment;

public class Press implements Trap {

    public Press() {
        System.out.println("Ловушка типа: Пресс появилась");
    }
    @Override
    public String getName() {
        return "Пресс";
    }

    @Override
    public String getTarget() {
        return "Терминатор";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
