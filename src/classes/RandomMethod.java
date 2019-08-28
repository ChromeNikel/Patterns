package classes;

public class RandomMethod {

    int randomOne = 0;
    int randomTwo = 0;

    private static int getRandomIndex() {
        return new java.util.Random().nextInt(9);
    }

    public static void getRandoomMethod(Context activeContext, Context passiveContext) {
        switch (getRandomIndex()) {
            case 0:
                passiveContext.decreaseHp(activeContext.kick());
                break;
            case 1:
                activeContext.run();
                break;
            case 2:
                activeContext.jump();
                break;
            case 3:
                activeContext.talk();
                break;
            case 4:
                activeContext.look();
                break;
            case 5:
                activeContext.aim();
                break;
            case 6:
                passiveContext.decreaseHp(activeContext.shoot());
                break;
            case 7:
                activeContext.relax();
                break;
            case 8:
                passiveContext.decreaseHp(activeContext.pushIntoPress());
                break;
        }
    }
}
