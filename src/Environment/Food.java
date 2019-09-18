package Environment;

public class Food implements Heal{

    public Food() {
        System.out.println("Объект типа лечения типа \"Еда\" появился");
    }

    @Override
    public String getName() {
        return "Еда";
    }

    @Override
    public String getTarget() {
        return "Сара";
    }

    @Override
    public int getHeal() {
        return 7;
    }
}
