package classes;

import Weapon.RangedWeapon;
import interfaces.Humanoid;
import interfaces.Observer;
import interfaces.Subject;

public class Context implements Humanoid, Observer {

    private Humanoid contextStrategy;

    public void setContextStrategy(Humanoid contextStrategy) {
        this.contextStrategy = contextStrategy;
    }

    public Humanoid getContextStrategy() {
        return contextStrategy;
    }

    public void walk(int x1, int y1, int x2, int y2) {
        contextStrategy.walk(x1, y1, x2, y2);
    }

    public void talk() {
        contextStrategy.talk();
    }

    public Boolean recognizeALie(boolean statement) {
        return contextStrategy.recognizeALie(statement);
    }

    public void look() {
        contextStrategy.look();
    }

    @Override
    public void checkRangedWeapon() {
        contextStrategy.checkRangedWeapon();
    }

    @Override
    public void setRangedWeapon(RangedWeapon rangedWeapon) {
        contextStrategy.setRangedWeapon(rangedWeapon);
    }

    public int kick() {
       return contextStrategy.kick();
    }

    public void jump() {
        contextStrategy.jump();
    }

    public void run() {
        contextStrategy.run();
    }

    public void aim() {
        contextStrategy.aim();
    }

    public int shoot() {
        return contextStrategy.shoot();
    }

    public void relax() {
        contextStrategy.relax();
    }

    public void dead() {
        contextStrategy.dead();
    }

    public void decreaseHp(int hp) {
        contextStrategy.decreaseHp(hp);
    }

    public int getCurrentHp() {
        return contextStrategy.getCurrentHp();
    }

    @Override
    public int pushIntoPress() {
        return contextStrategy.pushIntoPress();
    }

    @Override
    public void update(int damage) {
        contextStrategy.decreaseHp(damage);
    }

    @Override
    public String getName() {
        return contextStrategy.getName();
    }
}
