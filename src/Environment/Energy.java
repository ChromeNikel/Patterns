package Environment;

public class Energy implements Heal {

    public Energy() {
        System.out.println("Объект типа лечения типа \"Энергия\" появился");
    }

    @Override
    public String getName() {
        return "Энергия";
    }

    @Override
    public String getTarget() {
        return "Терминатор";
    }

    @Override
    public int getHeal() {
        return 5;
    }
}
